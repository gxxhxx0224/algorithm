import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // N: 바구니의 개수, M: 역순으로 바꿀 횟수
        int N = sc.nextInt();
        int M = sc.nextInt();

        // 1번부터 N번까지의 바구니 번호를 배열에 저장
        int[] baskets = new int[N];
        for (int i = 0; i < N; i++) {
            baskets[i] = i + 1;
        }

        // M번 만큼 범위를 입력받아 해당 범위의 바구니를 역순으로 바꿈
        for (int t = 0; t < M; t++) {
            int i = sc.nextInt() - 1; // 1-based index에서 0-based index로 변환
            int j = sc.nextInt() - 1; // 1-based index에서 0-based index로 변환
            
            // i부터 j까지의 바구니를 역순으로 바꾸기
            while (i < j) {
                int temp = baskets[i];
                baskets[i] = baskets[j];
                baskets[j] = temp;
                i++;
                j--;
            }
        }

        // 최종 결과 출력
        for (int k = 0; k < N; k++) {
            System.out.print(baskets[k] + " ");
        }
    }
}
