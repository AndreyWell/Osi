package org.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

import static org.example.Server.port;

public class Client {
    public static void main(String[] args) throws IOException {

        try (Socket clientSocket = new Socket("localhost", port);
             PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);
             BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()))
        ) {
            String name = "Netology.ru";
            out.println(name);

            String s = in.readLine();

            System.out.println(s);
        }
    }
}
