package ru.lukyanov;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import ru.lukyanov.entity.componenttestbean.MyAutowiredBeanImpl2;
import ru.lukyanov.entity.componenttestbean.MyComponentBean;
import ru.lukyanov.entity.music.ClassicalMusic;
import ru.lukyanov.entity.music.MusicInstrument;
import ru.lukyanov.entity.music.RockMusic;
import ru.lukyanov.entity.music.performer.Musician;
import ru.lukyanov.entity.xmltestbean.MyXmlBean;
import ru.lukyanov.service.MusicPlayer;

@Slf4j
public class Runner {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        MyXmlBean myXmlBean1 = context.getBean("myXmlBean", MyXmlBean.class);
        log.info("My Xml bean name is {}", myXmlBean1.getName());
        MyXmlBean myXmlBean2 = context.getBean("myXmlBean", MyXmlBean.class);
        myXmlBean2.setName("Kirs");
        log.info("My Xml bean name is {}", myXmlBean2.getName());


        ClassicalMusic classicalMusic = context.getBean(ClassicalMusic.class);
        log.info("{} playing in {} by {}", classicalMusic.getSong(), classicalMusic.getMusicInstrument().getName(), classicalMusic.getMusician());

        MusicPlayer musicPlayer = context.getBean(MusicPlayer.class);
        musicPlayer.playMusic(MusicInstrument.GUITAR);

        RockMusic rockMusic = context.getBean(RockMusic.class);
        log.info("Singer of {} is {} of {}", rockMusic.getClass().getSimpleName(), rockMusic.getSinger().getName(), rockMusic.getSinger().getBandName());

        Musician musician2 = context.getBean(Musician.class);
        musician2.setName("Alexey");
        log.info("Musician name is {}", musician2.getName());


        MyComponentBean componentBean = context.getBean(MyComponentBean.class);
        log.info("My Component bean name is {}", componentBean.getName());
        log.info("Checking my Autowired Bean {}", componentBean.getMyAutowiredBean().getClass().getSimpleName());


        context.close();

    }

}
