package ejercicio10;

import javax.swing.*;

public class Concatenar {

    public void reemplaza() {
        String texto = JOptionPane.showInputDialog("Ingrese frase para quitar espacios : ");
        JOptionPane.showMessageDialog(null, "Texto original: " + texto + "\n " + "Texto modificaco: " + "" + texto.replaceAll(" ", ""));


    }
}
