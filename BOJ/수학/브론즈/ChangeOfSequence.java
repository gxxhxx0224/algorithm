import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken()); // 수열의 크기
        int K = Integer.parseInt(st.nextToken()); // 변형 횟수

        // 수열 입력 받기
        String[] input = br.readLine().split(",");
        List<Integer> sequence = new ArrayList<>();
        for (String s : input) {
            sequence.add(Integer.parseInt(s));
        }

        // K번 변형 수행
        for (int k = 0; k < K; k++) {
            List<Integer> nextSequence = new ArrayList<>();
            for (int i = 0; i < sequence.size() - 1; i++) {
                nextSequence.add(sequence.get(i + 1) - sequence.get(i));
            }
            sequence = nextSequence;
        }

        // 결과 출력
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < sequence.size(); i++) {
            sb.append(sequence.get(i));
            if (i != sequence.size() - 1) {
                sb.append(",");
            }
        }
        System.out.println(sb.toString());
    }
}
