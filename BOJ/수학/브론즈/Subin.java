import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        long[] B = new long[N];
        long[] A = new long[N];

        for (int i = 0; i < N; i++) {
            B[i] = sc.nextLong();
        }

        long sum = 0;
        for (int i = 0; i < N; i++) {
            A[i] = B[i] * (i + 1) - sum;
            sum += A[i];
        }

        for (int i = 0; i < N; i++) {
            System.out.print(A[i] + " ");
        }
    }
}
