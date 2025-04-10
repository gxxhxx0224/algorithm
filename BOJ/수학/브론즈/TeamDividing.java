import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] skill = new int[4];
        for (int i = 0; i < 4; i++) {
            skill[i] = sc.nextInt();
        }

        int diff1 = Math.abs((skill[0] + skill[1]) - (skill[2] + skill[3]));
        int diff2 = Math.abs((skill[0] + skill[2]) - (skill[1] + skill[3]));
        int diff3 = Math.abs((skill[0] + skill[3]) - (skill[1] + skill[2]));

        int minDiff = Math.min(diff1, Math.min(diff2, diff3));

        System.out.println(minDiff);
    }
}
