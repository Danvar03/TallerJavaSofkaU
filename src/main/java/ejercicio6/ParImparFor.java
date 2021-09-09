package ejercicio6;

import javax.swing.*;
import java.util.ArrayList;

public class ParImparFor {

    public void mostrarNumeros() {

        ArrayList<Integer> numerosPares = new ArrayList<Integer>();
        ArrayList<Integer> numerosImpares = new ArrayList<Integer>();
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                numerosPares.add(i);
                continue;
            }
            numerosImpares.add(i);
        }
        JOptionPane.showMessageDialog(null,"Numero pares: " + numerosPares + "\n" + "Numeros impares: " + numerosImpares);
    }
}
