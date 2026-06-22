/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.udistrital.view;

import java.util.Scanner;

/**
 *
 * @author Estudiantes
 */
public class VistaConsola {
    private Scanner sc = new Scanner(System.in);
    
    public void mostrarInformacion(String mensaje) {
        System.out.println(mensaje);
    }
    
    public String leerDato(String mensaje) {
        System.out.print(mensaje);
        String dato = sc.nextLine();
        return dato;
    } 
}
