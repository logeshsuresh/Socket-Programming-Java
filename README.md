# Introduction

-----------

This repository contains Java code for a simple client-server application using sockets. It includes a Server class and a Client class, which communicate over a network using TCP/IP sockets.

## Server

------

The `Server` class listens for incoming connections on a specified port (default: 8080). When a client connects, the server reads the client's message, echoes it back, and sends it back to the client. It runs indefinitely, accepting connections from multiple clients sequentially.

### To run the server:
```
`java Server`
```

## Client

------

The `Client` class connects to the server running on the localhost (127.0.0.1) and port 8080. It sends a message to the server and prints the response received from the server.

To run the client:
```
`java Client`
```

## What is a Socket?

-----------------

A socket is one endpoint of a two-way communication link between two programs running on the network. Sockets are used to establish a connection between a client and a server. In this context, a socket represents a communication channel that allows data to be exchanged between processes. 

## What is a Port?

---------------

A port is a communication endpoint that is used by network protocols to uniquely identify different applications or services running on a single host. Ports are assigned unique numbers ranging from 0 to 65535. Ports below 1024 are reserved for well-known services, while ports above 1024 are available for general use.

## What is a Host?

---------------

A host, in the context of networking, refers to any device that is connected to a network and has an IP address. Hosts can communicate with each other over the network using various protocols and communication channels.

