package com.corso.Dominio;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Date;
import java.util.Scanner;

public class UsoCorso {
	
	 
	  private Socket sock;
      private String messages;
      private String  arrivati;

	 @SuppressWarnings("resource")
	 
	public void connectionStart() throws UnknownHostException, IOException {
			
		@SuppressWarnings({ "unused", "resource" })
		Socket sock = new Socket("127.0.0.1",5000);
        System.out.println("connesso al server");
        this.sock=sock;
     
		}
	 
	 public void disconnect() throws IOException {
		 this.sock.close();
		 
	 }
	 
	 void inviaMessaggi(String inviamessaggio) throws IOException {
	
		this.arrivati=inviamessaggio;
	    PrintStream out=new PrintStream(sock.getOutputStream());
	    out.println(inviamessaggio);
		
	 }
	 
	 
	   void riceviMessaggi(String messaggio) throws IOException{
	    this.messages=messaggio;
	   
        BufferedReader in = new BufferedReader(new InputStreamReader(sock.getInputStream()));
        messaggio=in.readLine();
        System.out.println(messaggio);
	    	
       }

	 
	@SuppressWarnings("resource")
	public static void main(String[] args) throws UnknownHostException, IOException {
	
    Scanner sc = new Scanner(System.in);
	String a;
	String b;
	@SuppressWarnings("unused")
	String[]c;
	Date data;
	UsoCorso corsos= new UsoCorso();

	while(true) {
		
		Corso corso = new Corso();
		data=corso.getDate();
		System.out.println(data);
		System.out.print("inserisci l'aula :");
		a=sc.nextLine();
		corso.setAula(a);
		System.out.print("inserisci il docente :");
		b=sc.nextLine();
		corso.setDocente(b);
	
		a=corso.getAula();
		b=corso.getDocente();
		corsos.connectionStart();

		System.out.println("Aula :" +a);
		System.out.println("Docente :"+b);
		if(!a.isEmpty()&& !b.isEmpty() )
			break;
	
	}
	
	while(true) {
		
    String  assis="";
	System.out.println("Accesso Effettuato");
	System.out.println("step successivo?");
	assis=sc.nextLine();
	if(assis.equalsIgnoreCase("si")) 
	break;
	}

	System.out.println("[1] per interrompere la connessione scrivere --out");
	System.out.print("[2]invia messaggi al server :");
	String invia;
	while(true) {
	Scanner ssc = new Scanner(System.in);
	
    invia=ssc.nextLine();
	corsos.inviaMessaggi(invia);
	 if(invia.equalsIgnoreCase("--out")) {
		    System.out.print("Disconnessione....");
		    break;
		    }
	String ricevuto;
	ricevuto=sc.nextLine();
	corsos.riceviMessaggi(ricevuto);
    System.out.println(ricevuto);
    
   
	}
	
	corsos.disconnect();
	System.out.print("Grazie a presto :)");
	
	}

	
}
