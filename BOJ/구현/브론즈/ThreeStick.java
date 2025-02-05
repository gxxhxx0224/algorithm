import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[3];
        
        for (int i = 0; i < 3; i++) {
            arr[i] = sc.nextInt();
        }
        
        Arrays.sort(arr); // 오름차순 정렬
        
        // 삼각형 조건: 가장 긴 변 < 나머지 두 변의 합
        if (arr[2] < arr[0] + arr[1]) {
            System.out.println(arr[0] + arr[1] + arr[2]);
        } else {
            System.out.println((arr[0] + arr[1]) * 2 - 1);
        }
    }
}
