package de.hhn;

/**
* @author Jan-Niklas Jäger
*/
public class ATAngestellter extends Mitarbeiter {

    private float monatsLohn;

    public ATAngestellter(){

    }


    public float getMonatsLohn(){
        return monatsLohn;
    }
    @Override

    public float entgeltBerechnen(){
            return monatsLohn;
    }
}
