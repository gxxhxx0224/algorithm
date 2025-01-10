import java.util.*;
import java.time.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int n = Integer.parseInt(scanner.nextLine()); // 학생 수 입력
        List<Student> students = new ArrayList<>();
        
        // 학생 데이터 입력
        for (int i = 0; i < n; i++) {
            String[] input = scanner.nextLine().split(" ");
            String name = input[0];
            int day = Integer.parseInt(input[1]);
            int month = Integer.parseInt(input[2]);
            int year = Integer.parseInt(input[3]);
            
            // Student 객체 생성 및 리스트에 추가
            students.add(new Student(name, day, month, year));
        }
        
        // 학생 리스트를 생일 기준으로 정렬
        students.sort(Comparator.comparing(Student::getBirthDate));
        
        // 가장 나이가 적은 사람(마지막)과 가장 많은 사람(처음) 출력
        System.out.println(students.get(students.size() - 1).getName()); // 가장 나이가 적은 사람
        System.out.println(students.get(0).getName()); // 가장 나이가 많은 사람
    }
}

// Student 클래스 정의
class Student {
    private String name;
    private LocalDate birthDate;

    public Student(String name, int day, int month, int year) {
        this.name = name;
        this.birthDate = LocalDate.of(year, month, day);
    }

    public String getName() {
        return name;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }
}
