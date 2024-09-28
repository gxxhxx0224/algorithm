import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 알파벳 소문자의 개수를 저장할 배열 (a~z: 26개)
        int[] alphabetCount = new int[26];

        // 문자열 입력받기
        String word = sc.next();

        // 문자열을 순회하면서 각 알파벳의 개수를 증가시킴
        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            alphabetCount[c - 'a']++;  // 해당 알파벳의 인덱스에 1 추가
        }

        // 결과 출력 (공백으로 구분)
        for (int i = 0; i < 26; i++) {
            System.out.print(alphabetCount[i] + " ");
        }
    }
}
