package com.github.curriculeon;

public class Person {
    private String name;
    private final Long id;

    public Person(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getId() {
        return id;
    }
}
