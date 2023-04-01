package de.hhn;

/**
 * @author Frank Mayer
 */
public abstract class Mitarbeiter {
    protected String vorname = "";
    protected String nachname = "";
    protected float jahresGehaltBisHeute = 0f;

    public Mitarbeiter(String vorname, String nachname) {
        this.vorname = vorname;
        this.nachname = nachname;
    }

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
        return String.format("%s %s", vorname, nachname);
    }
}
