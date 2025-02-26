import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // 재환이가 낼 수 있는 "aaah"와 의사가 원하는 "aah"를 입력
        String jaeHwan = sc.nextLine();
        String doctor = sc.nextLine();
        
        // "aah"에서 'a'의 개수만 비교
        int jaeHwanCount = jaeHwan.length() - 1; // 마지막 'h'를 제외한 'a'의 개수
        int doctorCount = doctor.length() - 1; // 마지막 'h'를 제외한 'a'의 개수
        
        // 비교 후 결과 출력
        if (jaeHwanCount >= doctorCount) {
            System.out.println("go");
        } else {
            System.out.println("no");
        }
    }
}
