import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int scenarioNumber = 1;

        while (true) {
            // 첫 줄 입력
            String[] line = br.readLine().split(" ");
            int optimalWeight = Integer.parseInt(line[0]);
            int currentWeight = Integer.parseInt(line[1]);

            // "0 0" 입력 시 종료
            if (optimalWeight == 0 && currentWeight == 0) {
                break;
            }

            boolean isDead = false; // 펫의 생존 상태
            String state = "";

            // 각 작용 처리
            while (true) {
                String[] actionLine = br.readLine().split(" ");
                String action = actionLine[0];
                int value = Integer.parseInt(actionLine[1]);

                // "# 0" 입력 시 시나리오 종료
                if (action.equals("#") && value == 0) {
                    break;
                }

                // 펫이 죽은 경우, 이후 작업 무시
                if (isDead) {
                    continue;
                }

                // 작용에 따라 체중 변화
                if (action.equals("E")) {
                    currentWeight -= value; // 운동
                } else if (action.equals("F")) {
                    currentWeight += value; // 먹이
                }

                // 펫 상태 업데이트
                if (currentWeight <= 0) {
                    isDead = true; // 체중이 0 이하인 경우 사망
                }
            }

            // 최종 상태 계산
            if (isDead) {
                state = "RIP";
            } else if (currentWeight > optimalWeight / 2.0 && currentWeight < optimalWeight * 2.0) {
                state = ":-)";
            } else {
                state = ":-(";
            }

            // 결과 저장
            sb.append(scenarioNumber).append(" ").append(state).append("\n");
            scenarioNumber++;
        }

        // 결과 출력
        System.out.print(sb.toString());
    }
}
