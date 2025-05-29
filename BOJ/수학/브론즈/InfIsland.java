import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt(); // 지하철역까지 걷는 시간
        int a = scanner.nextInt(); // 버스 도착 시간
        int b = scanner.nextInt(); // 지하철 도착 시간

        int subwayArrival = Math.max(n, b); // 지하철역 도착시간과 지하철 도착시간 중 더 늦은 시간에 탑승 가능

        if (a < subwayArrival) {
            System.out.println("Bus");
        } else if (a > subwayArrival) {
            System.out.println("Subway");
        } else {
            System.out.println("Anything");
        }
    }
}
