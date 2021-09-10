import ejercicio1.MayorMenorEsIgual;
import ejercicio10.Concatenar;
import ejercicio11.longitudContador;
import ejercicio12.PalabrasIguales;
import ejercicio13.Fecha;
import ejercicio2.CompararNumeros;
import ejercicio3.AreaCirculo;
import ejercicio4.Producto;
import ejercicio5.ParImpar;
import ejercicio6.ParImparFor;
import ejercicio7.MayorIgualCero;
import ejercicio8.DiaLaboral;
import ejercicio9.Remplazar;

import javax.swing.JOptionPane;
import java.util.Scanner;

public class Main {
    static int select = -1;
    Scanner menu = new Scanner(System.in);//opción elegida del usuario


    public static void main(String[] args) {
        while (select != 0) {
            try {
                String lectura = JOptionPane.showInputDialog("************************\nElige opción:\n1.-  Ejercicio Uno" +
                        "\n2.-  Ejercicio Dos\n" +
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
                        MayorMenorEsIgual main = new MayorMenorEsIgual();
                        main.compararNumeros(2, 2);
                        main.compararNumeros(-5, 5);
                        main.compararNumeros(5, -2);
                        main.compararNumeros(3, 8);
                        break;
                    case 2:
                        CompararNumeros comparar = new CompararNumeros();
                        int num1 = Integer.parseInt(JOptionPane.showInputDialog("Ingese el numero Uno"));
                        int num2 = Integer.parseInt(JOptionPane.showInputDialog("Ingese el numero Dos"));
                        comparar.comparar(num1, num2);
                        break;
                    case 3:
                        AreaCirculo area = new AreaCirculo();
                        Double radio = Double.parseDouble(JOptionPane.showInputDialog("Digite el valor numerico para el radio del circulo "));
                        JOptionPane.showMessageDialog(null, "El are del circulo es: " + String.format("%.2f", area.calcularAreaCirculo(radio)));

                        break;
                    case 4:
                        Double precio = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese el valor del producto "));
                        Producto producto = new Producto();
                        JOptionPane.showMessageDialog(null, "El precio final es: " + producto.calcularIVA(precio));
                        break;
                    case 5:
                        ParImpar parImpar = new ParImpar();
                        parImpar.mostrarNumeros();
                        break;
                    case 6:
                        ParImparFor parImparFor = new ParImparFor();
                        parImparFor.mostrarNumeros();
                        break;
                    case 7:
                        MayorIgualCero mayorIgualCero = new MayorIgualCero();
                        mayorIgualCero.mayorIgualCero();
                        break;
                    case 8:
                        DiaLaboral diaLaboral = new DiaLaboral();
                        diaLaboral.semanaLaboral();
                        break;
                    case 9:
                        Remplazar remplazar = new Remplazar();
                        remplazar.reemplaza();
                        break;
                    case 10:
                        Concatenar concatenar = new Concatenar();
                        concatenar.reemplaza();
                        break;
                    case 11:
                        longitudContador longitudCont = new longitudContador();
                        String frase = JOptionPane.showInputDialog("Ingrese una frase: ");
                        longitudCont.longitud(frase);
                        longitudCont.contadorA(frase);
                        break;
                    case 12:
                        PalabrasIguales palabrasIguales = new PalabrasIguales();
                        palabrasIguales.diferencia();
                    case 13:
                        Fecha fecha = new Fecha();
                        fecha.fecha();


                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Opcion no valida");
            }
        }
    }
}
