package com.elorrieta;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Biblios {

	public static void main(String[] args) {
		System.out.println("Inicio del proyecto"); //syso ctrl espacio enter

		Scanner sc = new Scanner(System.in);
		
		boolean finalizar = false;
		do {
			System.out.println("Introduce la operación a realizar:");
			System.out.println("A. Tomar prestado un libro");
			System.out.println("B. Devolver libro");
			System.out.println("S. Salir");
			System.out.println("");
			
			char op = sc.nextLine().toUpperCase().charAt(0);
			
			List<Libro> lsLibros = new ArrayList<Libro>();
			
			switch (op) {
			case 'A':
				//System.out.println("Código");
				lsLibros.remove(0);
				break;
			case 'B':
				lsLibros.add(new Libro("Libro 1","A001"));
				break;
			case 'S':
				finalizar = true;
				break;
			default:
				break;				
			}
		}while(!finalizar);
		
		sc.close();
		System.out.println("Fin del proyecto"); 
	}
}
