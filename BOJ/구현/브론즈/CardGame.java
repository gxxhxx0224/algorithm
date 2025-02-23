import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] A = new int[10];
        int[] B = new int[10];
        
        for (int i = 0; i < 10; i++) {
            A[i] = sc.nextInt();
        }
        for (int i = 0; i < 10; i++) {
            B[i] = sc.nextInt();
        }
        sc.close();
        
        int scoreA = 0, scoreB = 0;
        int lastWinner = -1; // 0: A, 1: B, -1: Draw
        
        for (int i = 0; i < 10; i++) {
            if (A[i] > B[i]) {
                scoreA += 3;
                lastWinner = 0;
            } else if (A[i] < B[i]) {
                scoreB += 3;
                lastWinner = 1;
            } else {
                scoreA += 1;
                scoreB += 1;
            }
        }
        
        System.out.println(scoreA + " " + scoreB);
        if (scoreA > scoreB) {
            System.out.println("A");
        } else if (scoreA < scoreB) {
            System.out.println("B");
        } else {
            if (lastWinner == 0) {
                System.out.println("A");
            } else if (lastWinner == 1) {
                System.out.println("B");
            } else {
                System.out.println("D");
            }
        }
    }
}
