package de.hhn;

/**
* @author Jan-Niklas Jäger
*/
public class ATAngestellter extends Mitarbeiter {

    private float monatsLohn;


    public float getMonatsLohn(){
        return monatsLohn;
    }
    @Override

    public float entgeltBerechnen(){
            return monatsLohn;
    }
}
