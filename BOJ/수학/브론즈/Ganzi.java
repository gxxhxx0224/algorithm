import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        // 십이지 배열
        char[] zodiac = {'A','B','C','D','E','F','G','H','I','J','K','L'};
        
        // 기준 연도: 2013년 → F9
        int baseYear = 2013;
        int baseGan = 9;  // 십간 index
        int baseJi = 5;   // 십이지 index (F)

        int diff = N - baseYear;

        int ganIndex = (baseGan + diff) % 10;
        if (ganIndex < 0) ganIndex += 10;

        int jiIndex = (baseJi + diff) % 12;
        if (jiIndex < 0) jiIndex += 12;

        System.out.println(zodiac[jiIndex] + "" + ganIndex);
    }
}
