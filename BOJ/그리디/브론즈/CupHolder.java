import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CupHolder {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());//좌석의 수
        String input=br.readLine();
        br.close();
        String seat="";
        
        for(int i=0;i<n;i++){
            if(input.charAt(i)=='S') seat+="*S"; //일반석(S)이면 *(컵홀더)추가
            else {//커플석(L)이면 
                seat+="*LL";
                i++; //i++,for문 i++ 2칸 넘긴후 *(컵홀더)추가
            }
        }seat+="*"; //마지막 자리에 *z(컵홀더)추가

        int count=0;
        for(int i=0;i<seat.length();i++){
            if(seat.charAt(i)=='*')count++;
        }
        count = Math.min(count, n); //*(컵홀더)가 주어진사람 n을 넘길 수 있으므로 둘중 작은 값 출력
        System.out.print(count);
    }
}