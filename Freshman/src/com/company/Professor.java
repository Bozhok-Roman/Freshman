package com.company;

import java.util.List;

public class Professor extends Human{
    private List<Group> groups;

    public Professor(String name, String secondName, int age) {
        super(name, secondName, age);

    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }

    @Override
    public String getSecondName() {
        return super.getSecondName();
    }

    @Override
    public void setSecondName(String secondName) {
        super.setSecondName(secondName);
    }

    @Override
    public int getAge() {
        return super.getAge();
    }

    @Override
    public void setAge(int age) {
        super.setAge(age);
    }

    @Override
    public String toString() {
        return super.toString();
    }

    public List<Group> getGroups() {
        return groups;
    }

    public void setGroups(List<Group> groups) {
        this.groups = groups;
    }

    public void isPresent (List<Student> students){
        System.out.println("Перекличка");
        int j = 0;
        for (Student i :students) {
            if (i.isPresence()== false) {
                if (j==0){
                    System.out.println("Відсутні:");
                }
                System.out.println(i.getSecondName()+" "+i.getName());
                j=1;
            }

        }
        if (j==0){System.out.println("Всі присутні");}
        System.out.println("Перекличка закінчена"+"\n"+"Професор"+" "+this.getSecondName());


    }
}
