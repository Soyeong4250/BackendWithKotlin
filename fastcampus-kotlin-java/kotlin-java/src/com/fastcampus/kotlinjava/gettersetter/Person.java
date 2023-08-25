package com.fastcampus.kotlinjava.gettersetter;

import java.util.UUID;

public class Person {

    private String name;

    private int age;

    private String address;

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

    public String getUUID() {
        return UUID.randomUUID().toString();
    }  // 별도의 프로퍼티가 없음

    public void setAddress(String address) {
        this.address = address;
    }

    public String myAddress() {
        return address;
    }
}
