package co.edu.udistrital.controller;

public class ApiMain {
	public static void main(String[] args) {
		Controller control = new Controller();
		
		int[] pruebas = {400000};
		
		for (int n : pruebas) {
			control.ejecutarPruebas(n);
		}
	}
}
