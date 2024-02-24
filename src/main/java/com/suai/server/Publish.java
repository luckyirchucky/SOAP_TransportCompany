package com.suai.server;

import javax.xml.ws.Endpoint;

public class Publish {
    public static void main(String[] args) {
        Endpoint endpoint = Endpoint.publish("http://localhost:7777/transport", new TransportService());
        System.out.println(endpoint.isPublished());
    }
}