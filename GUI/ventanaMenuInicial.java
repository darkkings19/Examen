package GUI;
import modelo.Mesero;
import modelo.Pedido;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class ventanaMenuInicial extends Ventana implements ActionListener{
    Mesero mesero;
    JButton Mostrar,Agregar;
    JButton Salir;
    //JButton[] articulo;
public ventanaMenuInicial(Mesero mesero){
    this.setTitle("RESTORANT");
    this.setSize(700,500);
    this.setLocationRelativeTo(null);
    this.setLayout(null);
    this.generarEtiqueta("MostrarPedido: ", Color.black,12, 70, 170, 200, 25);
    this.generarEtiqueta("AgregarPedido: ", Color.black,12, 70, 220, 200, 25);
    Mostrar = this.generarBoton("Mostrar",180,20,150,25);
    Agregar = this.generarBoton("Agregar",340,20,200,25);
    Salir = this.generarBoton("salir", 180,60,150,25);
    //MostrarPedido.addActionListener(this);
    //AgregarPedido.addActionListener(this);
    Salir.addActionListener(this);
    Agregar.addActionListener(this);
    this.mesero = mesero;
    this.setVisible(true);
}
    @Override
    public void actionPerformed(ActionEvent evt){
        if (evt.getSource() == Mostrar){
            //mostrar();
            this.dispose();
        }else if(evt.getSource() == Salir) {
            this.dispose();
        }else if(evt.getSource()== Agregar){
            new AgregarProducto(this.mesero);
            this.dispose();
        }
        /*try{
            for (int i = 0; i < articulo.length; i++) {
                if(evt.getSource()==articulo[i]){
                    new InfoProducto(mesero, articulo[i].getName());
                }
            }
        }catch (Exception e){
        }*/

    }
    /*protected void mostrar(String categoria, JPanel panel){
        ArrayList<Pedido> p = datosProducto(categoria);
        articulo =new JButton[p.size()];
        int x=70;
        int y= 160;
        for (int i = 0; i < p.size(); i++) {
            panel.add(generarEtiqueta(p.get(i).getPlatoPrincipal(),Color.black,12,x,y+130,150,25));
            x= x+180;
            if(x==1150){
                x=70;
                y=y+160;
            }
            articulo[i].addActionListener(this);
        }
    }*/
    private ArrayList<Pedido> datosProducto(String categoria){
        ArrayList<Pedido> productos = new ArrayList<>();
        Pedido p;
        for (int i = 0; i < mesero.getProductos().size(); i++) {
            p= mesero.getProductos().get(i);
            if(p.getPlatoPrincipal().equals(categoria)) {
                productos.add(p);
            }
        }
        return productos;
    }

}
