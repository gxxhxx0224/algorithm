import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class wukje_is_a_filial_son {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); //일종의 Scanner?
        int n=Integer.parseInt(br.readLine()); //마을의 수
        int arr[]=new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0;i<n;i++) arr[i]=Integer.parseInt(st.nextToken());

        Arrays.sort(arr);

        int ans=0; //이동비용
        for(int i=0;i<n-1;i++) ans+=arr[i];

        System.out.println(ans);
    }
}
