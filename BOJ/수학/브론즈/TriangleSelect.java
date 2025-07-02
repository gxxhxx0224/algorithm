import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line;

        while (true) {
            line = br.readLine();
            String[] tokens = line.split(" ");
            int[] sides = new int[3];
            sides[0] = Integer.parseInt(tokens[0]);
            sides[1] = Integer.parseInt(tokens[1]);
            sides[2] = Integer.parseInt(tokens[2]);

            // 종료 조건
            if (sides[0] == 0 && sides[1] == 0 && sides[2] == 0) {
                break;
            }

            Arrays.sort(sides);

            // 삼각형 성립 조건: 가장 긴 변 < 나머지 두 변의 합
            if (sides[2] >= sides[0] + sides[1]) {
                System.out.println("Invalid");
            } else if (sides[0] == sides[1] && sides[1] == sides[2]) {
                System.out.println("Equilateral");
            } else if (sides[0] == sides[1] || sides[1] == sides[2] || sides[0] == sides[2]) {
                System.out.println("Isosceles");
            } else {
                System.out.println("Scalene");
            }
        }
    }
}
