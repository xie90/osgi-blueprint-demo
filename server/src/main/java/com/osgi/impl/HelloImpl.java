package com.osgi.impl;

import com.osgi.inter.Hello;

public class HelloImpl implements Hello {
    public void sayHello(String word) {
        System.out.println(word);
    }

    public void startup(){
        System.out.println("server start up");
    }
}
