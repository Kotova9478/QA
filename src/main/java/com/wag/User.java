package com.wag;

public class User {

    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private String phoneNumber;

    public User(){
        firstName = "Ivan";
        lastName = "Petrov";
        email = "my@gmail.com";
        password = "123";
        phoneNumber = "1234567890";
    }

    public String getFirstName() {
        return firstName;
    }
    public String getLastName(){
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }
}
