package com.zipcodewilmington.person;

/**
 * Created by leon on 2/12/18.
 */
public class Person {
    private String name;
    private Integer age;

    //added fields
    private Integer heightInCm;
    private String gender;
    private String streetWhereYouGrewUp;
    private String mothersMaidenName;
    private String firstPetsName;

    public Person() {
        this.name = "";
        this.age = Integer.MAX_VALUE;
        this.gender = ":eyes:";
        this.heightInCm = 180;
        this.streetWhereYouGrewUp = "Easy Street";
        this.mothersMaidenName = "please";
        this.firstPetsName = "REX";

    }

    public Person(int age) {
        this.age = age;
    }

    public Person(String name) {
        this.name = name;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person(String name, int age, String gender, Integer height, String street, String maiden, String pet) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.heightInCm = height;
        this.streetWhereYouGrewUp = street;
        this.mothersMaidenName = maiden;
        this.firstPetsName = pet;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setHeightInCm(int height) {
        this.heightInCm = height;
    }

    public void setStreetWhereYouGrewUp(String street) {
        this.streetWhereYouGrewUp = street;
    }

    public void setMothersMaidenName(String maiden) {
        this.mothersMaidenName = maiden;
    }

    public void setFirstPetsName(String pet) {
        this.firstPetsName = pet;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public Integer getHeightInCm() {
        return heightInCm;
    }

    public String getStreetWhereYouGrewUp() {
        return streetWhereYouGrewUp;
    }

    public String getMothersMaidenName() {
        return mothersMaidenName;
    }

    public String getFirstPetsName() {
        return firstPetsName;
    }
}
