import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            int startH = sc.nextInt();
            int startM = sc.nextInt();
            int startS = sc.nextInt();
            int endH = sc.nextInt();
            int endM = sc.nextInt();
            int endS = sc.nextInt();

            // 초 단위로 변환
            int startTime = startH * 3600 + startM * 60 + startS;
            int endTime = endH * 3600 + endM * 60 + endS;
            
            // 근무 시간 계산
            int workTime = endTime - startTime;
            
            int workH = workTime / 3600;
            int workM = (workTime % 3600) / 60;
            int workS = workTime % 60;

            System.out.println(workH + " " + workM + " " + workS);
        }
        sc.close();
    }
}
