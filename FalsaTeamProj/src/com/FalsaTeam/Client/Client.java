/*
 * @author HackinG
 * materiale sviluppato a scopo didattico e illustrativo
 * prossimo aggiornamento, aggiungere String nomeUtente come ho fatto con clientCount.
 * primo tentativo metodo get nome.
 */

package com.FalsaTeam.Client;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;
import java.net.UnknownHostException;
import javax.swing.JOptionPane;
@SuppressWarnings("unused")
public class Client {
	
	Socket sock;
	
	public static void main(String[] args) throws IOException  {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Socket sock = new Socket("127.0.0.1",5000);
		BufferedReader in = new BufferedReader(new InputStreamReader(sock.getInputStream()));
		BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
		PrintStream out = new PrintStream(sock.getOutputStream());
		String invia;
		String ricevi;
		String nome="";
		
		while(true) {
			
			if(nome.length() <= 3) {
		nome = JOptionPane.showInputDialog("inserisci il tuo nome utente");
			}
			
		    System.out.print(nome+" :");
			invia=sc.readLine();
			out.println(invia);
			ricevi=in.readLine();
			System.out.println("server:"+ricevi);
	    }
	}
}
