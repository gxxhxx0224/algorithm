import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q1215 {
    static int length,count;
    static char arr[][];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        for (int tc = 1; tc <= 10; tc++) {
            length = Integer.parseInt(br.readLine()); //회문의 길이
            arr = new char[8][8];
            count=0;

            for (int i = 0; i < 8; i++) {
                String str = br.readLine();
                for (int j = 0; j < 8; j++) {
                    arr[i][j] = str.charAt(j);
                }
            }

            for (int i = 0; i < 8; i++) {
                for (int j = 0; j <= 8 - length; j++) {
                    rowPalindrome(i,j);
                    colPalindrome(j,i);
                }
            }
            sb.append('#').append(tc).append(' ').append(count).append('\n');
        }
        System.out.print(sb);
    }

    public static void rowPalindrome(int Iindex, int Jindex) {
        //행방향 체크
        int forward = Jindex;
        int reverse = Jindex + length - 1;

        while (forward<reverse) {

            if(arr[Iindex][forward]==arr[Iindex][reverse]){
                forward++;
                reverse--;
            }
            else return;
        }
        count++;
    }

    public static void colPalindrome(int Iindex, int Jindex) {
        //열방향 체크
        int forward = Iindex;
        int reverse = Iindex + length - 1;

        while (forward<reverse) {
            if(arr[forward][Jindex]==arr[reverse][Jindex]){
                forward++;
                reverse--;
            }
            else return;
        }
        count++;
    }
}
