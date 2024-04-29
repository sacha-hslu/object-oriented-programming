package sw10;

import java.util.Scanner;

public class TemperaturMain {
    /*
    b)  Code funktioniert nicht wie erwartet. Beim Eingeben von "exit" wir eine NumberFormatException geworfen
    c)  Diese Exception zeigt an, wenn ein String in eine Java Number convertet wird -> float Zuweisung
        Sie ist unchecked, weil man sie durch das Handling der Datentypen einfach verhindern kann
     */
    public static void main(String[] args) {
        String input;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Bitte Temperatur eingeben (oder 'exit' zum Beenden): ");
            input = scanner.next();
            try {
                float value = Float.valueOf(input);
                System.out.println(value);
            } catch (NumberFormatException e) {
                System.out.println("Cannot cast value into float: " + e.getMessage());
            }
        } while (!"exit".equals(input));
        System.out.println("Programm beendet.");
    }
}
