package ejercicio7;

import javax.swing.*;

public class MayorIgualCero {
    public  void mayorIgualCero() {
        int numero=-1;
        do {
            numero = Integer.parseInt(JOptionPane.showInputDialog("Ingese el numero Uno"));
            JOptionPane.showMessageDialog(null,"Numero ingresado:"+numero);
        }while (numero<0);
    }
}