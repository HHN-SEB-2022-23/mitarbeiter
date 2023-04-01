package de.hhn;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        var mitarbeiter = Arrays.asList(
                new Angestellter("Rene", "Ott", 20000, 20, 4),
                new ATAngestellter("Jan", "Jäger", 20200),
                new Zeitarbeiter("Felix", "Marzioch", 25, 400)
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
