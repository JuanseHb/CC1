package co.edu.udistrital.view;

import java.util.Scanner;

public class View {
	
	private Scanner sc = new Scanner(System.in);
	
	 public void mostrar (String mensaje) {
		 System.out.println(mensaje);
	 }
	 
	 public String leerValoresN() {
	        System.out.println("Ingrese valores de N separados por comas:");
	        return sc.nextLine();
	    }
}
