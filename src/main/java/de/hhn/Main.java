package de.hhn;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<ISteuerZahler> mitarbeiter = new ArrayList<>(3);
        mitarbeiter.add(new Angestellter("Rene", "Ott", 50000, 20, 4));
        mitarbeiter.add(new ATAngestellter("Jan-Niklas", "Jäger", 50200));
        mitarbeiter.add(new Zeitarbeiter("Felix", "Marzioch", 25, 400));

        for (var m : mitarbeiter) {
            System.out.printf(
                "%s tatsächlicheEinkommenSteuer: %s voraussichtlicheEinkommenSteuer: %s€%n",
                m,
                m.tatsächlicheEinkommenSteuer(),
                m.voraussichtlicheEinkommenSteuer()
            );
        }
    }
}
