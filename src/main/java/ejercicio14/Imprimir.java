package ejercicio14;


import javax.swing.*;
import java.util.Scanner;

public class Imprimir {

    public static void leerNumero(){
        int num8 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero"));
        imprimirSerie(num8);
    }

    public static void imprimirSerie(int num){
        while (num <= 1000){
            JOptionPane.showMessageDialog(null, num);
            num += 2;
        }
        JOptionPane.showMessageDialog(null,"Numero no valido es mayor a 1000");

    }


}

