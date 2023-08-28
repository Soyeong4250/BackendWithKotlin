package com.fastcampus.kotlinjava.jvmstatic;

public class JvmStaticExample {

    public static void main(String[] args) {

//        String hello = HelloClass.Companion.hello();  // Companion 객체를 사용하지 않을 경을 경우 static 메서드처럼 사용 불가능 (컴파일 오류 발생)

//        String h1 = HiObject.INSTANCE.hi();  // 객체를 생성하는 INSTANCE 키워드를 통해 hi() 메서드 바로 사용

        String hello = HelloClass.hello();
        String h1 = HiObject.hi();

    }
}
