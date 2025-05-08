import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        
        int N = Integer.parseInt(input[0]);  // 소들의 수
        int W = Integer.parseInt(input[1]);  // 헛간의 가로 길이
        int H = Integer.parseInt(input[2]);  // 헛간의 세로 길이
        int L = Integer.parseInt(input[3]);  // 소들에게 배정되는 공간의 크기
        
        // 헛간에 배치할 수 있는 최대 소의 수 계산
        int maxCows = (W / L) * (H / L);
        
        // 소들의 수와 비교하여 더 작은 값을 출력
        System.out.println(Math.min(maxCows, N));
    }
}
