
package io.grpc.communication.example;

import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.StatusRuntimeException;

/**
 * A simple client that requests a greeting from the {@link ServerTerminal}.
 */
public class ClientTerminal {
  private static final Logger logger = Logger.getLogger(ClientTerminal.class.getName());

  private final ManagedChannel channel;
  private final CommunicatorGrpc.CommunicatorBlockingStub blockingStub;

  /** Construct client connecting to HelloWorld server at {@code host:port}. */
  public ClientTerminal(String host, int port) {
    this(ManagedChannelBuilder.forAddress(host, port)
        // Channels are secure by default (via SSL/TLS). For the example we disable TLS to avoid
        // needing certificates.
        .usePlaintext(true)
        .build());
  }

  /** Construct client for accessing RouteGuide server using the existing channel. */
  ClientTerminal(ManagedChannel channel) {
    this.channel = channel;
    blockingStub = CommunicatorGrpc.newBlockingStub(channel);
  }

  public void shutdown() throws InterruptedException {
    channel.shutdown().awaitTermination(5, TimeUnit.SECONDS);
  }

  /** Say hello to server. */
  public void greet(String name) {
    logger.info("Will try to greet " + name + " ...");
    DigitalRequest request = DigitalRequest.newBuilder().setName(name).build();
    DigitalReply response;
    try {
      response = blockingStub.sendMessage(request);
    } catch (StatusRuntimeException e) {
      logger.log(Level.WARNING, "RPC failed: {0}", e.getStatus());
      return;
    }
    logger.info("Greeting: " + response.getMessage());
    try {
     response = blockingStub.sendMessageAgain(request);
   } catch (StatusRuntimeException e) {
    logger.log(Level.WARNING, "RPC failed: {0}", e.getStatus());
    return;
   }
   logger.info("Greeting: " + response.getMessage());

  }

  /**
   * Greet server. If provided, the first element of {@code args} is the name to use in the
   * greeting.
   */
  public static void main(String[] args) throws Exception {
    ClientTerminal client = new ClientTerminal("localhost", 50051);
    try {
      /* Access a service running on the local machine on port 50051 */
      String user = "DI World";
      if (args.length > 0) {
        user = args[0]; /* Use the arg as the name to greet if provided */
      }
      client.greet(user);
    } finally {
      client.shutdown();
    }
  }
}
