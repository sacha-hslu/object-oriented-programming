package ch.hslu.demo.sw10;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Scanner;

public class TemperaturMain {

    private static final Logger LOGGER = LoggerFactory.getLogger(TemperaturMain.class);

    /*
    b)  Code funktioniert nicht wie erwartet. Beim Eingeben von "exit" wir eine NumberFormatException geworfen
    c)  Diese Exception zeigt an, wenn ein String in eine Java Number convertet wird -> float Zuweisung
        Sie ist unchecked, weil man sie durch das Handling der Datentypen einfach verhindern kann
     */
    public static void main(String[] args) {
        String input;
        Scanner scanner = new Scanner(System.in);
        do {
            LOGGER.info("Bitte Temperatur eingeben (oder 'exit' zum Beenden): ");
            input = scanner.next();
            try {
                float value = Float.valueOf(input);
                LOGGER.info(String.valueOf(value));
            } catch (NumberFormatException e) {
                LOGGER.error("Cannot cast value into float: ", e);
            }
        } while (!"exit".equals(input));
        LOGGER.info("Programm beendet.");
    }
}
