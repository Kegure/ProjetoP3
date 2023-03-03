package com.P3.CinemaProj;

public class Person {
    private String name;
    private String address;
    private String cpf;

    public Person(String name, String address, String cpf) {
        this.name = name;
        this.address = address;
        this.cpf = cpf;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}
