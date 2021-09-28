package es.florida.AE1T1;

import java.util.ArrayList;
import java.util.Scanner;

class Mensaje{
	String nom;
}


public class App {

	int inicioIntervalo;
	int finalIntervalo;
	
	Scanner intervalo= new Scanner(System.in);
	
	public static void main(String[] args) {
		
		System.out.println("EJERCICIO 1.");
		Mensaje msg = new Mensaje();
		
		msg.nom="Hola Mundo";
			
		System.out.print(msg.nom);	
		
		System.out.println(".");
		System.out.println("EJERCICIO 2");

	
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

		System.out.println("");

		
		
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
		

		System.out.println("EJERCICIO 3");

		System.out.println(sumaDePares(5));
		
		System.out.println("EJERCICIO 4");

		double factorial=1;
		double numero = 15;
		
		while(numero!=0) {
			factorial=factorial*numero;
			numero--;
		}
		System.out.println(factorial);
		
		System.out.println("EJERCICIO 5");

		int num[]=rellenarArray(1);
		imprimirArray(num);
		System.out.println("EJERCICIO 6");

		
		
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
		
		System.out.println("EJERCICIO 7");

		String nombreEmpleado="";
		System.out.print("Dime tu nombre: ");
		nombreEmpleado=teclado.next();
		int numeroAnyos;
		System.out.print("Dime cuantos años llevas trabajando: ");
		numeroAnyos=teclado.nextInt();
		System.out.print(nombreEmpleado+" tu trabajo y sueldo es: ");
		tipoTrabajo(numeroAnyos);
		System.out.println(".");
		
		System.out.println("EJERCICIO 8: ");
		App intervalos=new App();
		intervalos.preguntarDatos();
		intervalos.calcularIntervalo();
		
		
		
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
	
	public void preguntarDatos() {
		System.out.print("Introduce el numero que empieza el intervalo:");
		inicioIntervalo=intervalo.nextInt();
		System.out.print("Introduce el numero que finaliza el intervalo:");
		finalIntervalo=intervalo.nextInt();
	}
	
	public void calcularIntervalo() {
		for(int x = inicioIntervalo;x<=finalIntervalo;x++) {
			System.out.println(x);
		}
	}
	
	
	
}
