import ejercicio1.ParEsIgual;

import javax.swing.JOptionPane;
import java.util.Scanner;

public class Main {
    static int select = -1;
    Scanner menu = new Scanner(System.in);//opción elegida del usuario


    public static void main(String[] args) {
        while (select != 0) {
            try {
                String lectura = JOptionPane.showInputDialog("************************\nElige opción:\n1.-  Ejercicio Uno" +
                "\n2.- Ejercicio Dos\n" +
                        "3.-  Ejercicio Tres\n" +
                        "4.-  Ejercicio Cuatro \n" +
                        "5.-  Ejercicio Cinto \n" +
                        "6.-  Ejercicio Seis \n" +
                        "7.-  Ejercicio Siete \n" +
                        "8.-  Ejercicio Ocho \n" +
                        "9.-  Ejercicio Nueve \n" +
                        "10.- Ejercicio Diez \n" +
                        "11.- Ejercicio Once \n" +
                        "12.- Ejercicio Doce \n" +
                        "13.- Ejercicio Trece \n" +
                        "14.- Ejercicio Catorce \n" +
                        "15.- Ejercicio Quince \n" +
                        "16.- Ejercicio Dieciseis \n" +
                        "17.- Ejercicio Diecisiete \n" +
                        "18.- Ejercicio Dieciocho \n" +
                        "0.- Salir\n************************\n Ingresa un numero para optener el ejercicio");

                select = Integer.parseInt(lectura);
                switch (select) {

                    case 1:
                        ParEsIgual main = new ParEsIgual();
                        main.compararNumeros(2, 2);
                        main.compararNumeros(-5, 5);
                        main.compararNumeros(5, -2);
                        main.compararNumeros(3, 8);
                        break;

                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Uoop! Error!");
            }


        }
    }
}
