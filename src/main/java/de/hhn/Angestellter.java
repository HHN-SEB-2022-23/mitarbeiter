package de.hhn;

import jdk.jshell.spi.ExecutionControl;

/**
 * @author René Ott
 */
public class Angestellter extends Mitarbeiter{

    private float monatsLohn;
    private float ueberStundenTarif;
    private int gearbeiteteUeberstunden;

    public Angestellter(String vorname, String nachname, float monatsLohn, float ueberStundenTarif, int gearbeiteteUeberstunden){
        super(vorname, nachname);
        this.monatsLohn = monatsLohn;
        this.ueberStundenTarif = ueberStundenTarif;
        this.gearbeiteteUeberstunden = gearbeiteteUeberstunden;
    }

    public float getMonatsLohn(){
        return monatsLohn;
    }

    public float getUeberStundenTarif(){
        return ueberStundenTarif;
    }

    public int getGearbeiteteUeberstunden(){
        return gearbeiteteUeberstunden;
    }

    public void setGearbeiteteUeberstunden(int x){
        gearbeiteteUeberstunden = x;
    }

    @Override
    public float entgeltBerechnen() {
        float entgelt = monatsLohn + (gearbeiteteUeberstunden * ueberStundenTarif);
        jahresGehaltBisHeute += entgelt;
        return entgelt;
    }
}
