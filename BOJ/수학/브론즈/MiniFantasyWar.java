import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();  // 테스트 케이스 수

        for (int i = 0; i < T; i++) {
            // 기본 능력치
            int baseHP = sc.nextInt();
            int baseMP = sc.nextInt();
            int baseAtk = sc.nextInt();
            int baseDef = sc.nextInt();

            // 장비 증감치
            int equipHP = sc.nextInt();
            int equipMP = sc.nextInt();
            int equipAtk = sc.nextInt();
            int equipDef = sc.nextInt();

            // 최종 능력치 계산
            int HP = baseHP + equipHP;
            int MP = baseMP + equipMP;
            int Atk = baseAtk + equipAtk;
            int Def = baseDef + equipDef;

            // 제약조건 적용
            HP = Math.max(1, HP);     // HP는 1 이상
            MP = Math.max(1, MP);     // MP도 1 이상
            Atk = Math.max(0, Atk);   // 공격력은 0 이상
            // 방어력은 제약 없음

            // 전투력 계산
            int power = HP + 5 * MP + 2 * Atk + 2 * Def;

            // 출력
            System.out.println(power);
        }

        sc.close();
    }
}
