package org.example.server;
import jakarta.xml.ws.Endpoint;
import org.example.ws.BanqueService;
public class ServerJWS {
    public static void main(String[] args) {
        Endpoint.publish("http://localhost:2006/",new BanqueService());
        System.out.println("Server started at port 2006");
    }
}