import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String id = br.readLine(); // 홍준의 아이디 입력 받기

        System.out.println(":fan::fan::fan:");
        System.out.println(":fan::" + id + "::fan:");
        System.out.println(":fan::fan::fan:");
    }
}
