package de.hhn;

public enum vertragsArtT {
    ATANGESTELLTER("AT Angestellter"),
    ZEITARBEITER("Zeitarbeiter"),
    ANGESTELLTER("Angestellter");

    private final String display;

    vertragsArtT(String display) {
        this.display = display;
    }

    @Override
    public String toString() {
        return display;
    }
}
