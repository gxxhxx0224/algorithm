import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int birthYear = sc.nextInt();
        int birthMonth = sc.nextInt();
        int birthDay = sc.nextInt();

        int currentYear = sc.nextInt();
        int currentMonth = sc.nextInt();
        int currentDay = sc.nextInt();

        // 만 나이 계산
        int age = currentYear - birthYear;
        if (currentMonth < birthMonth || (currentMonth == birthMonth && currentDay < birthDay)) {
            age--;
        }

        // 세는 나이 계산
        int countingAge = currentYear - birthYear + 1;

        // 연 나이 계산
        int yearAge = currentYear - birthYear;

        System.out.println(age);          // 만 나이
        System.out.println(countingAge);  // 세는 나이
        System.out.println(yearAge);      // 연 나이
    }
}
