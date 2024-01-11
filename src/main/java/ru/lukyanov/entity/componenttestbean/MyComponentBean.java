package ru.lukyanov.entity.componenttestbean;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
@Data
public class MyComponentBean {
    private String name;

    private MyAutowiredBean myAutowiredBean;

    @Autowired
    public MyComponentBean(@Value("${myComponentBean.name}") String name, @Qualifier("myAutowiredBeanImpl2") MyAutowiredBean myAutowiredBean) {
        this.name = name;
        this.myAutowiredBean = myAutowiredBean;
    }
}
