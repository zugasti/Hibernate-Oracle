package com.company;

import javax.swing.*;

public class VentanaProv {
    private JTabbedPane tabbedPane1;
    private  JPanel panel1;
    private JButton limpiarButton;
    private JButton insertarButton;
    private JButton modificarButton;
    private JButton eliminarButton;
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;
    private JTextField textField4;
    private JButton ejecutarConsultaButton;
    private JButton button2;
    private JButton button3;
    private JButton button4;
    private JButton button5;
    private JButton bajaButton;
    private JLabel text1;
    private JLabel text2;
    private JLabel text3;
    private JLabel text4;
    private JLabel info1;
    private JLabel info2;
    private JLabel info3;
    private JLabel info4;
    private JLabel infotext1;
    private JLabel infotext2;
    private JLabel infotext3;
    private JLabel infotext4;
    private JLabel textInformación;
    private JFrame frameVentanaProv;
    private String nombresing;
    private String nombrePlu;
    int seleccion = VentanaInicial.seleccion;
    public VentanaProv(){

        if(seleccion == 1){
            nombresing="Proveedor";
            nombrePlu ="Proveedores";
            text1.setText("Codigo de "+nombresing);
            text2.setText("Nombre");
            text3.setText("Apellido");
            text4.setText("Dirección");
            info1.setText("Codigo de "+nombresing);
            info2.setText("Nombre");
            info3.setText("Apellido");
            info4.setText("Dirección");



            //Todo recoger datos de proveedores
        }else if(seleccion == 2){
            nombresing="Pieza";
            nombrePlu ="Piezas";
            text1.setText("Codigo de "+nombresing);
            text2.setText("Nombre");
            text3.setText("Precio");
            text4.setText("Descripción");
            info1.setText("Codigo de "+nombresing);
            info2.setText("Nombre");
            info3.setText("Precio");
            info4.setText("Descripción");


            //Todo recoger datos de piezas
        }else{
            nombresing="Proyecto";
            nombrePlu ="Proyectos";
            text1.setText("Codigo de "+nombresing);
            text2.setText("Nombre");
            text3.setText("Ciudad");
            info1.setText("Codigo de "+nombresing);
            info2.setText("Nombre");
            info3.setText("Ciudad");
            text4.setVisible(false);
            textField4.setVisible(false);
            info4.setVisible(false);
            infotext4.setVisible(false);

            //Todo recoger datos de proyectos
        }
        tabbedPane1.setTitleAt(1,"Gestión de"+nombrePlu);
        tabbedPane1.setTitleAt(2,"Listado de"+nombrePlu);
        textInformación.setText("LISTA DE "+nombrePlu.toUpperCase()+" UTILIZA LOS BOTONES PARA IR DE UN REG A OTRO");



    }
    public  JPanel getPanel() {
        return panel1;
    }
    public void setVentana(JFrame ventanaProv) {
        this.frameVentanaProv = ventanaProv;
    }
    public void setFrameVentanaProv(JFrame jframe) {
        this.frameVentanaProv = jframe;
    }
}
