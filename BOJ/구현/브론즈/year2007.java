import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class year2007 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int x=Integer.parseInt(st.nextToken()); //월
        int y=Integer.parseInt(st.nextToken()); //일

        int count=y;
        x--;

        while(x>0){
            if(x==1||x==3||x==5||x==7||x==8||x==10||x==12){
                count+=31;
                x--;
            }
            else if(x==2){
                count+=28;
                x--;
            }
            else{
                count+=30;
                x--;
            }
        }
        count%=7;

        switch (count) {
            case 1:
                System.out.print("MON");
                break;
            case 2:
                System.out.print("TUE");
                break;
            case 3:
                System.out.print("WED");
                break;
            case 4:
                System.out.print("THU");
                break;
            case 5:
                System.out.print("FRI");
                break;
            case 6:
                System.out.print("SAT");
                break;
            case 0:
                System.out.print("SUN");
                break;
        }
    }
}
