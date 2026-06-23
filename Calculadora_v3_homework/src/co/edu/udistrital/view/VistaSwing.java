/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.udistrital.view;

import co.edu.udistrital.controller.Controller;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

/**
 *
 * @author Estudiantes
 */
public class VistaSwing extends JFrame {

    private JTextField txtNumeroUno;
    private JTextField txtNumeroDos;
    private JComboBox<String> cmbOperacion;
    private JButton btnCalcular;
    private JButton btnLimpiar;
    private JButton btnSalir;
    private JLabel lblResultado;
    private Controller controller;

    public VistaSwing(){
        initComponents();
    }
    
 private void initComponents() {
        setTitle("Calculadora MVC - Swing");
        setSize(450, 330);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);

        JPanel panelPrincipal = new JPanel(new BorderLayout(10, 10));
        panelPrincipal.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

        JLabel lblTitulo = new JLabel("Calculadora basica", SwingConstants.CENTER);
        lblTitulo.setFont(new Font("Arial", Font.BOLD, 22));
        panelPrincipal.add(lblTitulo, BorderLayout.NORTH);

        JPanel panelFormulario = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(8, 8, 8, 8);
        gbc.fill = GridBagConstraints.HORIZONTAL;

        JLabel lblNumeroUno = new JLabel("Primer numero:");
        txtNumeroUno = new JTextField();

        JLabel lblNumeroDos = new JLabel("Segundo numero:");
        txtNumeroDos = new JTextField();

        JLabel lblOperacion = new JLabel("Operacion:");
        cmbOperacion = new JComboBox<>(new String[]{"Sumar", "Restar", "Multiplicar", "Dividir"});

        lblResultado = new JLabel("Resultado: ", SwingConstants.CENTER);
        lblResultado.setFont(new Font("Arial", Font.BOLD, 16));
        lblResultado.setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY));

        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.weightx = 0.3;
        panelFormulario.add(lblNumeroUno, gbc);

        gbc.gridx = 1;
        gbc.gridy = 0;
        gbc.weightx = 0.7;
        panelFormulario.add(txtNumeroUno, gbc);

        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.weightx = 0.3;
        panelFormulario.add(lblNumeroDos, gbc);

        gbc.gridx = 1;
        gbc.gridy = 1;
        gbc.weightx = 0.7;
        panelFormulario.add(txtNumeroDos, gbc);

        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.weightx = 0.3;
        panelFormulario.add(lblOperacion, gbc);

        gbc.gridx = 1;
        gbc.gridy = 2;
        gbc.weightx = 0.7;
        panelFormulario.add(cmbOperacion, gbc);

        gbc.gridx = 0;
        gbc.gridy = 3;
        gbc.gridwidth = 2;
        panelFormulario.add(lblResultado, gbc);

        panelPrincipal.add(panelFormulario, BorderLayout.CENTER);

        JPanel panelBotones = new JPanel();
        btnCalcular = new JButton("Calcular");
        btnLimpiar = new JButton("Limpiar");
        btnSalir = new JButton("Salir");

        panelBotones.add(btnCalcular);
        panelBotones.add(btnLimpiar);
        panelBotones.add(btnSalir);

        panelPrincipal.add(panelBotones, BorderLayout.SOUTH);
        add(panelPrincipal);

        btnCalcular.addActionListener(e -> calcular());
        btnLimpiar.addActionListener(e -> limpiarCampos());
        btnSalir.addActionListener(e -> System.exit(0));
    }

    private void calcular() {
        if (controller != null) {
            controller.procesarOperacion(getNumeroUno(), getNumeroDos(), getOperacionSeleccionada());
        }
    }

    public String getNumeroUno() {
        return txtNumeroUno.getText();
    }

    public String getNumeroDos() {
        return txtNumeroDos.getText();
    }

    public String getOperacionSeleccionada() {
        return cmbOperacion.getSelectedItem().toString();
    }

    public void mostrarResultado(String resultado) {
        lblResultado.setText("Resultado: " + resultado);
    }

    public void mostrarError(String mensaje) {
        JOptionPane.showMessageDialog(this, mensaje, "Error", JOptionPane.ERROR_MESSAGE);
    }

    public void limpiarCampos() {
        txtNumeroUno.setText("");
        txtNumeroDos.setText("");
        cmbOperacion.setSelectedIndex(0);
        lblResultado.setText("Resultado: ");
        txtNumeroUno.requestFocus();
    }

    public void setController(Controller controller) {
        this.controller = controller;
    }
}

