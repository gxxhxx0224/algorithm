import java.util.*;
import java.io.*;

public class Main {
    static int n,m;
    static ArrayList<Bridge>bridges[];
    static class Bridge implements Comparable<Bridge>{
        int node,weigh;

        public Bridge(int node){
            this.node=node;
        }

        public Bridge(int node,int weigh){
            this.node=node;
            this.weigh=weigh;
        }

        @Override
        public int compareTo(Bridge o){
            return Integer.compare(o.weigh,this.weigh);
        }
    }
    public static int solve(int start,int to){
        boolean check[]=new boolean[n+1];
        int maxW[]=new int[n+1];
        PriorityQueue<Bridge>pq=new PriorityQueue<>();

        pq.add(new Bridge(start,Integer.MAX_VALUE));
        maxW[start]=Integer.MAX_VALUE;

        while(!pq.isEmpty()){
            Bridge now=pq.poll();
            int nowNode=now.node;
            int nowWeigh=now.weigh;

            if(!check[nowNode]){
                check[nowNode]=true;

                for(Bridge next:bridges[nowNode]){
                    int nextNode=next.node;
                    int nextWeigh=next.weigh;

                    int possW=Math.min(nowWeigh,nextWeigh);

                    if(!check[nextNode] && maxW[nextNode]<possW){
                        maxW[nextNode]=possW;
                        pq.add(new Bridge(nextNode,possW));
                    }
                }
            }
        }
        return maxW[to];
    }
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n=Integer.parseInt(st.nextToken()); //섬 개수
        m=Integer.parseInt(st.nextToken()); //다리 개수
        bridges=new ArrayList[n+1];
        for(int i=1;i<=n;i++)
            bridges[i]=new ArrayList<>();

        for(int i=1;i<=m;i++){
            st = new StringTokenizer(br.readLine());
            int a=Integer.parseInt(st.nextToken());
            int b=Integer.parseInt(st.nextToken());
            int w=Integer.parseInt(st.nextToken()); //중량 제한

            bridges[a].add(new Bridge(b,w));
            bridges[b].add(new Bridge(a,w));
        }
        st=new StringTokenizer(br.readLine());
        int from=Integer.parseInt(st.nextToken());
        int to=Integer.parseInt(st.nextToken());

        System.out.print(solve(from,to));
    }
}
