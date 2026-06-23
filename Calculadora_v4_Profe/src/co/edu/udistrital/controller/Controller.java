/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.udistrital.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import co.edu.udistrital.model.Operacion;
import co.edu.udistrital.view.VentanaPrincipal;

/**
 *
 * @author Estudiantes
 */
public class Controller implements ActionListener {

    private Operacion operacion;
    private VentanaPrincipal vista;

    public Controller(){
        operacion = new Operacion();
        vista = new VentanaPrincipal();
        asignarOyentes();
    }

    public void asignarOyentes(){
        vista.getPanelDatos().getButtonSumar().addActionListener(this);
        vista.getPanelDatos().getButtonRestar().addActionListener(this);
        vista.getPanelDatos().getButtonMultiplicar().addActionListener(this);
        vista.getPanelDatos().getButtonDividir().addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String comando = e.getActionCommand();
        System.out.println("Comando: " + comando);


        String aux = "";
        double x = 0.0;
        double y = 0.0;
        if(comando.equals("SUMAR") ) {
            try{ 
                aux = vista.getPanelDatos().getTextFieldNumero1().getText();
                x = Double.parseDouble(aux);
                aux = vista.getPanelDatos().getTextFieldNumero2().getText();
                y = Double.parseDouble(aux);
                vista.getPanelResultados().getTxtResultado().append(x + " + " + y + " = " + operacion.sumar(x, y) + "\n");
           }
           catch(NumberFormatException ex){
               vista.getPanelResultados().getTxtResultado().append("Error: Ingrese números válidos\n");
           }
        }else if(comando.equals("RESTAR") ) {
            try{ aux = vista.getPanelDatos().getTextFieldNumero1().getText();
                x = Double.parseDouble(aux);
                aux = vista.getPanelDatos().getTextFieldNumero2().getText();
                y = Double.parseDouble(aux);
                vista.getPanelResultados().getTxtResultado().append(x + " - " + y + " = " + operacion.restar(x, y) + "\n");
            }
           catch(NumberFormatException ex){
               vista.getPanelResultados().getTxtResultado().append("Error: Ingrese números válidos\n");
           }
        }else if(comando.equals("MULTIPLICAR") ) {
            try{
                aux = vista.getPanelDatos().getTextFieldNumero1().getText();
                x = Double.parseDouble(aux);
                aux = vista.getPanelDatos().getTextFieldNumero2().getText();
                y = Double.parseDouble(aux);
                vista.getPanelResultados().getTxtResultado().append(x + " * " + y + " = " + operacion.multiplicar(x, y) + "\n");
            }
            catch(NumberFormatException ex){
                vista.getPanelResultados().getTxtResultado().append("Error: Ingrese números válidos\n");
            }
        }else if(comando.equals("DIVIDIR") ) {
            try{
                aux = vista.getPanelDatos().getTextFieldNumero1().getText();
                x = Double.parseDouble(aux);
                aux = vista.getPanelDatos().getTextFieldNumero2().getText();
                y = Double.parseDouble(aux);
                double z = operacion.dividir(x,y);
                if(!Double.isNaN(z)){
                    vista.getPanelResultados().getTxtResultado().append(x + " / " + y + " = " + z + "\n");
                }else{
                    vista.getPanelResultados().getTxtResultado().append("La operacion no es posible"+ "\n");
                }
            }catch(NumberFormatException ex){
                vista.getPanelResultados().getTxtResultado().append("Error: Ingrese números válidos\n");
            }
        }
    }

}
/*     public void run(){
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
} */
