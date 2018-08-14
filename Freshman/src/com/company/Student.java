package com.company;

public class Student extends Human {
    private String group;
    private boolean presence;
    private Qualities[] qualities;

    public Student(String name, String secondName, int age, String group, boolean presence, Qualities... q) {

        super(name, secondName, age);
        this.group = group;
        this.presence = presence;
        this.qualities = new Qualities[q.length];
        for (int i = 0 ; i<q.length ; i++)
            this.qualities[i]= q[i];
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public boolean isPresence() {
        return presence;
    }

    public void setPresence(boolean presence) {
        this.presence = presence;
    }

    public Qualities[] getQualities() {
        return qualities;
    }

    public void setQualities(Qualities[] qualities) {
        this.qualities = qualities;
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
    public void vote (Student other, Qualities ... p){
        Qualities[] newQualitis = new Qualities[other.qualities.length+ p.length];
        System.arraycopy(other.qualities,0,newQualitis,0,other.qualities.length);
        for (int i=0; i<p.length;i++ ){
            newQualitis[other.qualities.length+i]=p[i];

        }
        other.qualities= newQualitis;
    }

}



