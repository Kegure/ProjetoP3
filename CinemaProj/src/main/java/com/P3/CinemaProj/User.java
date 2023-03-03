package com.P3.CinemaProj;

public class User {
    private Person person;
    private String username;
    private String password;
    private String email;

    public User(Person person, String username, String password, String email) {
        this.person = person;
        this.username = username;
        this.password = password;
        this.email = email;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
