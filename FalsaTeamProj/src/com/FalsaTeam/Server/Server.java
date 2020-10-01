/*
 * @author HackinG
 * materiale sviluppato a scopo didattico e illustrativo
 */
package com.FalsaTeam.Server;

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

	ServerSocket server=null;
	Socket sock=null;
	ExecutorService pool=null;
	int clientCount=0;
	
	@SuppressWarnings("resource")
	public void serverStart() throws IOException {
		
		pool = Executors.newFixedThreadPool(5);
		ServerSocket server = new ServerSocket(5000);
		System.out.println("[1]Server Avviato in ascolto sulla porta : 5000");
		System.out.println("[2]Invia (--out) per interrompere il server");
		
		while(true) {//accetta..sempre..connessioni in entrata
		sock = server.accept();
		clientCount++;
		ServerThread runnable = new ServerThread(sock,clientCount,this);
		pool.execute(runnable);
		}
}
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		Server servers = new Server();
		servers.serverStart();
		
	}
	
	private static class ServerThread implements Runnable {
		int id;
		@SuppressWarnings("unused")
		Server server=null;
		Socket sock=null;
		BufferedReader in;
		PrintStream out;
		Scanner sc = new Scanner(System.in);
		String ric;
		
		ServerThread(Socket socket,int count,Server server ) throws IOException{
			this.server=server;
			this.sock=socket;
			this.id=count;
			
			in = new BufferedReader(new InputStreamReader(sock.getInputStream()));
			out = new PrintStream(sock.getOutputStream());
			
			System.out.println("[3]Utente connesso"+id+""+sock);
			
		}
		
		public void run() {
			@SuppressWarnings("unused")
			int x = 1;

			while(true) {
				try {
					
				ric=in.readLine();
				System.out.println("Client:" +ric);
				System.out.print("Server:");
				ric=sc.nextLine();
				out.println(ric);
				
				} catch (IOException e) {
			
					e.printStackTrace();
				}
				if(ric.equalsIgnoreCase("--out")) {
					System.out.println("Connessione Terminata");
					break;
				}
			}	
			try {
		
				sock.close();	
				
			} catch (IOException e) {
				e.printStackTrace();
			}
		}	
	}
}
