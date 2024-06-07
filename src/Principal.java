import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Principal extends JFrame implements ActionListener {

    private JComboBox combo1, combo2;
    private JLabel etiqueta1, etiqueta2, etiqueta3, etiqueta4, etiqueta5, etiqueta6, etiqueta7, etiqueta8, etiqueta9,
            etiqueta10;
    private JMenuBar barra;
    private JMenu menu1, menu2, menu3, menu4;
    private JMenuItem item1, item2, item3, item4, item5, item6, item7, item8, Item9;
    private JTextField textfield1, textfield2, textfield3;
    private JTextArea area;
    private JScrollPane scrollpane;
    String nombreA = "";

    public Principal() {
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("Pantalla Principal");
        getContentPane().setBackground(new Color(225, 0, 0));
        setIconImage(new ImageIcon(getClass().getResource("Images/icon.png")).getImage());
        Bienvenida ventaBienvenida = new Bienvenida();
        nombreA = ventaBienvenida.texto;

        combo1 = new JComboBox();
        combo1.setBounds(220, 213, 270, 25);
        combo1.setBackground(new java.awt.Color(224, 224, 224));
        combo1.setFont(new java.awt.Font("Andale Mono", 1, 14));
        combo1.setForeground(new java.awt.Color(225, 0, 0));
        combo1.addItem("");
        combo1.addItem("Departamento de Atención al cliente");
        combo1.addItem("Departamento de Logística");
        combo1.addItem("Departamento de Gerencia");
        add(combo1);
        // combo1.addItemListener(this);

        combo2 = new JComboBox();
        combo2.setBounds(220, 273, 270, 25);
        combo2.setBackground(new java.awt.Color(224, 224, 224));
        combo2.setFont(new java.awt.Font("Andale Mono", 1, 14));
        combo2.setForeground(new java.awt.Color(225, 0, 0));
        add(combo2);
        combo2.addItem("");
        combo2.addItem("1 año de servicio");
        combo2.addItem("2 a 6 años de servicio");
        combo2.addItem("7 o mas años de servicio");
        // combo2.addItemListener(this);

        etiqueta1 = new JLabel();
        etiqueta1.setIcon(new ImageIcon(getClass().getResource("Images/logo-coca.png")));
        etiqueta1.setBounds(5, 5, 270, 100);
        add(etiqueta1);

        etiqueta2 = new JLabel("Bienvenido " + nombreA);
        etiqueta2.setFont(new Font("Andale Mono", 1, 32));
        etiqueta2.setForeground(new Color(225, 225, 225));
        etiqueta2.setBounds(285, 30, 300, 50);
        add(etiqueta2);

        etiqueta3 = new JLabel("Datos Del Trabajador Para Cálculo De Vacaciones");
        etiqueta3.setFont(new Font("Andale Mono", 0, 24));
        etiqueta3.setForeground(new Color(225, 225, 225));
        etiqueta3.setBounds(45, 140, 900, 25);
        add(etiqueta3);

        etiqueta4 = new JLabel("Nombre completo:");
        etiqueta4.setFont(new Font("Andale Mono", 1, 12));
        etiqueta4.setForeground(new Color(225, 225, 225));
        etiqueta4.setBounds(25, 188, 180, 25);
        add(etiqueta4);

        etiqueta5 = new JLabel("Apellido paterno:");
        etiqueta5.setFont(new Font("Andale Mono", 1, 12));
        etiqueta5.setForeground(new Color(225, 225, 225));
        etiqueta5.setBounds(25, 248, 180, 25);
        add(etiqueta5);

        etiqueta6 = new JLabel("Apellido materno");
        etiqueta6.setFont(new Font("Andale Mono", 1, 12));
        etiqueta6.setForeground(new Color(225, 225, 225));
        etiqueta6.setBounds(25, 308, 180, 25);
        add(etiqueta6);

        etiqueta7 = new JLabel("Selecciona tu departamento:");
        etiqueta7.setFont(new Font("Andale Mono", 1, 12));
        etiqueta7.setForeground(new Color(225, 225, 225));
        etiqueta7.setBounds(220, 188, 180, 25);
        add(etiqueta7);

        etiqueta8 = new JLabel("Selecciona la antigüedad:");
        etiqueta8.setFont(new Font("Andale Mono", 1, 12));
        etiqueta8.setForeground(new Color(225, 225, 225));
        etiqueta8.setBounds(220, 248, 280, 25);
        add(etiqueta8);

        etiqueta9 = new JLabel("Resultado del calculo:");
        etiqueta9.setFont(new Font("Andale Mono", 1, 12));
        etiqueta9.setForeground(new Color(225, 225, 225));
        etiqueta9.setBounds(220, 307, 180, 25);
        add(etiqueta9);

        etiqueta10 = new JLabel("©2021 The Coca-Cola Company | Todos los derechos reservados");
        etiqueta10.setFont(new Font("Andale Mono", 1, 12));
        etiqueta10.setForeground(new Color(225, 225, 225));
        etiqueta10.setBounds(135, 445, 500, 30);
        add(etiqueta10);

        barra = new JMenuBar();
        barra.setBackground(new Color(225, 0, 0));
        setJMenuBar(barra);

        menu1 = new JMenu("Opciones");
        menu1.setBackground(new Color(225, 0, 0));
        menu1.setFont(new Font("Andale Mono", 1, 14));
        menu1.setForeground(new Color(225, 225, 225));
        barra.add(menu1);

        menu2 = new JMenu("Color");
        menu2.setBackground(new Color(225, 0, 0));
        menu2.setFont(new Font("Andale Mono", 1, 14));
        menu2.setForeground(new Color(225, 0, 0));
        menu1.add(menu2);

        menu3 = new JMenu("Calcular");
        menu3.setBackground(new Color(225, 0, 0));
        menu3.setFont(new Font("Andale Mono", 1, 14));
        menu3.setForeground(new Color(225, 225, 225));
        barra.add(menu3);

        menu4 = new JMenu("Acerca de");
        menu4.setBackground(new Color(225, 0, 0));
        menu4.setFont(new Font("Andale Mono", 1, 14));
        menu4.setForeground(new Color(225, 225, 225));
        barra.add(menu4);

        item1 = new JMenuItem("Rojo");
        item1.setFont(new Font("Andale Mono", 1, 14));
        item1.setForeground(new Color(225, 0, 0));
        item1.addActionListener(this);
        menu2.add(item1);

        item2 = new JMenuItem("Verde");
        item2.setFont(new Font("Andale Mono", 1, 14));
        item2.setForeground(new Color(225, 0, 0));
        item2.addActionListener(this);
        menu2.add(item2);

        item3 = new JMenuItem("Azul");
        item3.setFont(new Font("Andale Mono", 1, 14));
        item3.setForeground(new Color(225, 0, 0));
        item3.addActionListener(this);
        menu2.add(item3);

        item4 = new JMenuItem("Magenta");
        item4.setFont(new Font("Andale Mono", 1, 14));
        item4.setForeground(new Color(225, 0, 0));
        item4.addActionListener(this);
        menu2.add(item4);

        item5 = new JMenuItem("Cyan");
        item5.setFont(new Font("Andale Mono", 1, 14));
        item5.setForeground(new Color(225, 0, 0));
        item5.addActionListener(this);
        menu2.add(item5);

        item6 = new JMenuItem("Nuevo");
        item6.setFont(new Font("Andale Mono", 1, 14));
        item6.setForeground(new Color(225, 0, 0));
        item6.addActionListener(this);
        menu1.add(item6);

        item7 = new JMenuItem("Salir");
        item7.setFont(new Font("Andale Mono", 1, 14));
        item7.setForeground(new Color(225, 0, 0));
        item7.addActionListener(this);
        menu1.add(item7);

        item8 = new JMenuItem("Vacaciones");
        item8.setFont(new Font("Andale Mono", 1, 14));
        item8.setForeground(new Color(225, 0, 0));
        item8.addActionListener(this);
        menu3.add(item8);

        Item9 = new JMenuItem("El creador");
        Item9.setFont(new Font("Andale Mono", 1, 14));
        Item9.setForeground(new Color(225, 0, 0));
        Item9.addActionListener(this);
        menu4.add(Item9);

        textfield1 = new JTextField();
        textfield1.setFont(new java.awt.Font("Andale Mono", 1, 14));
        textfield1.setForeground(new java.awt.Color(225, 0, 0));
        textfield1.setBounds(25, 213, 150, 25);
        textfield1.setBackground(new java.awt.Color(224, 224, 224));
        add(textfield1);

        textfield2 = new JTextField();
        textfield2.setFont(new java.awt.Font("Andale Mono", 1, 14));
        textfield2.setForeground(new java.awt.Color(225, 0, 0));
        textfield2.setBackground(new java.awt.Color(224, 224, 224));
        textfield2.setBounds(25, 273, 150, 25);
        add(textfield2);

        textfield3 = new JTextField();
        textfield3.setFont(new java.awt.Font("Andale Mono", 1, 14));
        textfield3.setForeground(new java.awt.Color(225, 0, 0));
        textfield3.setBounds(25, 334, 150, 25);
        textfield3.setBackground(new java.awt.Color(224, 224, 224));
        add(textfield3);

        area = new JTextArea();
        area.setEditable(false);
        area.setBackground(new Color(224, 224, 224));
        area.setFont(new Font("Andale Mono", 1, 13));
        area.setForeground(new Color(225, 0, 0));
        area.setText("\n          Aquí aparece el calculo de las vacaciones");
        scrollpane = new JScrollPane(area);
        scrollpane.setBounds(220, 333, 385, 90);
        add(scrollpane);
    }

    public void actionPerformed(ActionEvent n) {
        if (n.getSource() == item1) {
            getContentPane().setBackground(new Color(225, 0, 0));
        }
        if (n.getSource() == item2) {
            getContentPane().setBackground(new Color(0, 225, 0));
        }
        if (n.getSource() == item3) {
            getContentPane().setBackground(new Color(0, 0, 225));
        }
        if (n.getSource() == item4) {
            getContentPane().setBackground(new Color(225, 0, 225));
        }
        if (n.getSource() == item5) {
            getContentPane().setBackground(new Color(0, 125, 125));
        }
        if (n.getSource() == item6) { // Nuevo
            textfield1.setText("");
            textfield2.setText("");
            textfield3.setText("");
            combo1.setSelectedIndex(0);
            combo2.setSelectedIndex(0);
            area.setText("\n          Aquí aparece el calculo de las vacaciones");
            ;
        }
        if (n.getSource() == item7) { // Salir
            Bienvenida recuadroB = new Bienvenida();
            recuadroB.setBounds(0, 0, 350, 450);
            recuadroB.setLocationRelativeTo(null);
            recuadroB.setResizable(false);
            recuadroB.setVisible(true);
            this.setVisible(false);
        }

        if (n.getSource() == item8) { // Vacaciones
            String nombreTrabajador = textfield1.getText();
            String AP = textfield2.getText();
            String AM = textfield3.getText();
            String Departamento = combo1.getSelectedItem().toString();
            String Antiguedad = combo2.getSelectedItem().toString();

            if (nombreTrabajador.equals("") || AP.equals("") || AM.equals("") || Departamento.equals("")
                    || Antiguedad.equals("")) {
                JOptionPane.showMessageDialog(null, "Debes llenar todos los campos.");
            } else {

                if (Departamento.equals("Departamento de Atención al cliente")) {

                    if (Antiguedad.equals("1 año de servicio")) {
                        area.setText(
                                "\n   El trabajador " + nombreTrabajador + " " + AP + " " + AM + "\n   quien labora en "
                                        + Departamento + "\n   con " + Antiguedad + " recibe 6 dias de vacaciones.");
                    }
                    if (Antiguedad.equals("2 a 6 años de servicio")) {
                        area.setText(
                                "\n   El trabajador " + nombreTrabajador + " " + AP + " " + AM + "\n   quien labora en "
                                        + Departamento + "\n   con " + Antiguedad + " recibe 14 dias de vacaciones");
                    }
                    if (Antiguedad.equals("7 o mas años de servicio")) {
                        area.setText(
                                "\n   El trabajador " + nombreTrabajador + " " + AP + " " + AM + "\n   quien labora en "
                                        + Departamento + "\n   con " + Antiguedad + " recibe 20 dias de vacaciones.");
                    }
                } else if (Departamento.equals("Departamento de Logística")) {

                    if (Antiguedad.equals("1 año de servicio")) {
                        area.setText(
                                "\n   El trabajador " + nombreTrabajador + " " + AP + " " + AM + "\n   quien labora en "
                                        + Departamento + "\n   con " + Antiguedad + " recibe 7 dias de vacaciones.");
                    }
                    if (Antiguedad.equals("2 a 6 años de servicio")) {
                        area.setText(
                                "\n   El trabajador " + nombreTrabajador + " " + AP + " " + AM + "\n   quien labora en "
                                        + Departamento + "\n   con " + Antiguedad + " recibe 15 dias de vacaciones.");
                    }
                    if (Antiguedad.equals("7 o mas años de servicio")) {
                        area.setText(
                                "\n   El trabajador " + nombreTrabajador + " " + AP + " " + AM + "\n   quien labora en "
                                        + Departamento + "\n   con " + Antiguedad + " recibe 22 dias de vacaciones.");
                    }
                } else if (Departamento.equals("Departamento de Gerencia")) {

                    if (Antiguedad.equals("1 año de servicio")) {
                        area.setText(
                                "\n   El trabajador " + nombreTrabajador + " " + AP + " " + AM + "\n   quien labora en "
                                        + Departamento + "\n   con " + Antiguedad + " recibe 10 dias de vacaciones.");
                    }
                    if (Antiguedad.equals("2 a 6 años de servicio")) {
                        area.setText(
                                "\n   El trabajador " + nombreTrabajador + " " + AP + " " + AM + "\n   quien labora en "
                                        + Departamento + "\n   con " + Antiguedad + " recibe 20 dias de vacaciones.");
                    }
                    if (Antiguedad.equals("7 o mas años de servicio")) {
                        area.setText(
                                "\n   El trabajador " + nombreTrabajador + " " + AP + " " + AM + "\n   quien labora en "
                                        + Departamento + "\n   con " + Antiguedad + " recibe 30 dias de vacaciones.");
                    }
                }
            }
        }
        if (n.getSource() == Item9) {
            JOptionPane.showMessageDialog(null, "Hola que tal? Mi nombre es Luis Armando Farfan Roldan"
                    + "\n      Y soy estudiante autodidacta de programacion.");
        }
    }

    public static void main(String[] args) {
        Principal recuadroP = new Principal();
        recuadroP.setBounds(0, 0, 645, 535);
        recuadroP.setLocationRelativeTo(null);
        recuadroP.setResizable(false);
        recuadroP.setVisible(true);
    }
}