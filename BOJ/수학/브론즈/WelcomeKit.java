import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long N = sc.nextLong();
        long[] sizes = new long[6];
        for (int i = 0; i < 6; i++) {
            sizes[i] = sc.nextLong();
        }
        long T = sc.nextLong();
        long P = sc.nextLong();

        // 티셔츠 묶음 계산
        long tshirtBundles = 0;
        for (int i = 0; i < 6; i++) {
            tshirtBundles += (sizes[i] + T - 1) / T; // ceil division
        }

        // 펜 묶음 계산
        long penBundles = N / P;
        long penSingles = N % P;

        System.out.println(tshirtBundles);
        System.out.println(penBundles + " " + penSingles);
    }
}
