package GUI;
import modelo.Pedido;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ventanaMenuInicial extends Ventana implements ActionListener{
    JButton MostrarPedido,EditarPedido;
    JButton Salir;
public ventanaMenuInicial(){
    this.setTitle("RESTORANT");
    this.setSize(1200,700);
    this.setLocationRelativeTo(null);
    this.setLayout(null);
    panelMenu = this.crearPanel("",true);
    panelMostrarP = this.crearPanel("Mostrar Pedido",false);
    panelEditarP = this.crearPanel("Editar Pedido",false);
    compVentana();
    comPanelMenu();
    this.setVisible(true);
}
    @Override
    public void actioPerformed(ActionEvent evt){

    }
}
