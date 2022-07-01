package com.zipcodewilmington.person;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by leon on 2/12/18.
 */
public class TestPerson {
    @Test
    public void testDefaultConstructor() {
        // Given
        String expectedName = "";
        Integer expectedAge = Integer.MAX_VALUE;
        String expectedGender = ":eyes:";
        Integer expectedHeight = 180;
        String expectedStreet = "Easy Street";
        String expectedMaiden = "please";
        String expectedPetName = "REX";

        // When
        Person person = new Person();

        // Then
        String actualName = person.getName();
        Integer actualAge = person.getAge();
        String actualGender = person.getGender();
        Integer actualHeight = person.getHeightInCm();
        String actualStreet = person.getStreetWhereYouGrewUp();
        String actualMaiden = person.getMothersMaidenName();
        String actualPetName = person.getFirstPetsName();

        Assert.assertEquals(expectedName, actualName);
        Assert.assertEquals(expectedAge, actualAge);
        Assert.assertEquals(expectedHeight, actualHeight);
        Assert.assertEquals(expectedGender, actualGender);
        Assert.assertEquals(expectedMaiden, actualMaiden);
        Assert.assertEquals(expectedStreet, actualStreet);
        Assert.assertEquals(expectedPetName, actualPetName);
    }

    @Test
    public void testConstructorWithName() {
        // Given
        String expected = "Leon";

        // When
        Person person = new Person(expected);

        // Then
        String actual = person.getName();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testConstructorWithAge() {
        // Given
        Integer expected = 5;

        // When
        Person person = new Person(expected);

        // Then
        Integer actual = person.getAge();
        Assert.assertEquals(expected, actual);
    }


    @Test
    public void testConstructorWithNameAndAge() {
        // Given
        Integer expectedAge = 5;
        String expectedName = "Leon";

        // When
        Person person = new Person(expectedName, expectedAge);

        // Then
        Integer actualAge = person.getAge();
        String actualName = person.getName();

        Assert.assertEquals(expectedAge, actualAge);
        Assert.assertEquals(expectedName, actualName);
    }

    @Test
    public void testCompleteConstructor() {
        // Given
        String expectedName = "Olas";
        Integer expectedAge = 35;
        String expectedGender = "male";
        Integer expectedHeight = 180;
        String expectedStreet = "Clay Street";
        String expectedMaiden = "uh";
        String expectedPetName = "Jaws";

        // When
        Person person = new Person("Olas", 35, "male", 180, "Clay Street", "uh", "Jaws");

        // Then
        String actualName = person.getName();
        Integer actualAge = person.getAge();
        String actualGender = person.getGender();
        Integer actualHeight = person.getHeightInCm();
        String actualStreet = person.getStreetWhereYouGrewUp();
        String actualMaiden = person.getMothersMaidenName();
        String actualPetName = person.getFirstPetsName();

        Assert.assertEquals(expectedName, actualName);
        Assert.assertEquals(expectedAge, actualAge);
        Assert.assertEquals(expectedHeight, actualHeight);
        Assert.assertEquals(expectedGender, actualGender);
        Assert.assertEquals(expectedMaiden, actualMaiden);
        Assert.assertEquals(expectedStreet, actualStreet);
        Assert.assertEquals(expectedPetName, actualPetName);
    }


    @Test
    public void testSetName() {
        // Given
        Person person = new Person();
        String expected = "Leon";

        // When
        person.setName(expected);
        String actual = person.getName();

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSetAge() {
        // Given
        Person person = new Person();
        Integer expected = 5;

        // When
        person.setAge(expected);

        // Then
        Integer actual = person.getAge();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSetGender() {
        // Given
        Person person = new Person();
        String expected = "ambiguous";

        // When
        person.setGender(expected);

        // Then
        String actual = person.getGender();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSetHeight() {
        // Given
        Person person = new Person();
        Integer expected = 5;

        // When
        person.setHeightInCm(expected);

        // Then
        Integer actual = person.getHeightInCm();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSetStreet() {
        // Given
        Person person = new Person();
        String expected = "Mockingbird Lane";

        // When
        person.setStreetWhereYouGrewUp(expected);

        // Then
        String actual = person.getStreetWhereYouGrewUp();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSetMaiden() {
        // Given
        Person person = new Person();
        String expected = "Nunya";

        // When
        person.setMothersMaidenName(expected);

        // Then
        String actual = person.getMothersMaidenName();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSetPet() {
        // Given
        Person person = new Person();
        String expected = "Rover Dangerfield";

        // When
        person.setFirstPetsName(expected);

        // Then
        String actual = person.getFirstPetsName();
        Assert.assertEquals(expected, actual);
    }

}
