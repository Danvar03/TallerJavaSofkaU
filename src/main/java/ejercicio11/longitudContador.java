package ejercicio11;

import javax.swing.*;

public class longitudContador {


    public static void longitud(String frase) {
        JOptionPane.showMessageDialog(null, "La longitud  de la frase es: " + frase.length());
    }

    public static void contadorA(String frase) {
        char letra;
        int lengthText, contA = 0;
        lengthText = frase.length();
        int conA = 0, conE = 0, conI = 0, conO = 0, conU = 0;

        for (int i = 0; i < lengthText; i++) {
            switch (frase.charAt(i)) {
                case 'a':
                    conA++;
                    break;
                case 'e':
                    conE++;
                    break;
                case 'i':
                    conI++;
                    break;
                case 'o':
                    conO++;
                    break;
                case 'u':
                    conU++;
                    break;
            }
        }

        JOptionPane.showMessageDialog(null, "la a esta : " + conA + "\nla e esta : " + conE +
                "\nla i esta : " + conI + "\nla o esta : " + conO + "\nla u esta : " + conU);
    }
}

/*
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese una frase: ");
        String frase = sc.nextLine().toLowerCase();
        longitud(frase);
        contadorA(frase);
    }

    public static void longitud(String frase) {
        System.out.println("La longitud  de la frase es: " + frase.length());
    }

    public static void contadorA(String frase) {
        char letra;
        int lengthText, contA = 0;
        lengthText = frase.length();
        int conA = 0, conE = 0, conI = 0, conO = 0, conU = 0;

        for (int i = 0; i < lengthText; i++) {
            switch (frase.charAt(i)) {
                case 'a':
                    conA++;
                    break;
                case 'e':
                    conE++;
                    break;
                case 'i':
                    conI++;
                    break;
                case 'o':
                    conO++;
                    break;
                case 'u':
                    conU++;
                    break;
            }
        }

        System.out.println("la a esta : " + conA + "\nla e esta : " + conE +
                "\nla i esta : "+ conI+ "\nla o esta : " + conO + "\nla u esta : " + conU );
    }
}



 */



