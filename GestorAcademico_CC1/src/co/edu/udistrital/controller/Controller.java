package co.edu.udistrital.controller;

import co.edu.udistrital.model.Estudiante;
import co.edu.udistrital.model.Operaciones;
import co.edu.udistrital.view.VentanaPrincipal;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JTextField;

public class Controller implements ActionListener{
    private VentanaPrincipal vista;
    private Operaciones operacion;
    
    public Controller(){
        vista = new VentanaPrincipal();
        operacion = new Operaciones();
        asignarOyentes();
    }
    
    public void asignarOyentes(){
        vista.getPanelBotones().getBtnAprobados().addActionListener(this);
        vista.getPanelBotones().getBtnReprobados().addActionListener(this);
        vista.getPanelBotones().getBtnPromedio().addActionListener(this);
        vista.getPanelBotones().getBtnModa().addActionListener(this);
        vista.getPanelBotones().getBtnDes().addActionListener(this);
    }
    
    public Estudiante[] capturarEstudiantes(){
        JTextField nombres[]={
            vista.getPanelEstudiantes().getTxtEst1(),
            vista.getPanelEstudiantes().getTxtEst2(),
            vista.getPanelEstudiantes().getTxtEst3(),
            vista.getPanelEstudiantes().getTxtEst4(),
            vista.getPanelEstudiantes().getTxtEst5(),
            vista.getPanelEstudiantes().getTxtEst6(),
            vista.getPanelEstudiantes().getTxtEst7(),
            vista.getPanelEstudiantes().getTxtEst8(),
            vista.getPanelEstudiantes().getTxtEst9(),
            vista.getPanelEstudiantes().getTxtEst10()
        };
        
        JTextField notas[]={
            vista.getPanelEstudiantes().getTxtNota1(),
            vista.getPanelEstudiantes().getTxtNota2(),
            vista.getPanelEstudiantes().getTxtNota3(),
            vista.getPanelEstudiantes().getTxtNota4(),
            vista.getPanelEstudiantes().getTxtNota5(),
            vista.getPanelEstudiantes().getTxtNota6(),
            vista.getPanelEstudiantes().getTxtNota7(),
            vista.getPanelEstudiantes().getTxtNota8(),
            vista.getPanelEstudiantes().getTxtNota9(),
            vista.getPanelEstudiantes().getTxtNota10()
        };
        
        Estudiante estudiantes[]=new Estudiante[notas.length];
        
        for(int i=0;i<estudiantes.length;i++){
            String nombre=nombres[i].getText();
            double nota=Double.parseDouble(notas[i].getText());
            estudiantes[i]=new Estudiante(nombre, nota);
        }
        
        return estudiantes;
    }
    
    public boolean validarNotas(Estudiante estudiantes[]){
        boolean valido=true;
        
        for(int i=0;i<estudiantes.length;i++){
            if(estudiantes[i].getNota()<0 || estudiantes[i].getNota()>5){
                valido=false;
            }
        }
        
        return valido;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String comando = e.getActionCommand();
        
        try{
            Estudiante estudiantes[]=capturarEstudiantes();
            
            if(validarNotas(estudiantes)==false){
                vista.getPanelResultados().getTxtResultados().append("Error: Las notas deben estar entre 0 y 5"+"\n");
            }else{
                if(comando.equals("PROMEDIO")){
                    vista.getPanelResultados().getTxtResultados().append("El promedio de las notas de los estudiantes es: "+ operacion.Pormedio(estudiantes)+"\n");
                }
                if(comando.equals("APROBADOS")){
                    vista.getPanelResultados().getTxtResultados().append("La cantidad de estudiantes aprobados es: "+ operacion.Aprobados(estudiantes)+"\n");
                }
                if(comando.equals("REPROBADOS")){
                    vista.getPanelResultados().getTxtResultados().append("La cantidad de estudiantes reprobados es: "+ operacion.Reprobados(estudiantes)+"\n");
                }
                if(comando.equals("MODA")){
                    double moda=operacion.Moda(estudiantes);
                
                    if(moda==-1){
                        vista.getPanelResultados().getTxtResultados().append("No hay moda entre las notas de los estudiantes\n");
                    }else{
                        vista.getPanelResultados().getTxtResultados().append("La moda de las notas de los estudiantes es: "+moda+"\n");
                    }
                }
                if(comando.equals("DES")){
                    vista.getPanelResultados().getTxtResultados().append("La desviacion estandar de las notas de los estudiantes es: "+ operacion.Desviacion(estudiantes)+"\n");
                }
            }
            
        }catch(NumberFormatException ex){
            vista.getPanelResultados().getTxtResultados().append("Error: Asegurese de que todas las notas de los estudiantes esten digitadas correctamente"+"\n");
        }
        
    }
}
