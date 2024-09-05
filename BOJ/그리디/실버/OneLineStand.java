import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.List;
import java.util.StringTokenizer;

public class OneLineStand {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        int arr[]=new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());

        for(int i=0;i<n;i++) arr[i]=Integer.parseInt(st.nextToken());

        List<Integer>line=new LinkedList<>();
        for(int i=n-1;i>=0;i--){
            line.add(arr[i],i);
        }

        for(int i=0;i<n;i++){
            System.out.print(line.get(i)+1+" ");
        }
    }
}
