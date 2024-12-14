import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 입력 받기
        String currentTime = scanner.nextLine();
        String startTime = scanner.nextLine();

        // 시간 파싱
        int currentSeconds = parseTimeToSeconds(currentTime);
        int startSeconds = parseTimeToSeconds(startTime);

        // 남은 시간 계산
        int remainingSeconds;
        if (currentSeconds <= startSeconds) {
            remainingSeconds = startSeconds - currentSeconds;
        } else {
            remainingSeconds = 24 * 3600 - currentSeconds + startSeconds;
        }

        // 결과 출력
        System.out.println(formatSecondsToTime(remainingSeconds));
    }

    // 시간을 초 단위로 변환
    private static int parseTimeToSeconds(String time) {
        String[] parts = time.split(":");
        int hours = Integer.parseInt(parts[0]);
        int minutes = Integer.parseInt(parts[1]);
        int seconds = Integer.parseInt(parts[2]);
        return hours * 3600 + minutes * 60 + seconds;
    }

    // 초를 시간 형식으로 변환
    private static String formatSecondsToTime(int totalSeconds) {
        int hours = totalSeconds / 3600;
        totalSeconds %= 3600;
        int minutes = totalSeconds / 60;
        int seconds = totalSeconds % 60;
        return String.format("%02d:%02d:%02d", hours, minutes, seconds);
    }
}
