package ejercicio2;


import javax.swing.*;

public class CompararNumeros {
    public void comparar(int num1, int num2) {
        if (num1 == num2) {
            JOptionPane.showMessageDialog(null, "Los numeros son iguales");
        } else if (num1 > num2) {
            JOptionPane.showMessageDialog(null,  + num1 + "es mayor " + num2);
        } else {
            JOptionPane.showMessageDialog(null, "El " + num2 + "es mayor " + num1);
        }
    }
}