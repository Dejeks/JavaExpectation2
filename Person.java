package org.example.Homework.HWException2;

public class Person {
    private String firstName;
    private String lastName;
    private String middleName;
    private String birthDate;
    private long phoneNumber;
    private char gender;

    public Person(String firstName, String lastName, String middleName, String birthDate, long phoneNumber, char gender) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.middleName = middleName;
        this.birthDate = birthDate;
        this.phoneNumber = phoneNumber;
        this.gender = gender;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public char getGender() {
        return gender;
    }

    @Override
    public String toString() {
        return lastName + " " + firstName + " " + middleName + ", " + birthDate + ", " + phoneNumber + ", " + gender;
    }
}
