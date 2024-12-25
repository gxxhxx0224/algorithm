import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String input;

        while (!(input = br.readLine()).equals("0 0 0")) {
            String[] parts = input.split(" ");
            int[] sides = new int[3];
            
            for (int i = 0; i < 3; i++) {
                sides[i] = Integer.parseInt(parts[i]);
            }
            
            // 세 변의 길이를 오름차순 정렬
            Arrays.sort(sides);

            // 피타고라스 정리 체크
            if (sides[0] * sides[0] + sides[1] * sides[1] == sides[2] * sides[2]) {
                sb.append("right\n");
            } else {
                sb.append("wrong\n");
            }
        }

        System.out.print(sb);
    }
}
