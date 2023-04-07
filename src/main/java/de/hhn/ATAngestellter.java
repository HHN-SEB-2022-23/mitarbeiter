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
    private vertragsArtT vertrag;

    public ATAngestellter(String vorname, String nachname, float monatsLohn) {
        this.vorname = vorname;
        this.nachname = nachname;
        this.monatsLohn = monatsLohn;
        vertrag = vertragsArtT.ATANGESTELLTER;

        if (monatsLohn / 160 < 12) {
            System.err.println("Mindestlohn wird nicht erreicht.");
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

    @Override
    public String toString() {
        return String.format("%s %s, %s", vorname, nachname, vertrag);
    }
}
