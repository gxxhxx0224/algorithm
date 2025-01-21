import java.util.Scanner;

public class VigenereCipher {
    
    public static String encrypt(String plainText, String key) {
        StringBuilder result = new StringBuilder();
        int keyLength = key.length();
        
        for (int i = 0; i < plainText.length(); i++) {
            char plainChar = plainText.charAt(i);
            
            // 공백은 그대로 추가
            if (plainChar == ' ') {
                result.append(' ');
            } else {
                // 암호화 키에서 해당 인덱스의 문자 가져오기
                char keyChar = key.charAt(i % keyLength);
                int keyShift = keyChar - 'a' + 1;  // 'a'는 1, 'b'는 2, ..., 'z'는 26
                
                // 평문 문자의 알파벳 순서
                int plainShift = plainChar - 'a';  // 'a'는 0, 'b'는 1, ..., 'z'는 25
                
                // 뒤로 이동 후 순환 처리
                int newCharShift = (plainShift - keyShift + 26) % 26;
                
                // 새로운 문자 계산
                char newChar = (char) (newCharShift + 'a');
                result.append(newChar);
            }
        }
        
        return result.toString();
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // 입력 받기
        String plainText = scanner.nextLine();
        String key = scanner.nextLine();
        
        // 암호화 결과 출력
        System.out.println(encrypt(plainText, key));
    }
}
