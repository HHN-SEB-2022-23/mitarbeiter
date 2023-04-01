package de.hhn;

/**
 * @author Frank Mayer
 */
public abstract class Mitarbeiter {
    private String vorname = "";
    private String nachname = "";
    private float jahresGehaltBisHeute = 0f;

    public Mitarbeiter() { }

    public String getVorname() {
        return vorname;
    }

    public String getNachname() {
        return nachname;
    }

    public float getJahresGehaltBisHeute() {
        return jahresGehaltBisHeute;
    }

    public abstract float entgeltBerechnen();

    @Override
    public String toString() {
        return "Mitarbeiter{" +
            "vorname='" + vorname + '\'' +
            ", nachname='" + nachname + '\'' +
            ", jahresGehaltBisHeute=" + jahresGehaltBisHeute +
            '}';
    }
}
