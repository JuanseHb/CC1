package co.edu.udistrital.view;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

public class PanelDatos extends JPanel {
    
    private JLabel labelNumero1;
    private JLabel labelNumero2;
    private JTextField textFieldNumero1;
    private JTextField textFieldNumero2;
    private JButton buttonSumar;
    private JButton buttonRestar;
    private JButton buttonMultiplicar;
    private JButton buttonDividir;

    public PanelDatos() {
        setLayout(new GridLayout(4, 2));
        setBackground(new Color(37, 61, 77));
        setBorder(new TitledBorder("Datos de entrada"));
        TitledBorder border = (TitledBorder) getBorder();
        border.setTitleColor(Color.WHITE);
        
        inicializarComponentes();

        setVisible(true);
    }

    public void inicializarComponentes() {
        labelNumero1 = new JLabel("Número 1:");
        labelNumero1.setForeground(Color.WHITE);
        add(labelNumero1);

        textFieldNumero1 = new JTextField();
        add(textFieldNumero1);

        labelNumero2 = new JLabel("Número 2:");
        labelNumero2.setForeground(Color.WHITE);
        add(labelNumero2);

        textFieldNumero2 = new JTextField();
        add(textFieldNumero2);

        buttonSumar = new JButton("Sumar");
        buttonSumar.setActionCommand("SUMAR");
        add(buttonSumar);

        buttonRestar = new JButton("Restar");
        buttonRestar.setActionCommand("RESTAR");
        add(buttonRestar);

        buttonMultiplicar = new JButton("Multiplicar");
        buttonMultiplicar.setActionCommand("MULTIPLICAR");
        add(buttonMultiplicar);

        buttonDividir = new JButton("Dividir");
        buttonDividir.setActionCommand("DIVIDIR");
        add(buttonDividir);
    }

    public void setLabelNumero1(JLabel labelNumero1) {
        this.labelNumero1 = labelNumero1;
    }

    public void setLabelNumero2(JLabel labelNumero2) {
        this.labelNumero2 = labelNumero2;
    }

    public void setTextFieldNumero1(JTextField textFieldNumero1) {
        this.textFieldNumero1 = textFieldNumero1;
    }

    public void setTextFieldNumero2(JTextField textFieldNumero2) {
        this.textFieldNumero2 = textFieldNumero2;
    }

    public void setButtonSumar(JButton buttonSumar) {
        this.buttonSumar = buttonSumar;
    }

    public void setButtonRestar(JButton buttonRestar) {
        this.buttonRestar = buttonRestar;
    }

    public void setButtonMultiplicar(JButton buttonMultiplicar) {
        this.buttonMultiplicar = buttonMultiplicar;
    }

    public void setButtonDividir(JButton buttonDividir) {
        this.buttonDividir = buttonDividir;
    }

    public JLabel getLabelNumero1(JLabel labelNumero1) {
        return labelNumero1;
    }

    public JLabel getLabelNumero2() {
        return labelNumero2;
    }

    public JTextField getTextFieldNumero1() {
        return textFieldNumero1;
    }

    public JTextField getTextFieldNumero2() {
        return textFieldNumero2;
    }

    public JButton getButtonSumar() {
        return buttonSumar;
    }

    public JButton getButtonRestar() {
        return buttonRestar;
    }

    public JButton getButtonMultiplicar() {
        return buttonMultiplicar;
    }

    public JButton getButtonDividir() {
        return buttonDividir;
    }

}
