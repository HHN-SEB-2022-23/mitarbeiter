package de.hhn;

/**
 * @author Felix Marzioch
 */

public class Zeitarbeiter extends Mitarbeiter {

    private float stundenLohn;
    private int gearbeiteteStunden;

    public Zeitarbeiter(){

    }

    @Override
    public float entgeltBerechnen() {
            float entgelt = gearbeiteteStunden * stundenLohn;
            return entgelt;
    }

    public float getStundenLohn(){
        return stundenLohn;
    }

    public int getGearbeiteteStunden() {
        return gearbeiteteStunden;
    }

    public void setGearbeiteteStunden(int x) {
        gearbeiteteStunden = x;
    }
}
