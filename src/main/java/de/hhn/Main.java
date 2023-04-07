package de.hhn;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<IMitarbeiter> mitarbeiter = new ArrayList<>(3);
        mitarbeiter.add(new Angestellter("Rene", "Ott", 20000, 20, 4));
        mitarbeiter.add(new ATAngestellter("Jan", "Jäger", 20200));
        mitarbeiter.add(new Zeitarbeiter("Felix", "Marzioch", 25, 400));

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
