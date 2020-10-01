package com.corso.Dominio;

import java.util.Date;
import java.util.Scanner;

public class Corso{
	
	private String[] alunno=null;
	private String docente=null;
	private String aula=null;
	Date date=new Date();
	
	Scanner sc = new Scanner(System.in);
	
	public String[] getAlunno() {
		return alunno;
	
	}
	public String getDocente() {
		return docente;
	}
	
	public String getAula() {
		return aula;
	}
	
	public Date getDate() {
	return date;
	}
	
	
	
	
	
	public void setAlunno(String[] string) {
		this.alunno=string;
		
		
		
	}
	
	public void setDocente(String docente) {
	this.docente=docente;
	System.out.println("docente inserito");

	}
	
	public void setAula(String aula) {
		this.aula=aula;
		System.out.println("aula inserita");

	}
	
	
	
}