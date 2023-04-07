package de.hhn;

/**
 * @author Frank Mayer
 */
public interface IMitarbeiter {
    String vorname = "";
    String nachname = "";
    float jahresGehaltBisHeute = 0.0f;
    float mindestLohn = 12.00f;

    float entgeltBerechnen();
}
