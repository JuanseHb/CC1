package co.edu.udistrital.view;

import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

public class PanelImagen extends JPanel{
    ImageIcon imgFoto;
    JLabel lblFoto;
    
    public PanelImagen(){
        setLayout(new BorderLayout());
        setBorder(new TitledBorder("Panel Imagen"));
        setBackground(new Color(181,181,181));
        
        inicializarComponentes();
        
        setVisible(true);
    }
    
    public void inicializarComponentes(){
        imgFoto = new ImageIcon(getClass().getResource("imagen.jpg"));
        lblFoto = new JLabel(imgFoto);
        add(lblFoto,BorderLayout.CENTER);
    }
    
}
