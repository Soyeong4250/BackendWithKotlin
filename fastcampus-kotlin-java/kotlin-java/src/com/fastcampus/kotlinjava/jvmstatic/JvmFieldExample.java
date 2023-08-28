package com.fastcampus.kotlinjava.jvmstatic;

public class JvmFieldExample {

    public static void main(String[] args) {

//        int id = JvmFieldClass.Companion.getId();

//        String name = JvmFieldObject.INSTANCE.getName();


        int id = JvmFieldClass.id;
        String name = JvmFieldObject.name;

        int code = JvmFieldClass.CODE;  // 상수의 경우 직접 접근 가능
        String familyName = JvmFieldObject.FAMILY_NAME;
    }
}
