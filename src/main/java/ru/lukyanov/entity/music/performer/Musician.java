package ru.lukyanov.entity.music.performer;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Data
@NoArgsConstructor
@Slf4j
public class Musician {

    private String name;
    private boolean hasExperience;

    public void doMusicianInit() {
        log.warn(">>> Init Musician Bean {}", name);
    }

    //NOT AVAILABLE AS BEAN HAS PROTOTYPE SCOPE
    public void doMusicianDestroy() {
        log.warn(">>> Destroy Musician Bean");
    }
}
