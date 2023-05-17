import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BodySize {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine()); //사람 수
        int bulk[][]=new int[n][2]; //한사람의 몸무게,키를 입력받을 2차원 배열
        StringTokenizer st;
        
        //각 사람의 몸무게,키를 입력받기
        for(int i=0;i<n;i++){
            st=new StringTokenizer(br.readLine());
            bulk[i][0]=Integer.parseInt(st.nextToken());
            bulk[i][1]=Integer.parseInt(st.nextToken());
        }br.close();

        for(int i=0;i<n;i++){
            int rank=1;
            for(int j=0;j<n;j++){   
                if(i==j) continue;  //나의 경우는 패스
                if(bulk[i][0]<bulk[j][0] && bulk[i][1]<bulk[j][1]) rank++;
            }   //몸무게 키 둘 다 나보다 클 경우에만 rank++
            System.out.print(rank+" ");

        }
    }
}
