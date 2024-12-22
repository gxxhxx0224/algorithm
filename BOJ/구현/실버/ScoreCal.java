import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 점수를 저장할 배열 선언
        int[] scores = new int[8];

        // 입력 점수 저장
        for (int i = 0; i < 8; i++) {
            scores[i] = sc.nextInt();
        }

        // 점수와 문제 번호를 함께 저장할 리스트
        List<int[]> scoreList = new ArrayList<>();

        for (int i = 0; i < 8; i++) {
            scoreList.add(new int[] {scores[i], i + 1});
        }

        // 점수 기준으로 내림차순 정렬
        scoreList.sort((a, b) -> b[0] - a[0]);

        int totalScore = 0;
        List<Integer> selectedQuestions = new ArrayList<>();

        // 상위 5개의 점수와 문제 번호 선택
        for (int i = 0; i < 5; i++) {
            totalScore += scoreList.get(i)[0];
            selectedQuestions.add(scoreList.get(i)[1]);
        }

        // 문제 번호 오름차순 정렬
        Collections.sort(selectedQuestions);

        // 총점 출력
        System.out.println(totalScore);

        // 선택된 문제 번호 출력
        for (int question : selectedQuestions) {
            System.out.print(question + " ");
        }
    }
}
