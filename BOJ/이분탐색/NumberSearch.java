import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class NumberSearch {
    static int n;
    static int num[];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        n=Integer.parseInt(br.readLine()); //정수의 개수
        num = new int[n];
        
        //n개의 수
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0;i<n;i++){
            num[i]= Integer.parseInt(st.nextToken());
        }

        Arrays.sort(num); //이분탐색을 위한 오름차순 정렬

        int m=Integer.parseInt(br.readLine()); //존재하는지 알아내야할 수 m개

        //m개의 수
        st = new StringTokenizer(br.readLine());
        for(int i=0;i<m;i++){
            if(binarySearch(Integer.parseInt(st.nextToken()))){
                sb.append(1).append('\n');
            }
            else sb.append(0).append('\n');
        }
        br.close();
        System.out.print(sb);
    }
    public static boolean binarySearch(int val){
        int low=0;
        int high=n-1;
        
        while(low<=high){
            int mid=(low+high)/2;

            if(num[mid]>val) high=mid-1;
            else if(num[mid]<val) low=mid+1;
            else return true;
        }
        return false;
    }

}
