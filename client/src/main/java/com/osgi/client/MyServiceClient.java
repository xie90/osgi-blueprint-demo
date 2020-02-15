package com.osgi.client;

import com.osgi.inter.Hello;

public class MyServiceClient {
    private Hello hello;

    public Hello getHello() {
        return hello;
    }

    public void setHello(Hello hello) {
        this.hello = hello;
    }

    public void doTest(){
        System.out.println("client start test");
        hello.sayHello("hello world");
        System.out.println("client test end");
    }

}
