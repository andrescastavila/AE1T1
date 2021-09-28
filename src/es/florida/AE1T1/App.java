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
		
		double factorial=1;
		double numero = 15;
		
		while(numero!=0) {
			factorial=factorial*numero;
			numero--;
		}
		System.out.println(factorial);
		
		
		int num[]=rellenarArray(1);
		imprimirArray(num);
		
		
		
		int[] listaNum=new int [5];
		int suma=0;
		for(int i=0;i<listaNum.length;i++) {
			System.out.print("Introduce un numero: ");
			listaNum[i]=teclado.nextInt();
			suma+=listaNum[i];
			
		}
		System.out.println("Numeros en orden inverso: ");
		for(int i = listaNum.length -1;i>=0;i--) {
			System.out.println("Indice "+(i+1)+" ="+listaNum[i]);
		}
		System.out.println("La suma total es: "+suma);
		
		
		String nombreEmpleado="";
		System.out.print("Dime tu nombre: ");
		nombreEmpleado=teclado.next();
		int numeroAnyos;
		System.out.print("Dime cuantos años llevas trabajando: ");
		numeroAnyos=teclado.nextInt();
		System.out.print(nombreEmpleado+" tu trabajo y sueldo es: ");
		tipoTrabajo(numeroAnyos);
		
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
	
	public static void imprimirArray(int lista[]) {
		for(int i=0;i<lista.length;i++) {
			System.out.println(lista[i]);
		}
	}
	
	public static int [] rellenarArray(int x) {
		int num[]=new int [10];
		for(int i=0;i<num.length;i++) {
			num[i]=x;
			x++;
		}
		return num;
	}
	
	public static void tipoTrabajo(int x) {
		if(x<1) {
			System.out.print("Desarrollador Junior L1-15000€-18000€");
		}else if(x<2&&x>1) {
			System.out.print("Desarrollador Junior L2-18000€-22000€");
		}else if(x<5&&x>3) {
			System.out.print("Desarrolador Senior L1-22000€-28000€");
		}else if(x<8&&x>5) {
			System.out.print("Desarrolador Senior L2-28000€-36000€");
		}else {
			System.out.print("Analista/Arquitecto Salario a convenir en base a rol");
		}
		
	}
	
	
	
}
