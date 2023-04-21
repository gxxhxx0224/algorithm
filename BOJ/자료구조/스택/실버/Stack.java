import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Stack {
    public static int[] stack;
    public static int size = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        stack = new int[n]; //

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            String str = st.nextToken();

            switch (str) {
                case "push":
                    push(Integer.parseInt(st.nextToken()));
                    break;
                case "pop":
                    sb.append(pop()).append("\n");
                    break;
                case "size":
                    sb.append(size()).append("\n");
                    break;

                case "empty":
                    sb.append(empty()).append("\n");
                    break;
                case "top":
                    sb.append(top()).append("\n");
                    break;
            }
        }br.close();
        System.out.print(sb);
    }

    public static void push(int item) {
        stack[size] = item; //사이즈칸(맨 위)에 item 넣고
        size++; //1증가
    }

    public static int pop() {
        //데이터가 하나도 없을경우 -1
        if (size == 0) return -1;

            //인덱스는 0부터 시작. 최상단 요소는 size-1 index에 위치한다
        else {
            int res = stack[size - 1];
            stack[size - 1] = 0; //0으로 초기화(뺌)
            size--;
            return res;
        }
    }

    public static int top() {
        //데이터 없을경우 -1
        if (size == 0) return -1;
        else return stack[size - 1]; //최상단 요소
    }

    public static int size() {
        return size; //요소 개수 반환
    }

    public static int empty() {
        //스택이 비어있으면 1(true)반환
        if (size == 0) return 1;
        return 0; //or 0(false)
    }

/*
    public static int bottom(){
        if(size==0) return -1;
        else return stack[0]

    }
    */

}
