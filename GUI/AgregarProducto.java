package GUI;
import java.awt.event.ActionListener;
import Datos.GestorDatos;
import modelo.Pedido;
import  modelo.Mesero;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class AgregarProducto extends Ventana implements ActionListener {
    Mesero mesero;
    private JTextField PlatoPrincipal;
    private JTextField Ensalada;
    private JTextField Postre;
    private JButton guardar;
    private JButton salir;

    public AgregarProducto(Mesero mesero) {
        this.setTitle("Agregar Pedido");
        this.setSize(600, 600);
        this.setLocationRelativeTo(null);
        this.setLayout(null);
        this.mesero = mesero;
        elementosVentana();
        this.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == guardar) {
            if (camposVacios()) {
                mensajeError(this, "Rellene todos los datos requeridos");
            } else {
                agregarPedido();
                Mesero storeNew = new Mesero();
                GestorDatos.leerArchivoPedidos(storeNew, "BaseDatos/Pedidos.txt");
                this.dispose();
            }
        }
        if (e.getSource() == salir) {
            new ventanaMenuInicial(this.mesero);
            this.dispose();
        }
    }

    private void elementosVentana() {
        this.generarEtiqueta("Plato Principal: ", Color.black, 12, 55, 190, 200, 25);
        this.generarEtiqueta("Ensalada: ", Color.black, 12, 55, 230, 200, 25);
        this.generarEtiqueta("Postre: ", Color.black, 12, 55, 270, 210, 25);
        PlatoPrincipal = this.generarCampoDeTexto(240, 190, 170, 25);
        Ensalada = this.generarCampoDeTexto(240, 230, 170, 25);
        Postre = this.generarCampoDeTexto(240, 270, 170, 25);
        guardar = this.generarBoton("Guardar", 110, 510, 115, 25);
        salir = this.generarBoton("Cancelar", 380, 510, 115, 25);
        guardar.addActionListener(this);
        salir.addActionListener(this);
    }

    public boolean camposVacios() {
        return PlatoPrincipal.getText().equals("") || Ensalada.getText().equals("") ||
                Postre.getText().equals("");
    }

    public void agregarPedido() {
        Pedido pedido = new Pedido(PlatoPrincipal.getText(), Ensalada.getText(), Postre.getText());
        GestorDatos.guardarDatos(pedido, "BaseDatos/Pedidos.txt");
        JOptionPane.showMessageDialog(this, "Pedido recibido");
    }
}
    /*private String generarCodigo(){
        String alfabeto= "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
        String codigo = "";
        for (int i = 0; i < 12; i++) {
            int indice = ThreadLocalRandom.current().nextInt(0, alfabeto.length());
            char caracter= alfabeto.charAt(indice);
            codigo +=caracter;
        }
        return codigo;


    }*/
