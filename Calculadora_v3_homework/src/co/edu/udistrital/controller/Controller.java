/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.udistrital.controller;

import co.edu.udistrital.model.Operacion;
import co.edu.udistrital.view.VistaSwing;

/**
 *
 * @author Estudiantes
 */
public class Controller {

    private Operacion operacion;
    private VistaSwing vistaSwing;


    public Controller(VistaSwing vistaSwing) {
        operacion = new Operacion();
        this.vistaSwing = vistaSwing;
    }


    public void procesarOperacion(String numeroUno, String numeroDos, String operacionSeleccionada) {
        try {
            double x = Double.parseDouble(numeroUno.trim().replace(',', '.'));
            double y = Double.parseDouble(numeroDos.trim().replace(',', '.'));
            double resultado = 0.0;
            String simbolo = "";

            switch (operacionSeleccionada) {
                case "Sumar":
                    resultado = operacion.sumar(x, y);
                    simbolo = "+";
                    break;
                case "Restar":
                    resultado = operacion.restar(x, y);
                    simbolo = "-";
                    break;
                case "Multiplicar":
                    resultado = operacion.multiplicar(x, y);
                    simbolo = "*";
                    break;
                case "Dividir":
                    resultado = operacion.dividir(x, y);
                    simbolo = "/";
                    if (Double.isNaN(resultado)) {
                        vistaSwing.mostrarError("No se puede dividir entre cero.");
                        vistaSwing.mostrarResultado("Operacion no posible");
                        return;
                    }
                    break;
                default:
                    vistaSwing.mostrarError("Seleccione una operacion valida.");
                    return;
            }

            vistaSwing.mostrarResultado(x + " " + simbolo + " " + y + " = " + resultado);

        } catch (NumberFormatException e) {
            vistaSwing.mostrarError("Ingrese numeros reales validos.");
        }
    }
}
