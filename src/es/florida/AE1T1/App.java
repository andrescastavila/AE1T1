package es.florida.AE1T1;

import java.util.ArrayList;
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

		teclado.close();
		
		
		ArrayList<String> nombres2 = new ArrayList<>();
		
		nombres2.add(nombres[0]);
		nombres2.add(nombres[1]);
		nombres2.add(nombres[2]);
		nombres2.add(nombres[3]);
		nombres2.add(nombres[4]);
		nombres2.add(nombres[5]);
		
		for(String noms : nombres2) {
			System.out.println(noms);
		}
		

		
		System.out.println(sumaDePares(5));
		
	}

	public static int sumaDePares(int x) {
		int suma=0;
		for(var i=1; i<=x; i++) {
			if(i%2==0) {
				suma +=i;
			}
		}
		return suma;
	
	
}
	
	
}
