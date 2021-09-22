package es.florida.AE1T1;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		String nom = args[0];
		System.out.println("Hola " + nom);
		
		Scanner teclado = new Scanner(System.in);
		String entradaTeclado = teclado.nextLine();
		System.out.println("Hola " + entradaTeclado);
		teclado.close();

	}

}
