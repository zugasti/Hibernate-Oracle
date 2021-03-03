package com.company;

import javax.swing.*;

public class SuministroPiezas {
    private JComboBox comboBox1;
    private JTextArea textArea1;
    private JButton verPiezasSuministradasButton;
    private JPanel SumPiezas;
    private JFrame frame;


    public SuministroPiezas(){

    }
    public JPanel getPanel() {
        return SumPiezas;
    }

    public void setVentana(JFrame sumi) {
        this.frame = sumi;
    }

    public void setFrameVentana(JFrame jframe) {
        this.frame = jframe;
    }
}
