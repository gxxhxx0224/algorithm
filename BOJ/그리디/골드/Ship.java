import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class Ship {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        //크레인
        int n=Integer.parseInt(br.readLine());
        ArrayList<Integer>crane=new ArrayList<>();
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0;i<n;i++) crane.add(Integer.parseInt(st.nextToken()));


        //박스
        int m=Integer.parseInt(br.readLine());
        ArrayList<Integer>boxes=new ArrayList<>();
        st=new StringTokenizer(br.readLine());
        for(int i=0;i<m;i++) boxes.add(Integer.parseInt(st.nextToken()));

        Collections.sort(crane,Collections.reverseOrder());
        Collections.sort(boxes,Collections.reverseOrder());

        if(boxes.get(0)> crane.get(0)){ //아예 옮길 수 없는 경우
            System.out.println(-1);
            return; //-1출력하고 종료
        }

        int time=0;
        while(!boxes.isEmpty()){
            int idx=0; //크레인 인덱스
            int bdx=0; //박스 인덱스

            //크레인이 한바퀴 다 돌기 전이고
            //박스도 한바퀴 돌기 전(다 돌면, 결국 못옮긴단 소리)
            while(idx<n && bdx<boxes.size()){
                if(crane.get(idx)>=boxes.get(bdx)){ //옮길 수 있는경우
                    boxes.remove(bdx); //박스 제거
                    idx++; //다음 크레인

                    //박스가 모두 제거된 경우 break;
                    if(boxes.isEmpty()) break;
                }
                else{ //옮길 수 없는 경우
                    bdx++;
                }
            }

            time++;
        }
        System.out.println(time);
    }
}
