import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 현재 시각 입력
        int hours = scanner.nextInt();
        int minutes = scanner.nextInt();
        int seconds = scanner.nextInt();

        // 조리 시간 입력 (초 단위)
        int cookingTime = scanner.nextInt();
        
        // 현재 시각을 초 단위로 변환하여 총 초 계산
        int totalSeconds = hours * 3600 + minutes * 60 + seconds + cookingTime;

        // 총 초를 시, 분, 초로 변환
        int newHours = (totalSeconds / 3600) % 24;
        int newMinutes = (totalSeconds % 3600) / 60;
        int newSeconds = totalSeconds % 60;

        // 결과 출력
        System.out.println(newHours + " " + newMinutes + " " + newSeconds);
        
        scanner.close();
    }
}
