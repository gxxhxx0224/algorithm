import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class htf {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n=Integer.parseInt(st.nextToken()); //듣도 못한 수
        int m=Integer.parseInt(st.nextToken()); //보도 못한 수

        Map<String, Boolean>map=new HashMap<>();

        for(int i=0;i<n;i++){
            map.put(br.readLine(),true);
        }

        int count=0;

        StringBuilder sb = new StringBuilder();
        List<String>list=new LinkedList<>();

        for(int i=0;i<m;i++){
            String name=br.readLine();

            if(map.containsKey(name)){
                count++;
                list.add(name);
            }
        }
        sb.append(count+"\n");

        String ans[]=new String[list.size()];
        for(int i=0;i<ans.length;i++){
            ans[i]=list.get(i);
        }
        Arrays.sort(ans);

        for(int i=0;i<ans.length;i++) sb.append(ans[i]+"\n");

        System.out.println(sb);

    }
}
