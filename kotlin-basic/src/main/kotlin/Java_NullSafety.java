import java.util.Optional;

public class Java_NullSafety {

    public static String getNullStr() {
        return null;
    }

    public static int getLengthIfNotNull(String str) {
        if (str == null || str.length() == 0) {
            return 0;
        }
        return str.length();
    }

    public static void main(String[] args) {
        String nullableStr = getNullStr();
        // Optional 사용 (Java 8부터 지원)
        nullableStr = Optional.ofNullable(nullableStr).orElse("null인 경우 반환");

        // null 참조를 사용하더라도 컴파일 오류가 발생하지 않음
        int nullableStrLength = nullableStr.length();
        System.out.println(nullableStrLength);

        // 메서드내부에서 null을 검사하는 방법도 있음
        int length = getLengthIfNotNull(null);
        System.out.println(length);
    }
}
