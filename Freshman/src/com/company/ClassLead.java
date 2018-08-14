package com.company;

public class ClassLead extends Student {
    public ClassLead(String name, String secondName, int age, String group, boolean presence, Qualities... q) {
        super(name, secondName, age, group, presence, q);
    }
}
