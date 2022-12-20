package GUI;
import javax.swing.*;
import java.awt.*;
public abstract class Ventana extends JFrame {
    public Ventana(){
        this.setResizable(false);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    protected JLabel generarEtiqueta (String texto, Color c, int tamano, int x, int y, int ancho, int largo) {
        JLabel etiqueta = new JLabel(texto);
        etiqueta.setBounds(x, y, ancho, largo);
        etiqueta.setForeground(c);
        etiqueta.setFont(new Font("Terminator Two",Font.PLAIN,tamano));
        this.add(etiqueta);
        return etiqueta;
    }
    protected JButton generarBoton(String texto, int x, int y, int ancho, int largo) {
        JButton boton = new JButton(texto);
        boton.setBounds(x, y, ancho, largo);
        boton.setFont(new Font("Terminator Two",Font.PLAIN,11));
        this.add(boton);
        return boton;
    }
    protected JPanel crearPanel(String categoria, Boolean estado){
        JPanel panel = new JPanel();
        panel.setOpaque(false);
        panel.setBounds(0,0,1200,700);
        panel.setLayout(null);
        panel.setVisible(estado);
        JLabel titulo = generarEtiqueta(categoria,Color.black,24,500, 110, 400, 25);
        panel.add(titulo);
        this.add(panel);
        return panel;
    }
    protected JTextArea areaTexto(String texto, int x, int y, int ancho, int alto){
        JTextArea textArea= new JTextArea();
        textArea.setText(texto);
        textArea.setLineWrap(true);
        textArea.setBounds(x, y, ancho, alto);
        textArea.setFont(new Font("Lucida Console",Font.PLAIN,15));
        textArea.setForeground(Color.black);
        textArea.setOpaque(false);
        //textArea.setBorder(null);
        this.add(textArea);
        return textArea;
    }
    protected void mensajeError(JFrame v, String texto){
        JOptionPane.showMessageDialog(v,texto, "ERROR", JOptionPane.ERROR_MESSAGE);
    }

}
