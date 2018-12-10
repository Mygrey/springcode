package com.spring.hello.impl;

import com.spring.hello.HelloWord;

public class OtherHelloWord implements HelloWord {

    @Override
    public void action() {
        System.out.println("Other hello!");
    }
}
