package ru.gb.zoo;

import java.io.Serializable;

public abstract class Animal implements Speakable, Serializable {
    private String name;
    private String color;

    public String getName() {
        return name;
    }

}
