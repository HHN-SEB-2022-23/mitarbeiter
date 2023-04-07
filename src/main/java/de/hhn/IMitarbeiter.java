package de.hhn;

/**
 * @author Frank Mayer
 */
public interface IMitarbeiter {
    String vorname;
    String nachname;
    float jahresGehaltBisHeute;
    final float mindestLohn = 12.00f;
    vertragsArtT vertrag;

    float entgeltBerechnen();
}
