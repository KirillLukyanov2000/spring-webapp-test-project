package ru.lukyanov.service;

import lombok.Data;
import ru.lukyanov.entity.music.Music;

@Data
public class MusicPlayer {
    private String name;
    private int volume;


    //@Qualifier("classicalMusic")
    private Music music;

    public MusicPlayer(Music music) {
        this.music = music;
    }

    public void setMusic(Music music) {
        this.music = music;
    }

    public void playMusic() {
        System.out.println("Playing: " + music.getSong());
    }
}
