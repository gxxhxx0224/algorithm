import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//Bottom Up
public class goingDown_BottomUp{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        int arr[][]=new int[n][3];
        for(int i=0;i<n;i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            arr[i][0]=Integer.parseInt(st.nextToken());
            arr[i][1]=Integer.parseInt(st.nextToken());
            arr[i][2]=Integer.parseInt(st.nextToken());
        }

        int dpMax[][]=new int[n][3];
        int dpMin[][]=new int[n][3];
        dpMax[0][0]=arr[0][0];
        dpMax[0][1]=arr[0][1];
        dpMax[0][2]=arr[0][2];

        dpMin[0][0]=arr[0][0];
        dpMin[0][1]=arr[0][1];
        dpMin[0][2]=arr[0][2];

        for(int i=1;i<n;i++){
            //최댓값
            dpMax[i][0]=Math.max(dpMax[i-1][0],dpMax[i-1][1])+arr[i][0];
            dpMax[i][1]=Math.max(dpMax[i-1][0],Math.max(dpMax[i-1][1],dpMax[i-1][2]))+arr[i][1];
            dpMax[i][2]=Math.max(dpMax[i-1][1],dpMax[i-1][2])+arr[i][2];

            //최소값
            dpMin[i][0]=Math.min(dpMin[i-1][0],dpMin[i-1][1])+arr[i][0];
            dpMin[i][1]=Math.min(dpMin[i-1][0],Math.min(dpMin[i-1][1],dpMin[i-1][2]))+arr[i][1];
            dpMin[i][2]=Math.min(dpMin[i-1][1],dpMin[i-1][2])+arr[i][2];
        }

        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<3;i++){
            max=Math.max(dpMax[n-1][i],max);
            min=Math.min(dpMin[n-1][i],min);
        }
        System.out.println(max+" "+min);
    }
}
