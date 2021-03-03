package com.company;

import javax.swing.*;

public class ventanaGestion {
    private JButton insertarButton;
    private JButton modificarButton;
    private JButton eliminarButton;
    private JButton listadoButton;
    private JComboBox comboBox1;
    private JComboBox comboBox2;
    private JComboBox comboBox3;
    private JTextField textField1;
    private JPanel Gestion;
    JFrame frameGestion;

    public ventanaGestion(){

    }
    public  JPanel getPanel() {
        return Gestion;
    }
    public void setVentana(JFrame ventanaGestion) {
        this.frameGestion = ventanaGestion;
    }
    public void setFrameVentanaGestion(JFrame jframe) {
        this.frameGestion = jframe;
    }
}
