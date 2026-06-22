/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.udistrital.model;

/**
 *
 * @author Estudiantes
 */
public class Operacion {
    
    public double sumar(double x, double y){
        return (x+y);
    }
    
    public double restar(double x, double y){
        return (x-y);
    }
    
    public double multiplicar(double x, double y){
        return (x*y);
    }
    public double dividir(double x, double y){
        if(y != 0){
            return (x/y);
        }else{
            return Double.NaN;
        }
    }
    
}
