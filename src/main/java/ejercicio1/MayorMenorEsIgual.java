package ejercicio1;

import javax.swing.*;

public class MayorMenorEsIgual {
    public void compararNumeros(int num1, int num2) {
        if (num1 == num2) {
            JOptionPane.showMessageDialog(null, "Los numeros son iguales");
        } else if (num1 > num2) {
            JOptionPane.showMessageDialog(null,  "El "+ num1 + " es mayor " + num2);
        } else {
            JOptionPane.showMessageDialog(null, "El " + num2 + " es mayor " + num1);
        }
    }
}






