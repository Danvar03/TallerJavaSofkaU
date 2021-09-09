package ejercicio9;

import javax.swing.*;


public class Remplazar {


    public void reemplaza() {
        String texto1 = "La sonrisa sera la mejor arma contra la tristeza";
        JOptionPane.showMessageDialog(null, "Texto original: \n" + texto1 + "\n Texto moficaco : " + " \n" + texto1.replaceAll("a", "e") + " ");


    }
}