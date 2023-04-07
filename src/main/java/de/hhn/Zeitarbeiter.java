package de.hhn;

import jdk.jshell.spi.ExecutionControl;

/**
 * @author Felix Marzioch
 */
public class Zeitarbeiter implements IMitarbeiter, ISteuerZahler {

    private vertragsArtT vertrag;
    private float stundenLohn;
    private int gearbeiteteStunden;
    private String vorname;
    private String nachname;
    private float jahresGehaltBisHeute = 0;

    public Zeitarbeiter(String vorname, String nachname, float stundenLohn, int gearbeiteteStunden){
        this.vertrag = vertragsArtT.ZEITARBEITER;
        this.vorname = vorname;
        this.nachname = nachname;
        this.stundenLohn = stundenLohn;
        this.gearbeiteteStunden = gearbeiteteStunden;
        if (stundenLohn < mindestLohn) {

            System.out.println("Dieser Arbeiter wird unterbezahlt :(");
        }
    }

    public Zeitarbeiter(String vorname, String nachname, float stundenLohn){
        this(vorname, nachname, stundenLohn, 0);
    }

    public float entgeltBerechnen() {
            float entgelt = gearbeiteteStunden * stundenLohn;
            jahresGehaltBisHeute += entgelt;
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

    public String getVorname() {
        return vorname;
    }


    public String getNachname() {
        return nachname;
    }

    @Override
    public String toString() {
        return "Zeitarbeiter{" +
            "vertrag=" + vertrag +
            ", vorname='" + vorname + '\'' +
            ", nachname='" + nachname + '\'' +
            '}';
    }

    @Override
    public float tatsächlicheEinkommenSteuer() {
        return jahresGehaltBisHeute / 0.36f;
    }

    @Override
    public float voraussichtlicheEinkommenSteuer()  {
        return 0;
    }
}
