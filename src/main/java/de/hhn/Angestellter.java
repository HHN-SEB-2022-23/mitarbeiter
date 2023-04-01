package de.hhn;

/**
 * @author René Ott
 */
public class Angestellter extends Mitarbeiter{

    private float monatsLohn;
    private float ueberStundenTarif;
    private int gearbeiteteUeberstunden;

    public Angestellter(float monatsLohn, float ueberStundenTarif, int gearbeiteteUeberstunden){

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
    public float entgeltBerechnen(){
        float entgelt = monatsLohn + (gearbeiteteUeberstunden * ueberStundenTarif);
        return entgelt;
    }
}
