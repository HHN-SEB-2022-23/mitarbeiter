package de.hhn;

/**
 * @author Felix Marzioch
 */
public class Zeitarbeiter extends Mitarbeiter {

    private float stundenLohn;
    private int gearbeiteteStunden;

    public Zeitarbeiter(String vorname, String nachname, float stundenLohn, int gearbeiteteStunden){
        super(vorname, nachname);
        this.stundenLohn = stundenLohn;
        this.gearbeiteteStunden = gearbeiteteStunden;
    }

    public Zeitarbeiter(String vorname, String nachname, float stundenLohn){
        this(vorname, nachname, stundenLohn, 0);
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
