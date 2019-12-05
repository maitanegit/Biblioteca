package com.elorrieta;

import java.util.Scanner;

public class Biblios {

	public static void main(String[] args) {
		System.out.println("Inicio del proyecto"); //syso ctrl espacio enter
		
		System.out.println("Introduce la operación a realizar:");
		System.out.println("A. Tomar prestado un libro");
		System.out.println("B. Devolver libro");
		System.out.println("S. Salir");
		System.out.println("");
		
		Scanner sc = new Scanner(System.in);
		char op = sc.nextLine().toUpperCase().charAt(0);
		
		switch (op) {
		case 'A':
			
			break;
		case 'B':
			
			break;
		case 'S':
	
			break;
		default:
			break;
		}
				
		
	}
}
