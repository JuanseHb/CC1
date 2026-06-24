package co.edu.udistrital.view;

import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

public class PanelEstudiantes extends JPanel{
    
    JLabel lblEst;
    JLabel lblNotas;
    JTextField txtEst1;
    JTextField txtEst2;
    JTextField txtEst3;
    JTextField txtEst4;
    JTextField txtEst5;
    JTextField txtEst6;
    JTextField txtEst7;
    JTextField txtEst8;
    JTextField txtEst9;
    JTextField txtEst10;
    JTextField txtNota1;
    JTextField txtNota2;
    JTextField txtNota3;
    JTextField txtNota4;
    JTextField txtNota5;
    JTextField txtNota6;
    JTextField txtNota7;
    JTextField txtNota8;
    JTextField txtNota9;
    JTextField txtNota10;
    
    public PanelEstudiantes(){
        setBorder(new TitledBorder("Panel de Estudiantes"));
        setLayout(new GridLayout(11,2,5,5));
        setBackground(new Color(181,181,181));
        
        inicializarComponentes();
        
        setVisible(true);
    }
    
    public void inicializarComponentes(){
        lblEst = new JLabel("Estudiantes");
        add(lblEst);
        lblNotas = new JLabel("Nota");
        add(lblNotas);
        
        txtEst1 = new JTextField();
        add(txtEst1);
        txtNota1= new JTextField();
        add(txtNota1);
        
        txtEst2 = new JTextField();
        add(txtEst2);
        txtNota2= new JTextField();
        add(txtNota2);
        
        txtEst3 = new JTextField();
        add(txtEst3);
        txtNota3= new JTextField();
        add(txtNota3);
        
        txtEst4 = new JTextField();
        add(txtEst4);
        txtNota4= new JTextField();
        add(txtNota4);
        
        txtEst5 = new JTextField();
        add(txtEst5);
        txtNota5= new JTextField();
        add(txtNota5);
        
        txtEst6 = new JTextField();
        add(txtEst6);
        txtNota6= new JTextField();
        add(txtNota6);
        
        txtEst7 = new JTextField();
        add(txtEst7);
        txtNota7= new JTextField();
        add(txtNota7);
        
        txtEst8 = new JTextField();
        add(txtEst8);
        txtNota8= new JTextField();
        add(txtNota8);
        
        txtEst9 = new JTextField();
        add(txtEst9);
        txtNota9= new JTextField();
        add(txtNota9);
        
        txtEst10 = new JTextField();
        add(txtEst10);
        txtNota10= new JTextField();
        add(txtNota10);
        
    }

    public JLabel getLblEst() {
        return lblEst;
    }

    public void setLblEst(JLabel lblEst) {
        this.lblEst = lblEst;
    }

    public JLabel getLblNotas() {
        return lblNotas;
    }

    public void setLblNotas(JLabel lblNotas) {
        this.lblNotas = lblNotas;
    }

    public JTextField getTxtEst1() {
        return txtEst1;
    }

    public void setTxtEst1(JTextField txtEst1) {
        this.txtEst1 = txtEst1;
    }

    public JTextField getTxtEst2() {
        return txtEst2;
    }

    public void setTxtEst2(JTextField txtEst2) {
        this.txtEst2 = txtEst2;
    }

    public JTextField getTxtEst3() {
        return txtEst3;
    }

    public void setTxtEst3(JTextField txtEst3) {
        this.txtEst3 = txtEst3;
    }

    public JTextField getTxtEst4() {
        return txtEst4;
    }

    public void setTxtEst4(JTextField txtEst4) {
        this.txtEst4 = txtEst4;
    }

    public JTextField getTxtEst5() {
        return txtEst5;
    }

    public void setTxtEst5(JTextField txtEst5) {
        this.txtEst5 = txtEst5;
    }

    public JTextField getTxtEst6() {
        return txtEst6;
    }

    public void setTxtEst6(JTextField txtEst6) {
        this.txtEst6 = txtEst6;
    }

    public JTextField getTxtEst7() {
        return txtEst7;
    }

    public void setTxtEst7(JTextField txtEst7) {
        this.txtEst7 = txtEst7;
    }

    public JTextField getTxtEst8() {
        return txtEst8;
    }

    public void setTxtEst8(JTextField txtEst8) {
        this.txtEst8 = txtEst8;
    }

    public JTextField getTxtEst9() {
        return txtEst9;
    }

    public void setTxtEst9(JTextField txtEst9) {
        this.txtEst9 = txtEst9;
    }

    public JTextField getTxtEst10() {
        return txtEst10;
    }

    public void setTxtEst10(JTextField txtEst10) {
        this.txtEst10 = txtEst10;
    }

    public JTextField getTxtNota1() {
        return txtNota1;
    }

    public void setTxtNota1(JTextField txtNota1) {
        this.txtNota1 = txtNota1;
    }

    public JTextField getTxtNota2() {
        return txtNota2;
    }

    public void setTxtNota2(JTextField txtNota2) {
        this.txtNota2 = txtNota2;
    }

    public JTextField getTxtNota3() {
        return txtNota3;
    }

    public void setTxtNota3(JTextField txtNota3) {
        this.txtNota3 = txtNota3;
    }

    public JTextField getTxtNota4() {
        return txtNota4;
    }

    public void setTxtNota4(JTextField txtNota4) {
        this.txtNota4 = txtNota4;
    }

    public JTextField getTxtNota5() {
        return txtNota5;
    }

    public void setTxtNota5(JTextField txtNota5) {
        this.txtNota5 = txtNota5;
    }

    public JTextField getTxtNota6() {
        return txtNota6;
    }

    public void setTxtNota6(JTextField txtNota6) {
        this.txtNota6 = txtNota6;
    }

    public JTextField getTxtNota7() {
        return txtNota7;
    }

    public void setTxtNota7(JTextField txtNota7) {
        this.txtNota7 = txtNota7;
    }

    public JTextField getTxtNota8() {
        return txtNota8;
    }

    public void setTxtNota8(JTextField txtNota8) {
        this.txtNota8 = txtNota8;
    }

    public JTextField getTxtNota9() {
        return txtNota9;
    }

    public void setTxtNota9(JTextField txtNota9) {
        this.txtNota9 = txtNota9;
    }

    public JTextField getTxtNota10() {
        return txtNota10;
    }

    public void setTxtNota10(JTextField txtNota10) {
        this.txtNota10 = txtNota10;
    }
    
    
}
