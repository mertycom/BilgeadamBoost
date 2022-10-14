package com.bilgeadam.boost.week6;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
	private Socket socket;
	private ServerSocket server;
	private DataInputStream in;

	public Server(int port) {
		try {
			server = new ServerSocket(port);
			System.out.println("server started, waitng for client...");

			socket = server.accept();
			System.out.println("Client accepted");
			String line;
			in = new DataInputStream(new BufferedInputStream(socket.getInputStream()));
			do {
				line = in.readUTF();
				System.out.println(line);
			} while (line.equals("EXIT"));
				
			
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				socket.close();
				in.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}
	public static void main(String[] args) {
		Server server = new Server(3333);
	}
}
