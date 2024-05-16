package com.in28minutes.spring.learnspringframework.game;

import com.in28minutes.spring.learnspringframework.GamingConsole;

public class PacMan implements GamingConsole {
    @Override
    public void up()
    {
        System.out.println("PacMan Up");
    }
    @Override
    public void down()
    {
        System.out.println("PacMan Down");
    }
    @Override
    public void left()
    {
        System.out.println("PacMan Left");
    }
    @Override
    public void right()
    {
        System.out.println("PacMan Right");
    }
}
