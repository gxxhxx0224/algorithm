import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Flip {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        
        boolean check = false;
        int case1_count = 0; //0을 1로 바꾸는 경우
        int case2_count = 0; //1을 0으로 바꾸는 경우

        //0을 1로 바꾸는 경우
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == '1' && check == true) {
                check = false;
                case1_count++;
                continue;
            } else if (input.charAt(i) == '1' && check == false)
                continue;

            else if (input.charAt(i) == '0') {
                check = true;

                if(i==input.length()-1)
                    case1_count++;
            }
        }

        check=false;

        //1을 0으로 바꾸는 경우
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == '0' && check == true) {
                check = false;
                case2_count++;
                continue;
            } else if (input.charAt(i) == '0' && check == false)
                continue;

            else if (input.charAt(i) == '1') {
                check = true;

                if(i==input.length()-1)
                    case2_count++;
            }
        }
        System.out.print(Math.min(case1_count,case2_count));
    }
}
