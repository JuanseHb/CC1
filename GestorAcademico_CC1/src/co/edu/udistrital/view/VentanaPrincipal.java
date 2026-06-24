package co.edu.udistrital.view;

import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.JFrame;

public class VentanaPrincipal extends JFrame{
    private PanelImagen PanelImagen;
    private PanelEstudiantes PanelEstudiantes;
    private PanelBotones PanelBotones;
    private PanelResultados PanelResultados;
    
    public VentanaPrincipal(){
        setSize(600,600);
        setTitle("Sistema de Control de Notas");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().setBackground(Color.white);
        getContentPane().setLayout(new GridLayout(2,2,10,10));
        
        inicializarComponentes();
        
        setResizable(true);
	setLocationRelativeTo(null);
	setVisible(true);
    }
    
    public void inicializarComponentes(){
        PanelImagen = new PanelImagen();
        getContentPane().add(PanelImagen);
        PanelEstudiantes = new PanelEstudiantes();
        getContentPane().add(PanelEstudiantes);
        PanelBotones = new PanelBotones();
        getContentPane().add(PanelBotones);
        PanelResultados = new PanelResultados();
        getContentPane().add(PanelResultados);
        
    }

    public PanelImagen getPanelImagen() {
        return PanelImagen;
    }

    public void setPanelImagen(PanelImagen PanelImagen) {
        this.PanelImagen = PanelImagen;
    }

    public PanelEstudiantes getPanelEstudiantes() {
        return PanelEstudiantes;
    }

    public void setPanelEstudiantes(PanelEstudiantes PanelEstudiantes) {
        this.PanelEstudiantes = PanelEstudiantes;
    }

    public PanelBotones getPanelBotones() {
        return PanelBotones;
    }

    public void setPanelBotones(PanelBotones PanelBotones) {
        this.PanelBotones = PanelBotones;
    }

    public PanelResultados getPanelResultados() {
        return PanelResultados;
    }

    public void setPanelResultados(PanelResultados PanelResultados) {
        this.PanelResultados = PanelResultados;
    }
    
    
}
