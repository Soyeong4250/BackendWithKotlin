public class Logger {

    public void log(String level, String message) {
        if (level == null || level.length() == 0) {
            level = "INFO";
        }

        System.out.printf("[%s]%s%n", level, message);
    }

    public static void main(String[] args) {
        Logger logger = new Logger();

        logger.log("INFO", "인포 로그");

        logger.log(/* level = */"DEBUG", "디버그 로그");

        logger.log("WARN", "워닝 로그");

        String level = "ERROR";  // 설명 변수
        logger.log(level, "에러 로그");

        // 인자의 타입이 같을 경우 인자의 값이 순서가 다르게 들어가도 컴파일 오류가 발생하지 않아 문제가 발생할 수 있음
        logger.log("에러 로그", "ERROR");
    }
}
