import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class NumberSort2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());

        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < n; i++) list.add(Integer.parseInt(br.readLine()));
        br.close();
        Collections.sort(list);

        for (int i = 0; i < n; i++) bw.write(list.get(i)+"\n");
        bw.flush();
        bw.close();
    }
}
