package main;
import  modelo.*;
import  GUI.*;
public class Main {
    public static void main(String[] args) {
        Mesero mesero = new Mesero();
        new ventanaMenuInicial(mesero);
    }
}
