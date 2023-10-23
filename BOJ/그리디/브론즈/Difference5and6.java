import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Difference5and6 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        String A = st.nextToken();
        String B = st.nextToken();

        int min=minSwap(A)+minSwap(B);
        int max=maxSwap(A)+maxSwap(B);

        System.out.println(min+" "+max);
    }
    public static int minSwap(String str){
       str=str.replace("6","5");
       int num=Integer.parseInt(str);

       return num;
    }
    public static int maxSwap(String str){
        str=str.replace("5","6");
        int num=Integer.parseInt(str);

        return num;
    }

}
