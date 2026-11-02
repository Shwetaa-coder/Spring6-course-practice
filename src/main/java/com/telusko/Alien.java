package com.telusko;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.beans.ConstructorProperties;
@Component
public class Alien {
    @Value("21")
    private int age;


    // @Qualifier("laptop")
    private Computer com;
    public Alien()
    {
        System.out.println("object created");
    }
//    @ConstructorProperties({"age","lap"})
//    public Alien(int age, Computer com)
//    {
//        //System.out.println("para constructor called");
//        this.age = age;
//        this.lap= lap;
//    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
     //   System.out.println("setter called");
        this.age = age;
    }

    public Computer getCom() {
        return com;
    }

    public void setCom(Computer com) {
        this.com = com;
    }

    public void code()
    {
        System.out.println("coding");
        com.compile();
    }
}
