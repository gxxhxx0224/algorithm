import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String now = sc.nextLine();
        String boom = sc.nextLine();

        int nowSec = toSecond(now);
        int boomSec = toSecond(boom);

        int wait = boomSec - nowSec;
        if (wait <= 0) wait += 24 * 3600;

        System.out.println(toTime(wait));
    }

    // 시:분:초 → 초로 변환
    private static int toSecond(String time) {
        String[] split = time.split(":");
        int h = Integer.parseInt(split[0]);
        int m = Integer.parseInt(split[1]);
        int s = Integer.parseInt(split[2]);
        return h * 3600 + m * 60 + s;
    }

    // 초 → 시:분:초로 변환 (두 자리수 형식 유지)
    private static String toTime(int totalSec) {
        int h = totalSec / 3600;
        totalSec %= 3600;
        int m = totalSec / 60;
        int s = totalSec % 60;

        return String.format("%02d:%02d:%02d", h, m, s);
    }
}
