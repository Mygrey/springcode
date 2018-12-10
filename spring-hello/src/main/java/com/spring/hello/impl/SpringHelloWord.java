package com.spring.hello.impl;

import com.spring.hello.HelloWord;

public class SpringHelloWord implements HelloWord {

    @Override
    public void action() {
        System.out.println("Spring hello!");
    }
}
