package modelo;

import java.util.ArrayList;
import java.util.List;

public class Mesero {
    List<Pedido> Pedidos;

    public List<Pedido> getPedidos() {
        return Pedidos;
    }

    public Mesero(){
        this.Pedidos =new ArrayList<>();
    }
    public List<Pedido> getProductos(){
        return Pedidos;
    }
}
