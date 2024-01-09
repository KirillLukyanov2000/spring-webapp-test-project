package ru.lukyanov;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import ru.lukyanov.entity.music.ClassicalMusic;
import ru.lukyanov.entity.music.Music;
import ru.lukyanov.entity.music.RockMusic;
import ru.lukyanov.entity.testBean.MyBean;
import ru.lukyanov.service.MusicPlayer;

public class Runner {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        MyBean myBean = context.getBean("myBean", MyBean.class);
        System.out.println(myBean.getName());


        ClassicalMusic classicalMusic = context.getBean(ClassicalMusic.class);
        System.out.println(classicalMusic.getSong() + " playing in "
                + classicalMusic.getMusicInstrument().getName()
                + " by " + classicalMusic.getMusician());


        MusicPlayer musicPlayer = context.getBean(MusicPlayer.class);
        musicPlayer.playMusic();

        RockMusic rockMusic = context.getBean(RockMusic.class);
        System.out.println("Singer of " + rockMusic.getClass().getSimpleName()
                + " is " + rockMusic.getSinger().getName()
                + " of " + rockMusic.getSinger().getBandName());


        context.close();

    }


}
