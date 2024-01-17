package ru.lukyanov.entity.componenttestbean;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
@Data
@Slf4j
public class MyComponentBean {
    private String name;
    private MyAutowiredBean myAutowiredBean;

    @Autowired
    public MyComponentBean(@Value("${myComponentBean.name}") String name, @Qualifier("myAutowiredBeanImpl2") MyAutowiredBean myAutowiredBean) {
        this.name = name;
        this.myAutowiredBean = myAutowiredBean;
    }

    @PostConstruct
    public void doMyComponentBeanInit() {
        log.warn(">>> Init testComponentBean named {}", name);
    }

    @PreDestroy
    public void doMyComponentBeanDestroy() {
        log.warn(">>> Destroy testComponentBean named {}", name);
    }
}
