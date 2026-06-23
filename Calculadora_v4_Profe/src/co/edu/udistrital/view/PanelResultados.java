package co.edu.udistrital.view;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.border.TitledBorder;

public class PanelResultados extends JPanel {
    
    private JTextArea txtResultado;

    public PanelResultados() {
        setLayout(new BorderLayout());
        setBackground(new java.awt.Color(0, 0, 0));
        setBorder(new TitledBorder("Resultados"));
        TitledBorder border = (TitledBorder) getBorder();
        border.setTitleColor(java.awt.Color.WHITE);

        inicializarComponentes();

        setVisible(true);
    }

    public void inicializarComponentes() {
        txtResultado = new JTextArea();

        JScrollPane scrollPane = new JScrollPane(txtResultado, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);

        txtResultado.setEditable(false);
        add(scrollPane, BorderLayout.CENTER);
    }

    public JTextArea getTxtResultado() {
        return txtResultado;
    }

    public void setTxtResultado(JTextArea txtResultado) {
        this.txtResultado = txtResultado;
    }

    
}
