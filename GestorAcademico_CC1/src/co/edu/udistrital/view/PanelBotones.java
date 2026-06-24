package co.edu.udistrital.view;

import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

public class PanelBotones extends JPanel{
    private JButton btnAprobados;
    private JButton btnReprobados;
    private JButton btnPromedio;
    private JButton btnModa;
    private JButton btnDes;
    
    public PanelBotones(){
        setLayout(new GridLayout(3,2,10,10));
        setBackground(new Color(181,181,181));
        setBorder(new TitledBorder("Panel de botones"));
        
        inicializarComponentes();
        setVisible(true);
    }
    
    public void inicializarComponentes(){
        btnAprobados = new JButton("Aprobados");
        btnAprobados.setActionCommand("APROBADOS");
        add(btnAprobados);
        
        btnPromedio = new JButton("Promedio");
        btnPromedio.setActionCommand("PROMEDIO");
        add(btnPromedio);
        
        btnReprobados = new JButton("Reprobados");
        btnReprobados.setActionCommand("REPROBADOS");
        add(btnReprobados);
        
        btnModa = new JButton("Moda");
        btnModa.setActionCommand("MODA");
        add(btnModa);
        
        btnDes = new JButton("Desviación Estandar");
        btnDes.setActionCommand("DES");
        add(btnDes);
    }

    public JButton getBtnAprobados() {
        return btnAprobados;
    }

    public void setBtnAprobados(JButton btnAprobados) {
        this.btnAprobados = btnAprobados;
    }

    public JButton getBtnReprobados() {
        return btnReprobados;
    }

    public void setBtnReprobados(JButton btnReprobados) {
        this.btnReprobados = btnReprobados;
    }

    public JButton getBtnPromedio() {
        return btnPromedio;
    }

    public void setBtnPromedio(JButton btnPromedio) {
        this.btnPromedio = btnPromedio;
    }

    public JButton getBtnModa() {
        return btnModa;
    }

    public void setBtnModa(JButton btnModa) {
        this.btnModa = btnModa;
    }

    public JButton getBtnDes() {
        return btnDes;
    }

    public void setBtnDes(JButton btnDes) {
        this.btnDes = btnDes;
    }
    
    
}
