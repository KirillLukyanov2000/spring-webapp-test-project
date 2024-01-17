package ru.lukyanov.entity.xmltestbean;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

@Data
@Slf4j
public class MyXmlBean {
    private String name;

    private MyXmlBean(String name) {
        this.name = name;
    }

    public void doMyInit() {
        log.warn(">>> Init testXmlBean named {}", name);
    }

    public void doMyDestroy() {
        log.warn(">>> Destroy testXmlBean named {}", name);
    }

    public static MyXmlBean getMyBean(String name) {
        return new MyXmlBean(name);
    }


}
