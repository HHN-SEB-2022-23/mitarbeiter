package de.hhn;

/**
* @author Jan-Niklas Jäger
*/
public class ATAngestellter extends Mitarbeiter {

    private float monatsLohn;

    public ATAngestellter(String vorname, String nachname, float monatsLohn){
    super(vorname,nachname);
    this.monatsLohn = monatsLohn;
    }

    public float getMonatsLohn(){
        return monatsLohn;
    }
    @Override

    public float entgeltBerechnen(){
        jahresGehaltBisHeute += monatsLohn;
        return monatsLohn;
    }
}
