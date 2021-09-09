package ejercicio5;

import javax.swing.*;
import java.util.ArrayList;


public class ParImpar {
    public void mostrarNumeros() {
        int i = 1;
        ArrayList<Integer> numerosPares = new ArrayList<Integer>();
        ArrayList<Integer> numerosImpares = new ArrayList<Integer>();
        while (i <= 100) {
            if (i % 2 == 0) {
                numerosPares.add(i);
                i++;
                continue;
            }
            numerosImpares.add(i);
            i++;
        }
        JOptionPane.showMessageDialog(null, "Numero pares: " + numerosPares + "\n" + "Numeros impares: " + numerosImpares);
    }
}
