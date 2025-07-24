import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] nums = new int[10];
        int sum = 0;
        Map<Integer, Integer> freq = new HashMap<>();

        for (int i = 0; i < 10; i++) {
            nums[i] = sc.nextInt();
            sum += nums[i];

            freq.put(nums[i], freq.getOrDefault(nums[i], 0) + 1);
        }

        // 평균 출력
        System.out.println(sum / 10);

        // 최빈값 계산
        int mode = nums[0];
        int maxCount = freq.get(mode);

        for (int num : freq.keySet()) {
            int count = freq.get(num);
            if (count > maxCount) {
                maxCount = count;
                mode = num;
            }
        }

        System.out.println(mode);
    }
}
