package ejercicio15;

import javax.swing.*;

public class MenuW {
    public void listaMenu() {
        int opc = 0;
        do {
          opc = Integer.parseInt(JOptionPane.showInputDialog("****** GESTION CINEMATOGRAFICA ********\n" +
                    "1-NUEVO ACTOR\n" +
                    "2-BUSCAR ACTOR\n" +
                    "3-ELIMINAR ACTOR\n"+
                    "4-MODIFICAR ACTOR\n"+
                    "5-VER TODOS LOS ACTORES\n"+
                    "6- VER PELICULAS DE LOS ACTORES\n" +
                    "7-VER CATEGORIA DE LAS PELICULAS DE LOS ACTORES\n" +
                    "8-SALIR\n" +
                    "DIGITA UNA OPCION: "));
            switch (opc) {
                case 8:
                    JOptionPane.showMessageDialog(null,"Chao, Regresa");
                    break;
            }
        } while (opc != 8);
    }
}