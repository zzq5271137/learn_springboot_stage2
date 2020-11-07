package com.mycomp.config;

import com.mycomp.Application;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = Application.class)
public class MyPropertiesTest {

    @Autowired
    private MyProperties myProperties;

    @Test
    public void test() {
        System.out.println("driverClassName: " + myProperties.getDriverClassName());
        System.out.println("url: " + myProperties.getUrl());
        System.out.println("username: " + myProperties.getUsername());
        System.out.println("password: " + myProperties.getPassword());
        System.out.print("arrayPros: ");
        for (int i = 0; i < myProperties.getArrayPros().length; i++) {
            if (i != myProperties.getArrayPros().length - 1) {
                System.out.print(myProperties.getArrayPros()[i] + ",");
            } else {
                System.out.println(myProperties.getArrayPros()[i]);
            }
        }
        System.out.println("listPros: " + myProperties.getListPros());
        System.out.println("mapPros: " + myProperties.getMapPros());
        System.out.println("listMapPros: " + myProperties.getListMapPros());
        System.out.println("user: " + myProperties.getUser());
    }

}
