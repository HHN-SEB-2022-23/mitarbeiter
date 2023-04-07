package de.hhn;

import jdk.jshell.spi.ExecutionControl;

/**
 * @author Jan-Niklas Jäger
 */
public class ATAngestellter implements IMitarbeiter, ISteuerZahler {

    private float monatsLohn;
    private float jahresGehaltBisHeute = 0f;
    private String vorname;
    private String nachname;
    vertragsArtT vertrag = vertragsArtT.ZEITARBEITER;

    public ATAngestellter(String vorname, String nachname, float monatsLohn) {
        this.vorname = vorname;
        this.nachname = nachname;
        this.monatsLohn = monatsLohn;

        if (monatsLohn / 160 < 12) {
            System.err.println("Mindestlohn nicht erreicht.");
        }
    }


    public float getMonatsLohn() {

        return monatsLohn;
    }

    public String getnachName() {
        return nachname;
    }

    public String getvorname() {
        return vorname;
    }

    @Override

    public float entgeltBerechnen() {
        jahresGehaltBisHeute += monatsLohn;
        return monatsLohn;
    }

    @Override
    public float tatsächlicheEinkommenSteuer() {
        return jahresGehaltBisHeute / 0.36f;
    }

    @Override
    public float voraussichtlicheEinkommenSteuer() {
        System.err.println("");
        return 0;
    }
}
