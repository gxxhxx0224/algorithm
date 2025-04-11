import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int UR = sc.nextInt(); // 지역 대회에서 문제를 푼 대학 수
        int TR = sc.nextInt(); // 지역 대회에서 문제를 푼 팀 수
        int UO = sc.nextInt(); // TOPC에서 문제를 푼 대학 수
        int TO = sc.nextInt(); // TOPC에서 문제를 푼 팀 수

        int siteScore = 56 * UR + 24 * TR + 14 * UO + 6 * TO;

        System.out.println(siteScore);
    }
}
