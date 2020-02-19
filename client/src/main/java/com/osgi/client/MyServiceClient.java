package com.osgi.client;

import com.osgi.impl.WorldImpl;
import com.osgi.impl2.test1;
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
        WorldImpl.sayWorld("Hello World Again!!!!!");
        test1.sayWorld("test static say:" + "Hello World Again");
        System.out.println("client test end");
    }

}
