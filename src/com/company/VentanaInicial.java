package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VentanaInicial extends JPanel {
    private JFrame frame = new JFrame("Pantalla menu");
    private JMenuBar menuBar = new JMenuBar();
    private JPanel ventanaInicial;

    private JMenu menuBase = new JMenu("Base de Datos");
    private JMenu menuProveedores = new JMenu("Proveedores");
    private JMenu menuPiezas = new JMenu("Piezas");
    private JMenu menuProyecto = new JMenu("Proyecto");
    private JMenu menuGestion = new JMenu("Gestion Global");
    private JMenu menuAyuda = new JMenu("Ayuda");

    private JMenuItem menuItemGestionProv = new JMenuItem("Gestión de Proveedores");
    private JMenu menuItemConsultaProv = new JMenu("Consulta de Proveedores");
    private JMenuItem menuItemGestionPiezas = new JMenuItem("Gestión de Piezas");
    private JMenu menuItemConsultaPiezas = new JMenu("Consulta de Piezas");
    private JMenuItem menuItemGestionProyecto = new JMenuItem("Gestión de Proyectos");
    private JMenu menuItemConsultaProyecto = new JMenu("Consulta de Proyectos");
    private JMenuItem menuPiezProvProy = new JMenuItem("Piezas, Proveedores y Proyectos");
    private JMenuItem menuSumiPorProve = new JMenuItem("Suministro por Proveedor");
    private JMenuItem menuSumiPorPieza = new JMenuItem("Suministro por Piezas");
    private JMenuItem menuEsta = new JMenuItem("Estadísticas");


    private JMenuItem menuItemProvPorCodigo = new JMenuItem("Por Codigo");
    private JMenuItem menuItemProvPorNombre = new JMenuItem("Por Nombre");
    private JMenuItem menuItemProvPorDir = new JMenuItem("Por Dirección");

    private JMenuItem menuItemPiezPorCodigo = new JMenuItem("Por Codigo");
    private JMenuItem menuItemPiezPorNombre = new JMenuItem("Por Nombre");

    private JMenuItem menuItemPorCodigo = new JMenuItem("Por Codigo");
    private JMenuItem menuItemPorNombre = new JMenuItem("Por Nombre");
    private JMenuItem menuItemPorCiudad = new JMenuItem("Por Ciudad");
    public static int seleccion = 0;

    public VentanaInicial() {

        menuProveedores.add(menuItemGestionProv);
        menuProveedores.add(menuItemConsultaProv);

        menuPiezas.add(menuItemGestionPiezas);
        menuPiezas.add(menuItemConsultaPiezas);

        menuProyecto.add(menuItemGestionProyecto);
        menuProyecto.add(menuItemConsultaProyecto);

        menuGestion.add(menuPiezProvProy);
        menuGestion.add(menuSumiPorProve);
        menuGestion.add(menuSumiPorPieza);
        menuGestion.add(menuEsta);

        menuItemConsultaProv.add(menuItemProvPorCodigo);
        menuItemConsultaProv.add(menuItemProvPorNombre);
        menuItemConsultaProv.add(menuItemProvPorDir);

        menuItemConsultaPiezas.add(menuItemPiezPorCodigo);
        menuItemConsultaPiezas.add(menuItemPiezPorNombre);

        menuItemConsultaProyecto.add(menuItemPorCodigo);
        menuItemConsultaProyecto.add(menuItemPorNombre);
        menuItemConsultaProyecto.add(menuItemPorCiudad);

        menuBar.add(menuBase);
        menuBar.add(menuProveedores);
        menuBar.add(menuPiezas);
        menuBar.add(menuProyecto);
        menuBar.add(menuGestion);
        menuBar.add(menuAyuda);
        JLabel imagen = new JLabel();
        imagen.setIcon(new ImageIcon("Assets/fondo.png"));
        imagen.setVisible(true);

        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());
        frame.setSize(800, 500);
        frame.setLocationRelativeTo(null);
        frame.setJMenuBar(menuBar);
        frame.add(imagen);
        frame.setVisible(true);
        //Gestión
        menuItemGestionProv.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                seleccion =1;
                JFrame frame = new JFrame("Gestionar Proveedores");
                VentanaProv prov = new VentanaProv();
                frame.setContentPane(prov.getPanel());
                prov.setVentana(frame);
                prov.setFrameVentanaProv(frame);
                frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                frame.pack();
                frame.setLocationRelativeTo(null);
                frame.setVisible(true);

            }
        });
        menuItemGestionPiezas.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                seleccion =2;
                JFrame frame = new JFrame("Gestionar Proveedores");
                VentanaProv prov = new VentanaProv();
                frame.setContentPane(prov.getPanel());
                prov.setVentana(frame);
                prov.setFrameVentanaProv(frame);
                frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                frame.pack();
                frame.setLocationRelativeTo(null);
                frame.setVisible(true);

            }
        });
        menuItemGestionProyecto.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                seleccion =3;
                JFrame frame = new JFrame("Gestionar Proveedores");
                VentanaProv prov = new VentanaProv();
                frame.setContentPane(prov.getPanel());
                prov.setVentana(frame);
                prov.setFrameVentanaProv(frame);
                frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                frame.pack();
                frame.setLocationRelativeTo(null);
                frame.setVisible(true);

            }
        });

        //Consultas
        menuItemPorCodigo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                seleccion =3;
                JFrame frame = new JFrame("Consulta de Proveedores por código");
                ventanaConsultas prov = new ventanaConsultas();
                frame.setContentPane(prov.getPanel());
                prov.setVentana(frame);
                prov.setFrameVentana(frame);
                frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                frame.pack();
                frame.setLocationRelativeTo(null);
                frame.setVisible(true);

            }
        });
        menuItemPorNombre.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                seleccion =3;
                JFrame frame = new JFrame("Consulta de Proveedores por nombre");
                ventanaConsultas prov = new ventanaConsultas();
                frame.setContentPane(prov.getPanel());
                prov.setVentana(frame);
                prov.setFrameVentana(frame);
                frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                frame.pack();
                frame.setLocationRelativeTo(null);
                frame.setVisible(true);
            }
        });
        menuItemPorCiudad.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                seleccion =3;
                JFrame frame = new JFrame("Consulta de Proveedores por ciudad");
                ventanaConsultas prov = new ventanaConsultas();
                frame.setContentPane(prov.getPanel());
                prov.setVentana(frame);
                prov.setFrameVentana(frame);
                frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                frame.pack();
                frame.setLocationRelativeTo(null);
                frame.setVisible(true);
            }
        });
        menuItemPiezPorCodigo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                seleccion =2;
                JFrame frame = new JFrame("Consulta de Piezas por código");
                ventanaConsultas prov = new ventanaConsultas();
                frame.setContentPane(prov.getPanel());
                prov.setVentana(frame);
                prov.setFrameVentana(frame);
                frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                frame.pack();
                frame.setLocationRelativeTo(null);
                frame.setVisible(true);
            }
        });
        menuItemPiezPorNombre.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                seleccion =2;
                JFrame frame = new JFrame("Consulta de Piezas por nombre");
                ventanaConsultas prov = new ventanaConsultas();
                frame.setContentPane(prov.getPanel());
                prov.setVentana(frame);
                prov.setFrameVentana(frame);
                frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                frame.pack();
                frame.setLocationRelativeTo(null);
                frame.setVisible(true);
            }
        });
        menuItemProvPorDir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                seleccion =1;
                JFrame frame = new JFrame("Consulta de Proyectos por dirección");
                ventanaConsultas prov = new ventanaConsultas();
                frame.setContentPane(prov.getPanel());
                prov.setVentana(frame);
                prov.setFrameVentana(frame);
                frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                frame.pack();
                frame.setLocationRelativeTo(null);
                frame.setVisible(true);
            }
        });

        //Gestion
        menuItemProvPorCodigo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                seleccion =1;
                JFrame frame = new JFrame("Consulta de Proyectos por código");
                ventanaConsultas prov = new ventanaConsultas();
                frame.setContentPane(prov.getPanel());
                prov.setVentana(frame);
                prov.setFrameVentana(frame);
                frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                frame.pack();
                frame.setLocationRelativeTo(null);
                frame.setVisible(true);
            }
        });
        menuItemProvPorNombre.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                seleccion =1;
                JFrame frame = new JFrame("Consulta de Proyectos por nombre");
                ventanaConsultas prov = new ventanaConsultas();
                frame.setContentPane(prov.getPanel());
                prov.setVentana(frame);
                prov.setFrameVentana(frame);
                frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                frame.pack();
                frame.setLocationRelativeTo(null);
                frame.setVisible(true);
            }
        });
        menuPiezProvProy.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame frame = new JFrame("gestión global");
                ventanaGestion prov = new ventanaGestion();
                frame.setContentPane(prov.getPanel());
                prov.setVentana(frame);
                prov.setFrameVentanaGestion(frame);
                frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                frame.pack();
                frame.setLocationRelativeTo(null);
                frame.setVisible(true);
            }
        });

        //Suministro por
        menuSumiPorProve.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                JFrame frame = new JFrame("Suministros de proveedor");
                SuministroPor prov = new SuministroPor();
                frame.setContentPane(prov.getPanel());
                prov.setVentana(frame);
                prov.setFrameVentana(frame);
                frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                frame.pack();
                frame.setLocationRelativeTo(null);
                frame.setVisible(true);

            }
        });
        menuSumiPorPieza.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame frame = new JFrame("Piezas suministradas a proyectos");
                SuministroPiezas pie = new SuministroPiezas();
                frame.setContentPane(pie.getPanel());
                pie.setVentana(frame);
                pie.setFrameVentana(frame);
                frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                frame.pack();
                frame.setLocationRelativeTo(null);
                frame.setVisible(true);
            }
        });

        menuEsta.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame frame = new JFrame("Resumen estadistico");
                Estadisticas esta = new Estadisticas();
                frame.setContentPane(esta.getPanel());
                esta.setVentana(frame);
                esta.setFrameVentana(frame);
                frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                frame.pack();
                frame.setLocationRelativeTo(null);
                frame.setVisible(true);
            }
        });
    }
    public void setFrameVentanaPrincipal(JFrame frameVentanaPrincipal) {
        this.frame = frameVentanaPrincipal;
    }
    public JPanel getVentanaPrincipal() {
        return ventanaInicial;
    }

}
