package ejercicio8;

import javax.swing.*;

public class DiaLaboral {

    public enum dias {
        Lunes, Martes, Miercoles, JUeves, Viernes, Sabado, Domingo
    }

    public void semanaLaboral() {


        String message = "";

        dias[] dia = {dias.Lunes, dias.Martes, dias.Miercoles, dias.JUeves, dias.Viernes,
                dias.Sabado, dias.Domingo};

        dias option = (dias) JOptionPane.showInputDialog(null, "Seleccione un dia ",
                "DIAS", JOptionPane.QUESTION_MESSAGE, null,
                dia,
                dia[0]);

        switch (option) {

            case Lunes:
            case Martes:
            case Miercoles:
            case JUeves:
            case Viernes:
                message = "Es un dia laboral";
                break;
            case Sabado:
            case Domingo:
                message = "No es un dia laboral";
        }

        JOptionPane.showMessageDialog(null, message, "ES UN DIA LABORAL ?",
                JOptionPane.INFORMATION_MESSAGE);
    }



    /*public void verificarDiaLoboral() {
        String dia = solicitarDato();
        switch (dia) {
            case "sabado":
            case "domingo":
                System.out.println(dia + " no es laboral");
                break;
            default:
                esLaboral(dia);
        }
    }

    public String solicitarDato() {
        Scanner scn = new Scanner(System.in);
        System.out.println("Introduzca un dia de la semana");
        return scn.nextLine().toLowerCase();
    }

    public void esLaboral(String dia) {
        String semana[] = {"lunes", "martes", "miercoles", "jueves", "viernes"};
        ArrayList<String> entreSemana = new ArrayList<String>(Arrays.asList(semana));
        if (entreSemana.contains(dia)) {
            System.out.println(dia + " es laboral");
        }else{
            System.out.println("Por favor introduzca el nombre del dia bien escrito, sin tildes ni espacios");
        }
    }*/

}
