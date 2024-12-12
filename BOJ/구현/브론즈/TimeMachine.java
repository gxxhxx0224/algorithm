import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 입력값 받기
        String input = scanner.nextLine();
        String[] timeParts = input.split(":");

        // 세 자리 숫자를 분리
        int[] timeDigits = new int[3];
        for (int i = 0; i < 3; i++) {
            timeDigits[i] = Integer.parseInt(timeParts[i]);
        }

        // HH, MM, SS의 모든 순열 생성 및 검증
        int[] indices = {0, 1, 2};
        int validCount = 0;

        do {
            int hour = timeDigits[indices[0]];
            int minute = timeDigits[indices[1]];
            int second = timeDigits[indices[2]];

            // 유효한 시간인지 확인
            if (isValidTime(hour, minute, second)) {
                validCount++;
            }
        } while (nextPermutation(indices));

        // 결과 출력
        System.out.println(validCount);

        scanner.close();
    }

    // 시간 유효성 확인
    private static boolean isValidTime(int hour, int minute, int second) {
        return (1 <= hour && hour <= 12) && (0 <= minute && minute <= 59) && (0 <= second && second <= 59);
    }

    // 다음 순열 생성 함수
    private static boolean nextPermutation(int[] array) {
        int n = array.length;
        int i = n - 2;

        // 꼭대기를 찾는다
        while (i >= 0 && array[i] >= array[i + 1]) {
            i--;
        }

        if (i == -1) {
            return false;
        }

        int j = n - 1;
        while (array[i] >= array[j]) {
            j--;
        }

        swap(array, i, j);

        int start = i + 1;
        int end = n - 1;
        while (start < end) {
            swap(array, start, end);
            start++;
            end--;
        }

        return true;
    }

    private static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
