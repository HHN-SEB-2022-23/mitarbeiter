package de.hhn;

/**
 * @author René Ott
 */
public class Angestellter implements IMitarbeiter, ISteuerZahler {

    private String vorname;
    private String nachname;
    private float monatsLohn;
    private float überStundenTarif;
    private int gearbeiteteÜberstunden;
    private float jahresGehaltBisHeute = 0f;
    private vertragsArtT vertrag;

    public Angestellter(String vorname, String nachname, float monatsLohn, float überStundenTarif, int gearbeiteteÜberstunden){
        this.vorname = vorname;
        this.nachname = nachname;
        this.monatsLohn = monatsLohn;
        this.überStundenTarif = überStundenTarif;
        this.gearbeiteteÜberstunden = gearbeiteteÜberstunden;
        vertrag = vertragsArtT.ANGESTELLTER;

        if(monatsLohn < (160* mindestLohn )){
            System.err.println("Mindestlohn wird nicht erreicht.");
        }
    }

    public float getMonatsLohn(){
        return monatsLohn;
    }

    public float getÜberStundenTarif(){
        return überStundenTarif;
    }

    public int getGearbeiteteÜberstunden(){
        return gearbeiteteÜberstunden;
    }

    public void setGearbeiteteÜberstunden(int x){
        gearbeiteteÜberstunden = x;
    }

    public float entgeltBerechnen() {
        float entgelt = monatsLohn + (gearbeiteteÜberstunden * überStundenTarif);
        jahresGehaltBisHeute += entgelt;
        return entgelt;
    }

    public String getVorname() {
        return vorname;
    }

    public String getNachname() {
        return nachname;
    }

    @Override
    public String toString() {
        return String.format("%s %s, %s", vorname, nachname, vertrag);
    }

    @Override
    public float tatsächlicheEinkommenSteuer(){
        return jahresGehaltBisHeute*0.36f;
    }

    @Override
    public float voraussichtlicheEinkommenSteuer(){
        System.err.println("voraussichtlicheEinkommenSteuer not implemented");
        return 0;
    }
}
