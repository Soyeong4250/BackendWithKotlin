package com.fastcampus.kotlinjava.gettersetter;

import java.time.LocalDate;

public class JavaGetterSetterExample {

    public static void main(String[] args) {
        Student student = new Student();

//        student.setName("스티브로저스");
        student.name = "스티브로저스";  // JVM Field를 사용
        student.setBirthDate(LocalDate.of(1918, 7, 4));

//        System.out.println(student.getName());
        System.out.println(student.name);  // JVM Field를 사용
        System.out.println(student.getBirthDate());

//        student.setAge(10);
        System.out.println(student.getAge());

//        student.setGrade("");
        student.changeGrade("A");
        System.out.println(student.getGrade());

    }
}
