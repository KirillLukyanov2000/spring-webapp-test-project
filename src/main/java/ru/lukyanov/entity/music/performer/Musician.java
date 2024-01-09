package ru.lukyanov.entity.music.performer;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Musician {

    private String name;
    private boolean hasExperience;
}
