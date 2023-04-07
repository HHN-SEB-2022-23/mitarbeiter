package de.hhn;

/**
 * @author Jan-Niklas Jäger
 */
public class ATAngestellter extends Mitarbeiter {

    private float monatsLohn;
    private float jahresGehaltBisHeute = 0;
    private String vorname;
    private String nachname;

    public ATAngestellter(String vorname, String nachname, float monatsLohn) {
        this.vorname = vorname;
        this.nachname = nachname;
        this.monatsLohn = monatsLohn;
    }

<<<<<<< Updated upstream
    public float getMonatsLohn(){
=======

    public float getMonatsLohn() {
>>>>>>> Stashed changes
        return monatsLohn;
    }

    @Override

    public float entgeltBerechnen() {
        jahresGehaltBisHeute += monatsLohn;
        return monatsLohn;
    }

    public float tatsächlicheEinkommensSteuer(){

    }

    public float vorraussichtlicheEinkommmensSteuer(){

    }
}
