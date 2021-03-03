package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
    private static JFrame principal;
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        VentanaInicial inicio = new VentanaInicial();
        inicio.setFrameVentanaPrincipal(frame);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.pack();
        frame.setLocationRelativeTo(null);
    }




}
