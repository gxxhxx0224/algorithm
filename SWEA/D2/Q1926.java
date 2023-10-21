import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q1926 {
    static int n;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n=Integer.parseInt(br.readLine());
        br.close();

        for(int i=0;i<n;i++){
            String str=String.valueOf(i+1);
            System.out.print(game369(str)+" ");
        }
    }
    public static String game369(String str){

        if (str.contains("3") || str.contains("6") || str.contains("9")) {

            str = str.replace("3", "-");
            str = str.replace("6", "-");
            str = str.replace("9", "-");
        }
        int count=0;

        if(str.contains("-")){
            for(int i=0;i<str.length();i++){
                char c=str.charAt(i);
                if(c=='-') count++;
            }
            str="";
            for(int i=0;i<count;i++){
                str+="-";
            }
        }
        return str;

    }
}

