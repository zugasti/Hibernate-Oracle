package com.company;

import javax.swing.*;

public class Estadisticas {
    private JButton nºDePiezasYButton;
    private JButton nºDePiezasYButton1;
    private JPanel Estadisticas;
    private JFrame frame;

    public Estadisticas(){

    }
    public JPanel getPanel() {
        return Estadisticas;
    }

    public void setVentana(JFrame esta) {
        this.frame = esta;
    }

    public void setFrameVentana(JFrame jframe) {
        this.frame = jframe;
    }
}
