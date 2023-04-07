package de.hhn;

/**
 * @author Frank Mayer
 */
public interface IMitarbeiter {
    String vorname = null;
    String nachname = null;
    float jahresGehaltBisHeute = 0f;
    final float mindestLohn = 12.00f;
    vertragsArtT vertrag = null;

    float entgeltBerechnen();
}
