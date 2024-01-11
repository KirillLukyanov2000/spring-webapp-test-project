package ru.lukyanov.entity.music;


import ru.lukyanov.entity.music.performer.Musician;

public class ClassicalMusic implements Music {

    private Musician musician;

    public Musician getMusician() {
        return musician;
    }

    public void setMusician(Musician musician) {
        this.musician = musician;
    }

    private MusicInstrument musicInstrument;

    public MusicInstrument getMusicInstrument() {
        return musicInstrument;
    }

    public void setMusicInstrument(MusicInstrument musicInstrument) {
        this.musicInstrument = musicInstrument;
    }

    @Override
    public String getSong() {
        return "Classical Music";
    }
}
