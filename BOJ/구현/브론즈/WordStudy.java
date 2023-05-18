import java.util.Scanner;

public class WordStudy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int arr[] = new int[26];

        for (int i = 0; i < s.length(); i++) {
            if ('A' <= s.charAt(i) && s.charAt(i) <= 90) { //'A':65, 'Z':90
                arr[s.charAt(i) - 65]++;
            } else if (97 <= s.charAt(i) && s.charAt(i) <= 122) {
                arr[s.charAt(i) - 97]++;
            }
        }
        int max = -1;
        char c='?';
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max){
                max = arr[i];
                c = (char) (i + 65);
            }
            else if (arr[i] == max) c = '?';
        }
        System.out.println(c);
    }
}

