package com.springdemo.learnspringvol2.entity;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("engine")
@Data
@Scope("prototype")
public class Engine {
    private int id;
    private int capacity;

    public Engine(@Value("0") int id, @Value("0")  int capacity) {
        this.id = id;
        this.capacity = capacity;
    }
}
