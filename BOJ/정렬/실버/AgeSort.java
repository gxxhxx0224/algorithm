import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

//stable sort
public class AgeSort {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String member[][]=new String[n][2];

        for(int i=0;i<n;i++){
            StringTokenizer st=new StringTokenizer(br.readLine());
            member[i][0] = st.nextToken(); //나이
            member[i][1] = st.nextToken(); //이름
        }br.close();

        Arrays.sort(member, new Comparator<String[]>() {
            //나이 순으로 정렬
            @Override
            public int compare(String[] o1, String[] o2) {
                if(o1[0]==o2[0]) return 1;
                else{
                    return Integer.parseInt(o1[0]) - Integer.parseInt(o2[0]); //오름차순 정렬
                }
            }
        });
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<n;i++){
            sb.append(member[i][0]).append(' ').append(member[i][1]).append('\n');
        }
        System.out.print(sb);
    }
}