import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class NumberCard {
    public static int n; //상근이가 가지고 있는 숫자카드 갯수
    public static int card[]; //숫자카드에 적혀있는 정수들이 들어갈 배열
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        card = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < n; i++) card[i] = Integer.parseInt(st.nextToken());

        Arrays.sort(card); //오름차순 정렬

        int m = Integer.parseInt(br.readLine()); //가지고 있는 카드인지 아닌지 구별해야할 정수의 갯수
        st = new StringTokenizer(br.readLine()); //거기에 적힌 수
        br.close();

        for(int i=0;i<m;i++){
            int num = Integer.parseInt(st.nextToken());

            if(binarySearch(num)) System.out.print(1 + " ");
            else System.out.print(0+" ");
        }
        
    }
    public static boolean binarySearch(int num){
        int low=0; //가지고 있는 카드 배열에서 제일 낮은 값의 인덱스
        int high = n - 1; //제일 높은 값의 인덱스
        
        while(low<=high){ //low <= high가 깨지는 순간(값이 하나 남을때)까지
            int mid = (low + high) / 2;

            if(num<card[mid]) high = mid - 1;
            else if(num>card[mid]) low = mid + 1;
            else return true; //num == card[mid] 즉, 찾는경우 true
        }
        return false; //못찾는경우 false
    }
}
