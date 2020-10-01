package com.corso.Dominio;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Server {
	
	int porta;
	ServerSocket server= null;
	Socket sock = null;
	ExecutorService pool;
	int clientCount=0;
	
	Server (int porta ) {
		this.porta=porta;

	}
	
	public void startServer() throws IOException {
		
	    pool=Executors.newFixedThreadPool(5);

		@SuppressWarnings("resource")
		ServerSocket server = new ServerSocket(porta);

		System.out.println("Server in attesa sulla porta : " +porta);
		    while(true) {
			sock=server.accept();
			clientCount++;
			
	        ServerThread runnable = new ServerThread(sock,clientCount, this);
	        pool.execute(runnable);
	        
		    }
		
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		
	
		Server server1 = new Server(5000);
		server1.startServer();
			
	}
	
	private static class ServerThread implements Runnable{
	
	@SuppressWarnings("unused")
	Server server;
	@SuppressWarnings("unused")
	Socket sock;
	BufferedReader in;
	@SuppressWarnings("unused")
	int id=0;
	String ricevi=null;
	PrintStream out;
	String invia=null;
	BufferedReader sc ;
	

	ServerThread(Socket sock,int id,Server server) throws IOException{
		this.sock=sock;
		this.server=server;
		
		System.out.println("Client connesso "+id);
		in=new  BufferedReader(new InputStreamReader(sock.getInputStream()));
		sc= new BufferedReader(new InputStreamReader(System.in));
		out=new  PrintStream(sock.getOutputStream());

	}
	
	
	


	@Override
	public void run() {
		// TODO Auto-generated method stub
			
	
			System.out.println("connesso");
			try {

				while(true) {
					
				ricevi=in.readLine();
				System.out.println(ricevi);
				
				
				invia=sc.readLine();
				out.println(invia);

				if(invia.equalsIgnoreCase("--out")) {
			    System.out.println("Disconnessione");
			    break;
				}
				
				}
				
				sock.close();
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			if(sock.isClosed()) {
				System.out.println("Server disconnesso");
				
			}
			
	
		
		
	}
		
	}
	
	
}
