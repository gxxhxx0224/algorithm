import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class NumberSort2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine()); //수 입력

        ArrayList<Integer> list = new ArrayList<>(); 

        for (int i = 0; i < n; i++) list.add(Integer.parseInt(br.readLine()));
        br.close();
        Collections.sort(list);

        for (int value : list) sb.append(value).append("\n");

        System.out.print(sb);
    }
}
