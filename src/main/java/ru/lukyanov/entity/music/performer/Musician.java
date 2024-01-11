package ru.lukyanov.entity.music.performer;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.context.annotation.Scope;

@Data
@NoArgsConstructor
public class Musician {

    private String name;
    private boolean hasExperience;
}
