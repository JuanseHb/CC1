/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.udistrital.view;

import javax.swing.JOptionPane;

/**
 *
 * @author Estudiantes
 */
public class VistaVentanasEmergentes {
    public VistaVentanasEmergentes(){
        
    }
    
    public void mostrarInformacion(String mensaje) {
        JOptionPane.showMessageDialog(null, mensaje);
    }
    
    public String leerDato(String mensaje) {
        String dato = JOptionPane.showInputDialog(mensaje);
        return dato;
    } 
}
