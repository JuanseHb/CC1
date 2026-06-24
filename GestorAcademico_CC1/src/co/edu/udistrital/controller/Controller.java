package co.edu.udistrital.controller;

import co.edu.udistrital.model.Operaciones;
import co.edu.udistrital.view.VentanaPrincipal;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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

    @Override
    public void actionPerformed(ActionEvent e) {
        String comando = e.getActionCommand();
        
        String aux ="";
        double n1=0;
        double n2=0;
        double n3=0;
        double n4=0;
        double n5=0;
        double n6=0;
        double n7=0;
        double n8=0;
        double n9=0;
        double n10=0;
        
        try{
            aux = vista.getPanelEstudiantes().getTxtNota1().getText();
            n1=Double.parseDouble(aux);
            aux = vista.getPanelEstudiantes().getTxtNota2().getText();
            n2=Double.parseDouble(aux);
            aux = vista.getPanelEstudiantes().getTxtNota3().getText();
            n3=Double.parseDouble(aux);
            aux = vista.getPanelEstudiantes().getTxtNota4().getText();
            n4=Double.parseDouble(aux);
            aux = vista.getPanelEstudiantes().getTxtNota5().getText();
            n5=Double.parseDouble(aux);
            aux = vista.getPanelEstudiantes().getTxtNota6().getText();
            n6=Double.parseDouble(aux);
            aux = vista.getPanelEstudiantes().getTxtNota7().getText();
            n7=Double.parseDouble(aux);
            aux = vista.getPanelEstudiantes().getTxtNota8().getText();
            n8=Double.parseDouble(aux);
            aux = vista.getPanelEstudiantes().getTxtNota9().getText();
            n9=Double.parseDouble(aux);
            aux = vista.getPanelEstudiantes().getTxtNota10().getText();
            n10=Double.parseDouble(aux);
            
            if(n1<0 || n1>5 || n2<0 || n2>5 || n3<0 || n3>5 || n4<0 || n4>5 || n5<0 || n5>5 || n6<0 || n6>5 || n7<0 || n7>5 || n8<0 || n8>5 || n9<0 || n9>5 || n10<0 || n10>5){
                vista.getPanelResultados().getTxtResultados().append("Error: Las notas deben estar entre 0 y 5"+"\n");
            }else{
                if(comando.equals("PROMEDIO")){
                    vista.getPanelResultados().getTxtResultados().append("El promedio de las notas de los estudiantes es: "+ operacion.Pormedio(n1, n2, n3, n4, n5, n6, n7, n8, n9, n10)+"\n");
                }
                if(comando.equals("APROBADOS")){
                    vista.getPanelResultados().getTxtResultados().append("La cantidad de estudiantes aprobados es: "+ operacion.Aprobados(n1, n2, n3, n4, n5, n6, n7, n8, n9, n10)+"\n");
                }
                if(comando.equals("REPROBADOS")){
                    vista.getPanelResultados().getTxtResultados().append("La cantidad de estudiantes reprobados es: "+ operacion.Reprobados(n1, n2, n3, n4, n5, n6, n7, n8, n9, n10)+"\n");
                }
                if(comando.equals("MODA")){
                    double moda=operacion.Moda(n1, n2, n3, n4, n5, n6, n7, n8, n9, n10);
                
                    if(moda==-1){
                        vista.getPanelResultados().getTxtResultados().append("No hay moda entre las notas de los estudiantes\n");
                    }else{
                        vista.getPanelResultados().getTxtResultados().append("La moda de las notas de los estudiantes es: "+moda+"\n");
                    }
                }
                if(comando.equals("DES")){
                    vista.getPanelResultados().getTxtResultados().append("La desviacion estandar de las notas de los estudiantes es: "+ operacion.Desviacion(n1, n2, n3, n4, n5, n6, n7, n8, n9, n10)+"\n");
                }
            }
            
        }catch(NumberFormatException ex){
            vista.getPanelResultados().getTxtResultados().append("Error: Asegurese de que todas las notas de los estudiantes esten digitadas correctamente"+"\n");
        }
        
    }
}
