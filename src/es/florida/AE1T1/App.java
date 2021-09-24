package es.florida.AE1T1;

import java.util.Scanner;

class Mensaje{
	String nom;
}


public class App {

	public static void main(String[] args) {
		
		Mensaje msg = new Mensaje();
		
		msg.nom="Hola Mundo";
			
		System.out.print(msg.nom);	
	
		Scanner teclado = new Scanner(System.in);
		
		String [] nombres=new String[6];
		
		
		
		System.out.print(" Ingrese un nombre:");
		nombres[0]=teclado.next();

		System.out.print(" Ingrese un nombre:");
		nombres[1]=teclado.next();

		System.out.print(" Ingrese un nombre:");
		nombres[2]=teclado.next();

		System.out.print(" Ingrese un nombre:");
		nombres[3]=teclado.next();

		System.out.print(" Ingrese un nombre:");
		nombres[4]=teclado.next();

		System.out.print(" Ingrese un nombre:");
		nombres[5]=teclado.next();
		
		for(int i=0;i<6;i++) {
			System.out.print(" "+(i+1)+" Nombre:"+nombres[i]+".");
		}

		

	}

}
