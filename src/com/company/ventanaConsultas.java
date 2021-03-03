package com.company;

import javax.swing.*;

public class ventanaConsultas {
    private JComboBox comboBox1;
    private JTextField textField1;
    private JButton buscarButton;
    private JTextArea textArea1;
    private JPanel ventanaConsultas;
    private JFrame frameVentanacon;
    int seleccion = VentanaInicial.seleccion;

    public ventanaConsultas(){
        if (seleccion ==1){
            buscarButton.setText("Buscar Proveedor");
        }else if( seleccion ==2){
            buscarButton.setText("Buscar Pieza");
        }else{
            buscarButton.setText("Buscar Proyecto");
        }

}
    public  JPanel getPanel() {
        return ventanaConsultas;
    }
    public void setVentana(JFrame ventanaConsulta) {
        this.frameVentanacon = ventanaConsulta;
    }
    public void setFrameVentana(JFrame jframe) {
        this.frameVentanacon = jframe;
    }
}

