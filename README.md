
grpc Example
==============================================

The example require grpc-java to already be built. 

You may want to read through the
[Quick Start Guide](https://grpc.io/docs/quickstart/java.html)
before trying out the example.

To build the example, run in this directory:

```
$ ./gradlew installDist
```

This creates the scripts `server-terminal` and `client-terminal` in
`build/install/grpc-java-poc/bin/` directory that run the example. Each
example requires the server to be running before starting the client.

For example, to try the hello world example first run:

```
$ ./build/install/grpc-java-poc/bin/server-terminal
```

And in a different terminal window run:

```
$ ./build/install/grpc-java-poc/bin/client-terminal
```


That's it!

Please refer to gRPC Java's [README](../README.md) and
[tutorial](https://grpc.io/docs/tutorials/basic/java.html) for more
information.


