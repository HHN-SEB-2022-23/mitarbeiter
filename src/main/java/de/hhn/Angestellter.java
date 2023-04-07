package de.hhn;

import jdk.jshell.spi.ExecutionControl;

/**
 * @author René Ott
 */
public class Angestellter implements IMitarbeiter {

    private String vorname;
    private String nachname;
    private float monatsLohn;
    private float ueberStundenTarif;
    private int gearbeiteteUeberstunden;
    private float jahresGehaltBisHeute = 0f;

    public Angestellter(String vorname, String nachname, float monatsLohn, float ueberStundenTarif, int gearbeiteteUeberstunden) throws Exception{
        this.vorname = vorname;
        this.nachname = nachname;
        this.monatsLohn = monatsLohn;
        this.ueberStundenTarif = ueberStundenTarif;
        this.gearbeiteteUeberstunden = gearbeiteteUeberstunden;

        if(monatsLohn <= (160*mindestLohn)){
            throw new Exception("Mindestlohn wird nicht erreicht.");
        }
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

    public float entgeltBerechnen() {
        float entgelt = monatsLohn + (gearbeiteteUeberstunden * ueberStundenTarif);
        jahresGehaltBisHeute += entgelt;
        return entgelt;
    }

    @Override
    private float tatsächlicheEinkommenSteuer(){
        return jahresGehaltBisHeute*0.36f;
    }

    @Override
    private float voraussichtlicheEinkommenSteuer(){

    }
}
