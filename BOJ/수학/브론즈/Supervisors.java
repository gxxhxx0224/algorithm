import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        
        int N = Integer.parseInt(br.readLine()); // 시험장 개수
        int[] A = new int[N]; // 각 시험장의 응시자 수
        
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            A[i] = Integer.parseInt(st.nextToken());
        }
        
        st = new StringTokenizer(br.readLine());
        int B = Integer.parseInt(st.nextToken()); // 총감독관 감시 가능 인원
        int C = Integer.parseInt(st.nextToken()); // 부감독관 감시 가능 인원
        
        long totalSupervisors = 0;
        
        for (int i = 0; i < N; i++) {
            // 총감독관 1명 배치
            totalSupervisors++;
            A[i] -= B;
            
            // 부감독관 배치 (응시자가 남아있는 경우)
            if (A[i] > 0) {
                totalSupervisors += (A[i] + C - 1) / C; // 올림 연산
            }
        }
        
        System.out.println(totalSupervisors);
    }
}
