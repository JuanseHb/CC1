package co.edu.udistrital.view;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JFrame;

public class VentanaPrincipal extends JFrame {
    private PanelDatos panelDatos;
    private PanelResultados panelResultados;

    public VentanaPrincipal(){
        setSize(700, 300);
        setTitle("Calculadora");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().setBackground(new Color(254, 127, 45));
        getContentPane().setLayout(new BorderLayout(10, 10));

        inicializarComponentes();

        setResizable(true);
        setVisible(true);
    }

    public void inicializarComponentes() {
        panelDatos = new PanelDatos();
        getContentPane().add(panelDatos, BorderLayout.WEST);
        panelResultados = new PanelResultados();
        getContentPane().add(panelResultados, BorderLayout.CENTER);
    }

    public PanelDatos getPanelDatos() {
        return panelDatos;
    }

    public PanelResultados getPanelResultados() {
        return panelResultados;
    }
    public void setPanelResultados(PanelResultados panelResultados) {
        this.panelResultados = panelResultados;
    }

    public void setPanelDatos(PanelDatos panelDatos) {
        this.panelDatos = panelDatos;
    }
    
}
