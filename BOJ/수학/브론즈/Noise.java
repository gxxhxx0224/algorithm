import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        String op = sc.next();
        String B = sc.next();

        if (op.equals("*")) {
            // 곱셈: 1 뒤에 A,B의 0 개수를 합친 만큼 0 붙이기
            int zerosA = A.length() - 1;
            int zerosB = B.length() - 1;
            System.out.print("1");
            for (int i = 0; i < zerosA + zerosB; i++) {
                System.out.print("0");
            }
            System.out.println();
        } else {
            // 덧셈: 더 큰 쪽 자릿수를 기준으로 자릿수를 맞춘 뒤 더하기
            // 두 수가 자릿수가 다르면 0 패딩 필요
            int lenA = A.length();
            int lenB = B.length();
            if (lenA == lenB) {
                // 같은 자리수면 그냥 앞에 2 붙이고 나머지 0 붙이기
                System.out.print("2");
                for (int i = 0; i < lenA - 1; i++) {
                    System.out.print("0");
                }
                System.out.println();
            } else {
                // 자릿수가 다르면 큰 자리수 기준으로 위치 맞추기
                int maxLen = Math.max(lenA, lenB);
                int minLen = Math.min(lenA, lenB);
                int diff = maxLen - minLen;

                // 큰 수의 첫 자리 그대로 출력
                if (lenA > lenB) {
                    System.out.print(A.charAt(0));
                    for (int i = 0; i < diff - 1; i++) {
                        System.out.print("0");
                    }
                    System.out.print("1");
                    for (int i = 0; i < minLen - 1; i++) {
                        System.out.print("0");
                    }
                    System.out.println();
                } else {
                    System.out.print(B.charAt(0));
                    for (int i = 0; i < diff - 1; i++) {
                        System.out.print("0");
                    }
                    System.out.print("1");
                    for (int i = 0; i < minLen - 1; i++) {
                        System.out.print("0");
                    }
                    System.out.println();
                }
            }
        }
    }
}
