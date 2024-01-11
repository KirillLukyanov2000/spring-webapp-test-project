package ru.lukyanov.service;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import ru.lukyanov.entity.music.Music;

@Data
@Slf4j
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
        log.info("Playing: {}", music.getSong());

    }
}
