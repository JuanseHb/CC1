/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.udistrital.controller;
import javax.swing.SwingUtilities;
import co.edu.udistrital.view.VistaSwing;

/**
 *
 * @author Estudiantes
 */
public class ApiMain {
    
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            VistaSwing vista = new VistaSwing();
            Controller controller = new Controller(vista);
            vista.setController(controller);
            vista.setVisible(true);
        });
    }
}
