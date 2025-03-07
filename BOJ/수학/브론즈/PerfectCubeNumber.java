import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        // a ≤ 100이므로 1부터 100까지 반복
        for (int a = 2; a <= 100; a++) {
            int a3 = a * a * a; // a의 세제곱
            
            // b < c < d 순서로 증가하도록 반복문 구성
            for (int b = 2; b < a; b++) {
                int b3 = b * b * b; // b의 세제곱
                
                for (int c = b; c < a; c++) { // c는 b부터 시작하도록 설정
                    int c3 = c * c * c; // c의 세제곱
                    
                    for (int d = c; d < a; d++) { // d는 c부터 시작하도록 설정
                        int d3 = d * d * d; // d의 세제곱
                        
                        // a^3 = b^3 + c^3 + d^3 확인
                        if (a3 == b3 + c3 + d3) {
                            bw.write("Cube = " + a + ", Triple = (" + b + "," + c + "," + d + ")\n");
                        }
                    }
                }
            }
        }
        
        bw.flush();
        bw.close();
    }
}
