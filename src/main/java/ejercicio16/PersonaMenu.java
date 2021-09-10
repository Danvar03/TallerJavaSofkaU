package ejercicio16;

import javax.swing.*;


public class PersonaMenu {
    public void MenuPers() {

        //Persona llena por teclado
        String nombre = JOptionPane.showInputDialog("Introduzca un nombre");
        int edad = Integer.parseInt(JOptionPane.showInputDialog("Introduzca la edad"));
        String sexo = JOptionPane.showInputDialog("Introduzca el sexo");
        int peso = Integer.parseInt(JOptionPane.showInputDialog("Introduzca el peso"));
        int altura = Integer.parseInt(JOptionPane.showInputDialog("Introduzca la altura"));
        JOptionPane.showMessageDialog(null, " RESULTADO \n");

        Persona persona1 = new Persona(nombre, edad, sexo, peso, altura);
        Persona persona2 = new Persona(nombre, edad, sexo);
        Persona persona3 = new Persona();
        persona3.setNombre("Daniela");
        persona3.setEdad(24);
        persona3.setAltura(180);
        persona3.setPeso(78);
        persona3.setGenero("f");

        JOptionPane.showMessageDialog(null, " RESULTADO \n PERSONA UNO\""
                + persona1.calcularIMC() + "\n" + persona1.esMayorDeEdad() + "\n" + persona1 + "\n PERSONA 2"
                + persona2.calcularIMC() + "\n" + persona2.esMayorDeEdad() + persona2 + "\n PERSONA TRES\""
                + persona3.calcularIMC() + persona3.esMayorDeEdad() + persona3 + "\n ---------------------------------------------------");


    }


}

