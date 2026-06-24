package co.edu.udistrital.view;

import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.border.TitledBorder;

public class PanelResultados extends JPanel{
    private JTextArea txtResultados;
    
    public PanelResultados(){
        setLayout(new BorderLayout());
        setBackground(new Color(181,181,181));
        setBorder(new TitledBorder("Panel de Resultados"));
        
        inicializarComponentes();
        
        setVisible(true);
    }
    
    public void inicializarComponentes(){
        txtResultados = new JTextArea();
        
        JScrollPane pScroll = new JScrollPane(txtResultados,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
        
        txtResultados.setEditable(false);
        add(pScroll, BorderLayout.CENTER);
    }

    public JTextArea getTxtResultados() {
        return txtResultados;
    }

    public void setTxtResultados(JTextArea txtResultados) {
        this.txtResultados = txtResultados;
    }
    
    
}
