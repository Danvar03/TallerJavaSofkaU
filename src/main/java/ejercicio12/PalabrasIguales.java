package ejercicio12;

import javax.swing.*;

public class PalabrasIguales {

    public static void diferencia() {
        String texto1= JOptionPane.showInputDialog("Ingrese la primera palabra");
        String texto2= JOptionPane.showInputDialog("Ingrese la segunda palabra");
        if (texto1.equalsIgnoreCase(texto2)) {
            JOptionPane.showMessageDialog(null,texto1 +" y " +texto2 +" son iguales");
        }else{
            JOptionPane.showMessageDialog(null,texto1 +" y "+ texto2 + " son diferentes");
        }
    }
}