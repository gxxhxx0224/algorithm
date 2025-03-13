import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 민국이의 점수 입력 및 총점 계산
        int s1 = sc.nextInt(), s2 = sc.nextInt(), s3 = sc.nextInt(), s4 = sc.nextInt();
        int minGookTotal = s1 + s2 + s3 + s4;

        // 만세의 점수 입력 및 총점 계산
        int t1 = sc.nextInt(), t2 = sc.nextInt(), t3 = sc.nextInt(), t4 = sc.nextInt();
        int manSeTotal = t1 + t2 + t3 + t4;

        // 더 높은 점수를 출력 (동점이면 민국이 점수 출력)
        System.out.println(Math.max(minGookTotal, manSeTotal));

        sc.close();
    }
}
