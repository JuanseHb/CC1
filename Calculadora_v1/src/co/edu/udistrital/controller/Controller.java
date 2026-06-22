/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.udistrital.controller;

import co.edu.udistrital.model.Operacion;
import co.edu.udistrital.view.VistaConsola;

/**
 *
 * @author Estudiantes
 */
public class Controller {
    private Operacion operacion;
    private VistaConsola vista;
    
    public Controller(){
        operacion = new Operacion();
        vista = new VistaConsola();
    }

    public void run(){
        String menu = " Operaciones: \n"  +
                      "        1. Sumar \n"+
                      "        2. Restar \n"+
                      "        3. Multiplicar \n"+
                      "        4. Dividir \n"+
                      "        5. Salir \n"+
                      "Ingrese operacion: ";
        
        double x = 0.0;
        double y = 0.0;
        int op = 0;
        do{
            x = capturarDato();
            y = capturarDato();
            op = Integer.parseInt(vista.leerDato(menu));
            switch (op){
                case 1:
                    vista.mostrarInformacion(x + " + " + y + " = " + operacion.sumar(x, y));
                    break;
                case 2:
                    vista.mostrarInformacion(x + " - " + y + " = " + operacion.restar(x, y));
                    break;
                case 3:
                    vista.mostrarInformacion(x + " * " + y + " = " + operacion.multiplicar(x, y));
                    break;
                case 4:
                double z = operacion.dividir(x,y);
                    if(!Double.isNaN(z)){
                       vista.mostrarInformacion(x + " / " + y + " = " + operacion.dividir(x, y));
                    }else{
                        vista.mostrarInformacion("La operacion no es posible");
                    }
                    
                    break;

                        
                case 5:
                    vista.mostrarInformacion(". Hasta pronto");
                    break;
                default:
                    vista.mostrarInformacion("Digite bien los datos");
            } 
        }while(op != 5);
    }
    
    public double capturarDato(){
        String aux = vista.leerDato("Ingrese numero real: ");
        return Double.parseDouble(aux);
    }
}
