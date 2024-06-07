import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class Bienvenida extends JFrame implements ActionListener {

    private JTextField textfield1;
    private JLabel etiqueta1, etiqueta2, etiqueta3, etiqueta4;
    private JButton boton;
    public static String texto = "";

    public Bienvenida() {
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("Bienvenido");
        getContentPane().setBackground(new Color(255, 0, 0));
        setIconImage(new ImageIcon(getClass().getResource("Images/icon.png")).getImage());

        /**
         * ImageIcon imagen= new ImageIcon("Images/logo-coca.png"); Intento #1 con las
         * indicaciones del Pofe
         */
        etiqueta1 = new JLabel();
        etiqueta1.setIcon(new ImageIcon(getClass().getResource("Images/logo-coca.png"))); // ayuda de los comentarios
        /**
         * etiqueta1.setIcon(new ImageIcon("Images/Logo-cocacola.png")); Intento #2 con
         * ayuda de internet
         */
        etiqueta1.setBounds(25, 15, 300, 150);
        add(etiqueta1);

        textfield1 = new JTextField();
        textfield1.setBounds(45, 240, 255, 25);
        textfield1.setBackground(new Color(224, 224, 224));
        textfield1.setFont(new Font("Andale Mono", 1, 14));
        textfield1.setForeground(new Color(255, 0, 0));
        add(textfield1);

        etiqueta2 = new JLabel("Sistema de control vacacional");
        etiqueta2.setBounds(35, 135, 300, 30);
        etiqueta2.setFont(new Font("Andale Mono", 3, 18));
        etiqueta2.setForeground(new Color(255, 255, 255));
        add(etiqueta2);

        etiqueta3 = new JLabel("Ingrese su nombre");
        etiqueta3.setBounds(45, 212, 200, 30);
        etiqueta3.setFont(new Font("Andale Mono", 1, 12));
        etiqueta3.setForeground(new Color(255, 255, 255));
        add(etiqueta3);

        etiqueta4 = new JLabel("©2021 The Coca-Cola Company");
        etiqueta4.setBounds(85, 375, 300, 30);
        etiqueta4.setFont(new Font("Andale Mono", 1, 12));
        etiqueta4.setForeground(new Color(255, 255, 255));
        add(etiqueta4);

        boton = new JButton("Aceptar");
        boton.setBounds(125, 280, 100, 30);
        boton.setBackground(new Color(255, 255, 255));
        boton.setFont(new Font("Andale Mono", 1, 14));
        boton.setForeground(new Color(255, 0, 0));
        boton.addActionListener(this);
        add(boton);
    }

    public void actionPerformed(ActionEvent n) {
        if (n.getSource() == boton) {
            texto = textfield1.getText().trim();

            if (texto.equals("")) {
                JOptionPane.showMessageDialog(null, "Debes ingresar tu nombre");
            } else {
                Licencia recuadroL = new Licencia();
                recuadroL.setBounds(0, 0, 610, 370);
                recuadroL.setLocationRelativeTo(null);
                recuadroL.setResizable(false);
                recuadroL.setVisible(true);
                this.setVisible(false);
            }
        }
    }

    public static void main(String[] args) {
        Bienvenida recuadroB = new Bienvenida();
        recuadroB.setBounds(0, 0, 350, 450);
        recuadroB.setLocationRelativeTo(null);
        recuadroB.setResizable(false);
        recuadroB.setVisible(true);

    }
}