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
    public float entgeldBerechnen() {
            float entgeld = gearbeiteteStunden * stundenLohn;
            return entgeld;
    }

    public float getStundenLohn(){
        return stundenLohn;
    }

    public int getGearbeiteteStunden() {
        return gearbeiteteStunden;
    }

    public void setGearbeiteteStunden(int gearbeiteteStunden) {
        this.gearbeiteteStunden = gearbeiteteStunden;
    }
}
