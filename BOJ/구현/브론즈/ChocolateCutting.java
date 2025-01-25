import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 입력 처리
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int N = Integer.parseInt(input[0]); // 세로 크기
        int M = Integer.parseInt(input[1]); // 가로 크기
        
        // 최소 쪼개기 횟수는 (N * M) - 1
        int result = N * M - 1;
        
        // 결과 출력
        System.out.println(result);
    }
}
