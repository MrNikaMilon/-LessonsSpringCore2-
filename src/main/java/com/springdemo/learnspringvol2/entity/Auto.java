package com.springdemo.learnspringvol2.entity;

import lombok.Data;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("auto")
@Data
@Scope("prototype")
public class Auto {
    private int autoId;
    private String model;
    private Engine engine;

    public Auto(@Value("0") int autoId, @Value("null") String model, @Qualifier("engine") Engine engine) {
        this.autoId = autoId;
        this.model = model;
        this.engine = engine;
    }
}
