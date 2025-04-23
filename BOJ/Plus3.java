import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // 한 줄 전체를 입력받고
        String line = scanner.nextLine();
        
        // 공백 기준으로 나누어서 배열로 저장
        String[] numbers = line.split(" ");
        
        int sum = 0;
        for (String numStr : numbers) {
            sum += Integer.parseInt(numStr); // 문자열을 정수로 변환하여 더함
        }
        
        System.out.println(sum);
    }
}
