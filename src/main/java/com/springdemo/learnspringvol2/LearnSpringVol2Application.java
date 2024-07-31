package com.springdemo.learnspringvol2;

import com.springdemo.learnspringvol2.entity.Auto;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class LearnSpringVol2Application {

    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(SpringConfig.class);

        List<Auto> newCarList = new ArrayList<>();
            newCarList.add(context.getBean("Kia", Auto.class));
            newCarList.add(context.getBean("Mazda", Auto.class));
            newCarList.add(context.getBean("Mercedes", Auto.class));
            newCarList.add(context.getBean("Hyundai", Auto.class));
        newCarList.forEach(System.out::println);
    }

}
