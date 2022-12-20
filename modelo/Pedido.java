package modelo;

public class Pedido {
    private String platoPrincipal;
    private String ensalada;
    private String postre;
    public Pedido(String platoPrincipal, String ensalada, String postre){
        this.ensalada = ensalada;
        this.platoPrincipal = platoPrincipal;
        this.postre = postre;
    }
    public String getEnsalada() {
        return ensalada;
    }

    public String getPlatoPrincipal() {
        return platoPrincipal;
    }

    public String getPostre() {
        return postre;
    }

    public void setEnsalada(String ensalada) {
        ensalada = ensalada;
    }

    public void setPlatoPrincipal(String platoPrincipal) {
        platoPrincipal = platoPrincipal;
    }

    public void setPostre(String postre) {
        this.postre = postre;
    }
}

