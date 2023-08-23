package com.fastcampus.kotlinjava.gettersetter;

import java.time.LocalDate;

public class JavaGetterSetterExample {

    public static void main(String[] args) {
        Student student = new Student();

        student.setName("스티브로저스");
        student.setBirthDate(LocalDate.of(1918, 7, 4));

        System.out.println(student.getName());
        System.out.println(student.getBirthDate());

//        student.setAge(10);
        System.out.println(student.getAge());
    }
}
