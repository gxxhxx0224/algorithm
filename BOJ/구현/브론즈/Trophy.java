import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 트로피의 개수 입력
        int n = scanner.nextInt();
        int[] trophies = new int[n];

        // 트로피의 높이 입력
        for (int i = 0; i < n; i++) {
            trophies[i] = scanner.nextInt();
        }

        // 왼쪽에서 보이는 트로피 개수 계산
        int leftVisible = countVisibleTrophies(trophies);

        // 오른쪽에서 보이는 트로피 개수 계산 (배열을 뒤집어서 사용)
        int rightVisible = countVisibleTrophies(reverseArray(trophies));

        // 결과 출력
        System.out.println(leftVisible);
        System.out.println(rightVisible);
    }

    // 주어진 배열에서 보이는 트로피 개수를 계산하는 함수
    private static int countVisibleTrophies(int[] trophies) {
        int visibleCount = 0;
        int maxHeight = 0;

        for (int height : trophies) {
            if (height > maxHeight) {
                visibleCount++;
                maxHeight = height;
            }
        }

        return visibleCount;
    }

    // 배열을 뒤집는 함수
    private static int[] reverseArray(int[] array) {
        int n = array.length;
        int[] reversed = new int[n];

        for (int i = 0; i < n; i++) {
            reversed[i] = array[n - 1 - i];
        }

        return reversed;
    }
}
