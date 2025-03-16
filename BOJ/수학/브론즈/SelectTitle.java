import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int[] science = new int[4]; // 물리, 화학, 생물, 지구과학 점수
        int[] social = new int[2];  // 역사, 지리 점수
        
        // 과학 과목 점수 입력
        for (int i = 0; i < 4; i++) {
            science[i] = sc.nextInt();
        }
        
        // 사회 과목 점수 입력
        for (int i = 0; i < 2; i++) {
            social[i] = sc.nextInt();
        }
        
        sc.close();
        
        // 과학 과목 중 상위 3개 점수 선택
        Arrays.sort(science);
        int scienceSum = science[1] + science[2] + science[3]; // 가장 높은 3개 합산
        
        // 사회 과목 중 최고 점수 선택
        int socialMax = Math.max(social[0], social[1]);
        
        // 총합 계산 및 출력
        System.out.println(scienceSum + socialMax);
    }
}
