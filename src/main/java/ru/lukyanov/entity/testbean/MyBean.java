package ru.lukyanov.entity.testbean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;

@Data
@AllArgsConstructor
@Slf4j
public class MyBean {
    private String name;

    public void doMyInit() {
        log.warn("Init testBean named {}", name);
    }

    public void doMyDestroy() {
        log.warn("Destroy testBean named {}", name);
    }
}
