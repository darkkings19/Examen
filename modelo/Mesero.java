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
    public boolean pedidoExiste(String PlatoPrincipal){
        for(Pedido e: this.Pedidos){
            if(e.getPlatoPrincipal().equals(PlatoPrincipal)){
                return true;
            }
        }
        return false;
    }
    public void añadirPedido(){
        this.Pedidos.add(new Pedido("pollo con arroz","surtida","yoghurt"));
        this.Pedidos.add(new Pedido("tallarines con salsa","pepino","jalea"));
    }
    public void eliminarPedido(String platoPrincipal, String ensalada,String postre){
        for(Pedido pedido: this.Pedidos){
            if (pedido.getPlatoPrincipal().equals(platoPrincipal) && pedido.getEnsalada().equals(ensalada) && pedido.getPostre().equals(postre)){
                this.Pedidos.remove(pedido);
                break;
            }
        }
    }
    public void motrarPedido(List<Pedido> Pedidos){
        for (Pedido pedido:Pedidos) {
            String datos="Plato Principal: "+pedido.getPlatoPrincipal() +", Ensalada: "+pedido.getEnsalada()+", Postre: "+pedido.getPostre();
            System.out.println(datos);
        }
    }
}
