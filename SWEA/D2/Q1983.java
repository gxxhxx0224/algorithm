import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Q1983 {
    static int n;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine()); //tc
        StringBuilder sb = new StringBuilder();

        for (int tc = 1; tc <= T; tc++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            n=Integer.parseInt(st.nextToken()); //학생 수
            int k=Integer.parseInt(st.nextToken()); //학생 번호
            float score[]=new float[n+1];

            for(int i=1;i<=n;i++){
                st=new StringTokenizer(br.readLine());

                score[i]+= (float) (Integer.parseInt(st.nextToken())*0.35);
                score[i]+= (float) (Integer.parseInt(st.nextToken())*0.45);
                score[i]+= (float) (Integer.parseInt(st.nextToken())*0.2);
            }

            float findScore=score[k];
            int rank=0;
            Arrays.sort(score);


            for(int i=n;i>=1;i--){
                if(findScore==score[i]) {
                    rank = n - i + 1;
                    break;
                }
            }
            sb.append('#').append(tc).append(' ').append(grade(rank)).append('\n');
        }
        System.out.print(sb);
    }
    public static String grade(int rank){
        int gradeCut=n/10;
        String grade="";

        if(gradeCut*1>=rank)
            grade="A+";
        else if(gradeCut*2>=rank)
            grade="A0";
        else if(gradeCut*3>=rank)
            grade="A-";
        else if(gradeCut*4>=rank)
            grade="B+";
        else if(gradeCut*5>=rank)
            grade="B0";
        else if(gradeCut*6>=rank)
            grade="B-";
        else if(gradeCut*7>=rank)
            grade="C+";
        else if(gradeCut*8>=rank)
            grade="C0";
        else if(gradeCut*9>=rank)
            grade="C-";
        else if(gradeCut*10>=rank)
            grade="D0";

        return grade;
    }
}
