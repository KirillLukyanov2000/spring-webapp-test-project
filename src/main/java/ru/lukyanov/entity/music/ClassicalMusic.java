package ru.lukyanov.entity.music;


import ru.lukyanov.entity.music.performer.Musician;

import java.util.List;

import static ru.lukyanov.config.AppConfig.getRandom;

public class ClassicalMusic implements Music {

    private Musician musician;
    private List<String> songs = List.of("Classical song 1", "Classical Song 2", "Classical song 3");

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
        return songs.get(getRandom().nextInt(3));
    }
}
