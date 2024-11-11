import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // 입력: 대각선 길이 D, 높이 비율 H, 너비 비율 W
        int D = sc.nextInt();
        int H = sc.nextInt();
        int W = sc.nextInt();
        
        // 비율을 사용하여 높이와 너비의 비율에 대한 길이 비율계수 r 계산
        double ratio = Math.sqrt((double)(D * D) / (H * H + W * W));
        
        // 실제 높이와 너비 계산
        int actualHeight = (int)(H * ratio);
        int actualWidth = (int)(W * ratio);
        
        // 출력
        System.out.println(actualHeight + " " + actualWidth);
        
        sc.close();
    }
}
