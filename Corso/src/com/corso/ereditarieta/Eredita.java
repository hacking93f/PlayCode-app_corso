package com.corso.ereditarieta;

public class Eredita {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Parent parent = new Parent();
		Child child = new Child();
		System.out.println("Stringa a vista da parent "+parent.getA());
		System.out.println("Stringa b vista da parent "+parent.getB());
		System.out.println("Stringa c vista da parent "+parent.getC());
		System.out.println("Stringa a vista da child "+child.getA());
		System.out.println("Stringa b vista da child "+child.getB());
		System.out.println("Stringa c vista da child "+child.getC());
		System.out.println("Stringa d vista da child "+child.getD());
		System.out.println("Stringa c parent vista da child "+child.getParentC());
		Parent parent1 = null; 
		parent1 = new Parent();
		
		System.out.println("Stringa c vista da parent "+parent1.getC());
		parent1 = new Child();
		System.out.println("Stringa c vista da parent polimofrato child "+parent1.getC());
		Child parent2 = (Child) parent1; 
		System.out.println("Stringa c vista da parent castato a child "+parent2.getC());
		System.out.println("Stringa d vista da parent castato a child "+parent2.getD());
	}

}
