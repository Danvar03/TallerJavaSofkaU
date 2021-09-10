package ejercicio13;

import javax.swing.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Fecha {

    public void fecha() {
        DateTimeFormatter FM = DateTimeFormatter.ofPattern("(yyyy/MM/dd) (HH:mm:ss)");
        LocalDateTime actualTime = LocalDateTime.now();
        JOptionPane.showMessageDialog(null, "la Fecha y Hora actual en colombia es: " + FM.format(actualTime));
    }
}


