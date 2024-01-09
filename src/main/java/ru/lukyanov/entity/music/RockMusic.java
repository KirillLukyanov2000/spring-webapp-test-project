package ru.lukyanov.entity.music;

import lombok.Data;
import ru.lukyanov.entity.music.performer.Singer;

@Data
public class RockMusic implements Music {
    private MusicInstrument musicInstrument;
    private Singer singer;


    public MusicInstrument getMusicInstrument() {
        return musicInstrument;
    }

    public void setMusicInstrument(MusicInstrument musicInstrument) {
        this.musicInstrument = musicInstrument;
    }

    @Override
    public String getSong() {
        return "Rock Music";
    }


}

