package de.hhn;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        var mitarbeiter = Arrays.asList(
                new Angestellter("Rene", "Ott"),
                new ATAngestellter("Jan", "Jäger"),
                new Zeitarbeiter("Felix", "Marzioch")
        );

        for (var m : mitarbeiter) {
            System.out.printf(
                "%s <%s> %s€ %s€%n",
                m,
                m.getClass().getSimpleName(),
                m.entgeltBerechnen(),
                m.getJahresGehaltBisHeute()
            );
        }
    }
}
