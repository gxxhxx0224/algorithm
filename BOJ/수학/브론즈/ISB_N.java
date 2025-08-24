import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String isbn = br.readLine().trim();

        int starIndex = -1;
        int[] nums = new int[13];

        for (int i = 0; i < 13; i++) {
            char c = isbn.charAt(i);
            if (c == '*') {
                starIndex = i;
                nums[i] = -1;
            } else {
                nums[i] = c - '0';
            }
        }

        // * 자리에 0~9 대입
        for (int d = 0; d <= 9; d++) {
            nums[starIndex] = d;
            int sum = 0;
            for (int i = 0; i < 12; i++) { // 마지막 체크기호 전까지
                if (i % 2 == 0) sum += nums[i];
                else sum += 3 * nums[i];
            }
            int check = (10 - (sum % 10)) % 10;
            if (check == nums[12]) { // 유효 ISBN
                System.out.println(d);
                break;
            }
        }
    }
}
