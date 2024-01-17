package ru.lukyanov.entity.music;

import lombok.Data;
import ru.lukyanov.entity.music.performer.Singer;

import java.util.List;

import static ru.lukyanov.config.AppConfig.getRandom;

@Data
public class RockMusic implements Music {
    private MusicInstrument musicInstrument;
    private Singer singer;
    private List<String> songs = List.of("Rock song 1", "Rock Song 2", "Rock song 3");

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

