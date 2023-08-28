package com.fastcampus.kotlinjava.extensions;

public class ExtensionExample {

    public static void main(String[] args) {

//        "ABCD".first();
//        "ABCD".addFirst('Z');

        char first = MyExtensionsKt.first("ABCD");
        System.out.println(first);

        String addFirst = MyExtensionsKt.addFirstChar("ABCD", 'Z');
        System.out.println(addFirst);

    }
}
