package com.caojiebing.web.springbootweb01;

import java.util.Date;

public class Employee {
    private String name;
    private int age;
    private String email;
    private Date birth ;

    public Employee(String name, int age, String email, Date birth) {
        this.name = name;
        this.age = age;
        this.email = email;
        this.birth = birth;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getBirth() {
        return birth;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }
}
