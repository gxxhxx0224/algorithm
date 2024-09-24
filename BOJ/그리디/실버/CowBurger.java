import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

//S5 15720 카우버거
public class CowBurger {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int b=Integer.parseInt(st.nextToken()); //주문한 버거의 수
        int c=Integer.parseInt(st.nextToken()); //사이드 메뉴의 개수
        int d=Integer.parseInt(st.nextToken()); //음료의 개수
        int sets=Math.min(b,Math.min(c,d)); //세트 수

        List<Integer>burger=new ArrayList<>();
        List<Integer>side=new ArrayList<>();
        List<Integer>drink=new ArrayList<>();

        int before=0; //할인 전 가격
        int after=0; //할인 후 가격

        //버거
        st=new StringTokenizer(br.readLine());
        for(int i=0;i<b;i++){
            burger.add(Integer.parseInt(st.nextToken()));
            before+=burger.get(i);
        }

        //사이드
        st=new StringTokenizer(br.readLine());
        for(int i=0;i<c;i++){
            side.add(Integer.parseInt(st.nextToken()));
            before+=side.get(i);
        }

        //음료
        st=new StringTokenizer(br.readLine());
        for(int i=0;i<d;i++){
            drink.add(Integer.parseInt(st.nextToken()));
            before+=drink.get(i);
        }

        Collections.sort(burger,Collections.reverseOrder());
        Collections.sort(side,Collections.reverseOrder());
        Collections.sort(drink,Collections.reverseOrder());


        for(int i=sets-1;i>=0;i--){
            after+=(burger.remove(0)*0.9);
            after+=(side.remove(0)*0.9);
            after+=(drink.remove(0)*0.9);
        }

        while(true){
            if(!burger.isEmpty()) after+= burger.remove(0);
            if(!side.isEmpty()) after+= side.remove(0);
            if(!drink.isEmpty()) after+= drink.remove(0);

            if(burger.isEmpty() && side.isEmpty() && drink.isEmpty()) break;
        }

        System.out.println(before);
        System.out.println(after);
    }
}
