import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String octal = br.readLine().trim();
        
        StringBuilder binary = new StringBuilder();

        // 첫 번째 자리 처리 (앞의 0을 생략하기 위해)
        binary.append(Integer.toBinaryString(octal.charAt(0) - '0'));

        // 나머지 자리 처리
        for (int i = 1; i < octal.length(); i++) {
            String bin = Integer.toBinaryString(octal.charAt(i) - '0');
            // 항상 3자리로 채우기 위해 빈 자리는 0으로 채움
            while (bin.length() < 3) {
                bin = "0" + bin;
            }
            binary.append(bin);
        }

        System.out.println(binary);
    }
}
