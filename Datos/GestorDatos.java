package Datos;
import modelo.Pedido;
import  modelo.Mesero;

import java.io.*;
import java.util.ArrayList;
public class GestorDatos {
    public static boolean guardarDatos(Object objeto, String ruta) {
        boolean lineaVacia= false;
        try {
            File file = new File(ruta);
            if (!file.exists()) {
                file.createNewFile();
                lineaVacia=true;
            }
            FileWriter archivo =new FileWriter(ruta, true);
            BufferedWriter bw = new BufferedWriter(archivo);

            if (!lineaVacia){
                bw.newLine();
            }
            bw.write(objeto.toString());
            bw.close();
            return true;
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
    }
    public static void leerArchivoPedidos(Mesero mesero, String ruta) {
        String textoArchivo = "";
        try {
            FileReader fr = new FileReader(ruta);
            BufferedReader br = new BufferedReader(fr);
            while ((textoArchivo = br.readLine()) != null) {
                String[] data = textoArchivo.split(";");
                mesero.getPedidos().add(new Pedido(data[0], data[1],data[2]));
            }
        } catch (Exception e) {
            System.out.println(e);
            System.out.println("Documento no disponible(prod)");
        }
    }
}
