import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class YourGrade {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        String str[]=new String[20]; //20과목
        double totalSum=0; //내가 받은 전체 성적
        double scoreSum=0; //내가 모두 들은 학점
        
        String gradeList[]={"A+","A0","B+","B0","C+","C0","D+","D0","F","P"};   //받을 수 있는 성적
        double scoreList[]={4.5,4.0,3.5,3.0,2.5,2.0,1.5,1.0,0.0,0.0};

        for(int i=0;i<20;i++){
            str[i]=br.readLine();
            StringTokenizer st=new StringTokenizer(str[i]);
            String subject=st.nextToken();
            double score=Double.parseDouble(st.nextToken());
            String grade=st.nextToken();

            for(int j=0;j<10;j++){
                if(grade.equals(gradeList[j])){
                    totalSum+=score*scoreList[j];
                    if(j!=9) scoreSum+=score;   //P는 계산에서 제외해야 하므로 나머지만 인정
                }
            }
        }double avg=totalSum/scoreSum;
        System.out.printf("%.6f",avg);
        br.close();
        
    }
}
