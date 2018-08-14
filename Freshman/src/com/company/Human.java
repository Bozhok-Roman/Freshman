package com.company;

public abstract class Human {
    private String name;
    private String secondName ;
    private int age ;

    public Human(String name, String secondName, int age) {
        this.name = name;
        this.secondName = secondName;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return
                "Name='" + name + '\'' +
                ", secondName='" + secondName + '\'' +
                ", age=" + age ;
    }
}
