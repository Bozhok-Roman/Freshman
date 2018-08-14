package com.company;

import java.util.List;

public class Group {
    private String name;
    private List<Student> students;


    public Group(String name, List<Student> students) {
        this.name = name;
        this.students = students;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public void setClassLead(){
        int maxNumberOfQualities = students.get(0).getQualities().length;
        int index = 0;
        int next;
        for (int i = 1 ; i<students.size();i++){
            next = students.get(i).getQualities().length;
            if (next>maxNumberOfQualities){
                maxNumberOfQualities = next;
                index = i;
            }

        }
        Student classLead = students.get(index);
        Student c1 = new ClassLead(classLead.getName(),classLead.getSecondName(),classLead.getAge(),classLead.getGroup(),classLead.isPresence(),classLead.getQualities());
        students.set(index,c1);


    }

    public ClassLead getClassLead(){
        System.out.println("Староста:");
        for (Student st:students) {
            if (st.getClass() == ClassLead.class)
                return (ClassLead)st;

        }
        return null ;
    }

    @Override
    public String toString() {
        return "Group{" +
                "name='" + name + '\'' +
                ", students=" + students +
                '}';
    }
}
