import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;

public class Licencia extends JFrame implements ActionListener, ChangeListener {

    private JLabel etiqueta1, etiqueta2;
    private JCheckBox chec1;
    private JButton boton1, boton2;
    private JTextArea area;
    private JScrollPane scrollpane1;
    String nombre = "";

    public Licencia() {
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("Licencia de uso");
        getContentPane().setBackground(new Color(224, 224, 224));
        setIconImage(new ImageIcon(getClass().getResource("Images/icon.png")).getImage());
        Bienvenida ventaBienvenida = new Bienvenida();
        nombre = ventaBienvenida.texto;

        etiqueta1 = new JLabel("TERMINOS Y CONDICIONES");
        etiqueta1.setBounds(215, 5, 200, 30);
        etiqueta1.setFont(new Font("Andale Mono", 1, 14));
        etiqueta1.setForeground(new Color(0, 0, 0));
        add(etiqueta1);

        etiqueta2 = new JLabel();
        etiqueta2.setIcon(new ImageIcon(getClass().getResource("Images/coca-cola.png")));
        etiqueta2.setBounds(315, 135, 300, 300);
        add(etiqueta2);

        area = new JTextArea();
        area.setEditable(false);
        area.setFont(new Font("Andale Mono", 1, 9));
        area.setText("\n\n          TERMINOS Y CONDICIONES"
                + "\n\n          A. PROHIBIDA SU VENTA O DISTRIBUCION SIN AUTORIZACION DE RECUPERACIÓN_APROBADA INDUSTRIES."
                + "\n          B. PROHIBIDA LA ALTERACION DEL CODIGO FUENTE O DISEÑO DE LAS INTERFACES GRAFICAS."
                + "\n          C. RECUPERACIÓN_APROBADA INDUSTRIES NO SE HACE RESPONSABLE DEL MAL USO DE ESTE SOFTWARE."
                + "\n\n        LOS ACUERDOS LEGALES EXPUESTOS A CONTINUACION RIGEN EL USO QUE USTED HAGA DE ESTE SOFTWARE."
                + "\n        (RECUPERACIÓN_APROBADA INDUSTRIES Y EL EQUIPO DE DESARROLLO), NO SE RESPONSABILIZAN DEL USO QUE USTED"
                + "\n        HAGA CON ESTE SOFTWARE Y SUS SERVICIOS, PARA ACEPTAR TERMINOS Y CONDICIONES HAGA CLIC EN (ACEPTAR)"
                + "\n        SI USTED NO ACEPTA LOS TERMINOS, HAGA CLIC EN (NO ACEPTO) Y NO UTILICE ESTE SOFTWARE."
                + "\n\n        PARA MAYOR INFORMACION SOBRE NUESTROS PRODUCTOS O SERVICIOS, POR FAVOR VISITE"
                + "\n          ALGUNA DE NUESTRAS SUCURSALES");
        scrollpane1 = new JScrollPane(area);
        scrollpane1.setBounds(10, 40, 575, 200);
        add(scrollpane1);

        chec1 = new JCheckBox("Yo " + nombre + " Acepto");
        chec1.setBounds(10, 250, 300, 30);
        chec1.addChangeListener(this);
        add(chec1);

        boton1 = new JButton("Continuar");
        boton1.setBounds(10, 290, 100, 30);
        boton1.addActionListener(this);
        boton1.setEnabled(false);
        add(boton1);

        boton2 = new JButton("No Acepto");
        boton2.setBounds(120, 290, 100, 30);
        boton2.addActionListener(this);
        boton2.setEnabled(true);
        add(boton2);
    }

    public void stateChanged(ChangeEvent m) {
        if (chec1.isSelected() == true) {
            boton1.setEnabled(true);
            boton2.setEnabled(false);
        } else {
            boton1.setEnabled(false);
            boton2.setEnabled(true);
        }
    }

    public void actionPerformed(ActionEvent m) {
        if (m.getSource() == boton1) {
            Principal recuadroP = new Principal();
            recuadroP.setBounds(0, 0, 645, 535);
            recuadroP.setLocationRelativeTo(null);
            recuadroP.setResizable(false);
            recuadroP.setVisible(true);
            this.setVisible(false);
        } else if (m.getSource() == boton2) {
            Bienvenida recuadroB = new Bienvenida();
            recuadroB.setBounds(0, 0, 350, 450);
            recuadroB.setLocationRelativeTo(null);
            recuadroB.setResizable(false);
            recuadroB.setVisible(true);
            this.setVisible(false);
        }
    }

    public static void main(String[] args) {
        Licencia recuadroL = new Licencia();
        recuadroL.setBounds(0, 0, 610, 370);
        recuadroL.setLocationRelativeTo(null);
        recuadroL.setResizable(false);
        recuadroL.setVisible(true);
    }
}