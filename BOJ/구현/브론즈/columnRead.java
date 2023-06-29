import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class columnRead{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char ch[][] = new char[5][15]; //2차원 배열 선언

        for(int i=0;i<5;i++){
            String s=br.readLine(); //문자열 입력
            for(int j=0;j<s.length();j++){ 
                ch[i][j] = s.charAt(j); //문자형 배열에 하나씩 저장
            }
        }br.close();
        for(int i=0;i< 15;i++){
            for(int j=0;j<5;j++){
                if(ch[j][i]=='\0') continue; //문자형 배열이 비었으면 넘김
                System.out.print(ch[j][i]);
            }
        }

    }
}
