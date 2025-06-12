import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt(); // X사 리터당 요금
        int B = sc.nextInt(); // Y사 기본 요금
        int C = sc.nextInt(); // Y사 기본 요금 사용량 상한
        int D = sc.nextInt(); // Y사 추가 요금 (1리터당)
        int P = sc.nextInt(); // JOI군의 한 달 사용량

        int costX = A * P; // X사 요금
        int costY = P <= C ? B : B + (P - C) * D; // Y사 요금

        System.out.println(Math.min(costX, costY));
    }
}
