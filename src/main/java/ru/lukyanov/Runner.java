package ru.lukyanov;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import ru.lukyanov.entity.music.ClassicalMusic;
import ru.lukyanov.entity.music.RockMusic;
import ru.lukyanov.entity.music.performer.Musician;
import ru.lukyanov.entity.testbean.MyBean;
import ru.lukyanov.service.MusicPlayer;

@Slf4j
public class Runner {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        MyBean myBean = context.getBean("myBean", MyBean.class);
        log.info(myBean.getName());


        ClassicalMusic classicalMusic = context.getBean(ClassicalMusic.class);
        log.info("{} playing in {} by {}", classicalMusic.getSong(), classicalMusic.getMusicInstrument().getName(), classicalMusic.getMusician());

        MusicPlayer musicPlayer = context.getBean(MusicPlayer.class);
        musicPlayer.playMusic();

        RockMusic rockMusic = context.getBean(RockMusic.class);
        log.info("Singer of {} is {} of {}", rockMusic.getClass().getSimpleName(), rockMusic.getSinger().getName(), rockMusic.getSinger().getBandName());

        Musician musician2 = context.getBean(Musician.class);
        musician2.setName("Alexey");
        log.info(musician2.getName());

        context.close();

    }


}
