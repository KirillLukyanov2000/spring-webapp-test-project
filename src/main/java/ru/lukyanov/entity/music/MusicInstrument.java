package ru.lukyanov.entity.music;

public enum MusicInstrument {

    PIANO("piano"),
    GUITAR("guitar");

    public String getName() {
        return name;
    }

    private String name;

    MusicInstrument(String name) {
        this.name = name;
    }
}
