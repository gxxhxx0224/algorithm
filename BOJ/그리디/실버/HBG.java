import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class HBG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n=Integer.parseInt(st.nextToken());
        int k=Integer.parseInt(st.nextToken());
        String input=br.readLine();
        String arr[]=new String[input.length()];

        for(int i=0;i<arr.length;i++){
            arr[i]=String.valueOf(input.charAt(i));
        }

        int ans=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i].equals("P")){
                for(int j=i-k;j<=i+k;j++){
                    if(j>=0 && j<arr.length && arr[j].equals("H")){
                        ans++;
                        arr[j]="";
                        break;
                    }
                }
            }
        }
        System.out.println(ans);
    }
}
