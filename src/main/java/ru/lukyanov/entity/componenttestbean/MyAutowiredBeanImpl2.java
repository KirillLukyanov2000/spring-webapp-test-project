package ru.lukyanov.entity.componenttestbean;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class MyAutowiredBeanImpl2 implements MyAutowiredBean{

}
