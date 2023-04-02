import java.io.*;

public class NumberSort3 {
    public static void main(String[] args) throws IOException {
        int[]count=new int[10001];

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        for(int i=0;i<n;i++){
            count[Integer.parseInt(br.readLine())]++;
        }br.close();
        StringBuilder sb=new StringBuilder();   //결과 저장

        for(int i=1;i<count.length;i++){
            while(count[i]>0){
                sb.append(i).append("\n");
                count[i]--;
            }
        }
        System.out.print(sb);
    }

}
