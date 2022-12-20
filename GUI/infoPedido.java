/*package GUI;
import  modelo.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class infoPedido extends Ventana implements ActionListener {
    Mesero mesero;
    JButton atras;
    String codigo;
    public infoPedido(Mesero mesero){
        this.setTitle("Informacion del pedido");
        this.setSize(1200,700);
        this.setLocationRelativeTo(null);
        this.setLayout(null);
        this.mesero=mesero;
        this.generarEtiqueta("Pedido", Color.black,23,720, 110, 400, 25);
        datosProducto();
        this.codigo=codigo;
        atras = this.generarBoton("Atras",180,20,150,25);
        this.setVisible(true);
        atras.addActionListener(this);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==atras){
            this.dispose();
        }
    }
    private void datosProducto(){
        this.etiquetaDatos("Plato Principal: "+datosP(codigo)[1],Color.black,20,810, 190, 500, 25);
        this.etiquetaDatos("Ensalada: "+datosP(codigo)[2],Color.black,20,810, 260, 500, 25);
        this.etiquetaDatos("Postre: ",Color.black,20,810, 330, 500, 25);
    }
    private String[] datosP(String codigo){
        String[] d= new String[2];
        for (Pedido p: mesero.getProductos()) {
            if(p.getCodigo().equals(codigo)) {
                d[1]= p.getNombre();
                d[2]= p.getPrecio();
                d[3]= p.getDescripcion();
                d[4]= p.getCorreo();
            }
        }
        return d;
    }


}*/

