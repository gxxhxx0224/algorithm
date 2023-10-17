import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q1204 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T=Integer.parseInt(br.readLine()); //테스트 케이스의 수
        int count[];
        for(int tc=0;tc<T;tc++){
            int num=Integer.parseInt(br.readLine()); //테스트 케이스의 번호
            StringTokenizer st = new StringTokenizer(br.readLine());
            count=new int[101];

            for(int i=0;i<1000;i++){
                count[Integer.parseInt(st.nextToken())]++;
            }
            int mode=0; //최빈수
            int maxCount=0; //최빈수의 빈도수
            for(int i=0;i<101;i++){
                if(maxCount<count[i]) { //현재 빈도수가 앞의 최대빈도수보다 크면
                    maxCount=count[i]; //최빈수의 빈도수 갱신
                    mode=i; //최빈수 갱신
                }

                //현재 수가 최빈수와 빈도수가 같으면 그 중 큰점수 출력
                else if(maxCount==count[i]) {
                    mode = Math.max(mode, i);
                }
            }
            sb.append("#").append(num).append(' ').append(mode).append('\n');
        }
        br.close();
        System.out.println(sb);

    }
}
