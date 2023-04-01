package de.hhn;

public abstract class Mitarbeiter {
    private String vorname = "";
    private String nachname = "";
    private float jahresGehaltBisHeute = 0f;

    public Mitarbeiter() { }

    public String getVorname() {
        return this.vorname;
    }

    public String getNachname() {
        return this.nachname;
    }

    public float getJahresGehaltBisHeute() {
        return this.jahresGehaltBisHeute;
    }

    public abstract float entgeldBerechnen();

    @Override public String toString() {
        return "Mitarbeiter{" +
            "vorname='" + this.vorname + '\'' +
            ", nachname='" + this.nachname + '\'' +
            ", jahresGehaltBisHeute=" + this.jahresGehaltBisHeute +
            '}';
    }
}
