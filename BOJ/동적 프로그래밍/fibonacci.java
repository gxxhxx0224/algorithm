import java.io.IOException;

//피보나치
//동적프로그래밍(DP)에서 topDown, BottomUp, 일반 재귀의 비교
public class fibonacci {
    static int[] topDown_memo;
    static int[] botUp_table;

    public static void main(String[] args) throws IOException {
        int n = 30;
        topDown_memo = new int[n + 1];
        botUp_table = new int[n + 1];

        long start = System.currentTimeMillis();
        System.out.println(naiveRecursion(n));
        long end = System.currentTimeMillis();
        System.out.println("일반재귀 소요시간: " + (end - start));

        start = System.currentTimeMillis();
        System.out.println(topDown(n));
        end = System.currentTimeMillis();
        System.out.println("Top-Down(Memoization) 소요시간: " + (end - start));

        start = System.currentTimeMillis();
        System.out.println(botUp(n));
        end = System.currentTimeMillis();
        System.out.println("Bottom-Up(Table-Filling) 소요시간: " + (end - start));
    }

    public static int naiveRecursion(int n) {
        if (n <= 1) return n;

        return naiveRecursion(n - 1) + naiveRecursion(n - 2);
    }

    public static int topDown(int n) { //Memoization
        //기저상태 도달시 0,1로 초기화
        if (n < 2) return topDown_memo[n] = n;

        //메모에 계산된 값이 있으면 바로 반환
        if (topDown_memo[n] > 0) return topDown_memo[n];

        //재귀
        topDown_memo[n] = topDown(n - 1) + topDown(n - 2);

        return topDown_memo[n];
    }

    public static int botUp(int n) { //Table-Filling
        //기저상태 사전에 미리 저장
        botUp_table[0] = 0;
        botUp_table[1] = 1;

        //반복분
        for (int i = 2; i <= n; i++) {
            //Table 채워나감
            botUp_table[i] = botUp_table[i - 1] + botUp_table[i - 2];
        }

        return botUp_table[n];
    }
}
