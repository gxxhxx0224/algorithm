import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.ZoneOffset;

public class Main {
    public static void main(String[] args) {
        ZonedDateTime utcNow = ZonedDateTime.now(ZoneOffset.UTC);
        
        // 출력 형식: 연도, 월, 일 각각 줄바꿈
        System.out.println(utcNow.getYear());
        
        // 월, 일이 한 자리수일 경우 앞에 0을 붙여 출력
        System.out.printf("%02d\n", utcNow.getMonthValue());
        System.out.printf("%02d\n", utcNow.getDayOfMonth());
    }
}
