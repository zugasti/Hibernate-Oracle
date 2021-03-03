package com.company;

import javax.swing.*;

public class SuministroPor {
    private JButton verPiezasSuministradasButton;
    private JComboBox comboBox1;
    private JPanel Suministro;
    private JFrame frameSumi;

    public SuministroPor() {

    }

    public JPanel getPanel() {
        return Suministro;
    }

    public void setVentana(JFrame sumi) {
        this.frameSumi = sumi;
    }

    public void setFrameVentana(JFrame jframe) {
        this.frameSumi = jframe;
    }
}
