package com.guztaver.vector.entities;

public class Person {
    private String personName;
    private int personAge;
    private float personHeight;

    public Person(String personName, int personAge, float personHeight) {
        this.personName = personName;
        this.personAge = personAge;
        this.personHeight = personHeight;
    }

    public String getPersonName() {
        return personName;
    }

    public void setPersonName(String personName) {
        this.personName = personName;
    }

    public int getPersonAge() {
        return personAge;
    }

    public void setPersonAge(int personAge) {
        this.personAge = personAge;
    }

    public float getPersonHeight() {
        return personHeight;
    }

    public void setPersonHeight(float personHeight) {
        this.personHeight = personHeight;
    }
}
