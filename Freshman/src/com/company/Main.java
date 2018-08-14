package com.company;

import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) {

        Student st1 = new Student("Roman","Bozhok",19,"IO-63",true, Qualities.INDEPENDENT, Qualities.CLEVER,Qualities.HONEST);
        Student st2 = new Student("Anton","Keleberda",18,"IO-63",true,  Qualities.CLEVER, Qualities.HONEST);
        Student st3 = new Student("Ana","Yzvak",18,"IO-63",true, Qualities.HONEST, Qualities.CLEVER);
        Student st4 = new Student("Jack","Daniels",18,"IO-63",true, Qualities.CONFIDENT, Qualities.CLEVER);
        Student st5 = new Student("Kolia","Visotskii",19,"IO-63",true,  Qualities.CLEVER);
        Student st6 = new Student("Masha","Lotoca",19,"IO-63",true,  Qualities.HONEST);
        Student st7 = new Student("Sasha","Spilberg",18,"IO-63",true, Qualities.HONEST, Qualities.CLEVER);
        Student st8 = new Student("Pasha","Chill",19,"IO-63",true, Qualities.CLEVER);
        Student st9 = new Student("Iana","Gsprv",18,"IO-63",true, Qualities.INDEPENDENT, Qualities.CLEVER);
        Student st10 = new Student("Roman","Abramovich",19,"IO-63",true, Qualities.HONEST, Qualities.CLEVER);


        st3.vote(st1,Qualities.CONFIDENT);
        st10.vote(st5,Qualities.CONFIDENT,Qualities.INDEPENDENT,Qualities.HARDWOKER,Qualities.KIND);
        st5.vote(st10,Qualities.CONFIDENT);

        List<Student> students = new ArrayList<>();
        students.add(st1);
        students.add(st2);
        students.add(st3);
        students.add(st4);
        students.add(st5);
        students.add(st6);
        students.add(st7);
        students.add(st8);
        students.add(st9);
        students.add(st10);

        Group group1 = new Group("IO-63", students);

        group1.setClassLead();
        System.out.println(group1.getClassLead());

        Professor professor = new Professor("Михайло","Новатарський",65);
        professor.isPresent(students);



    }
}
