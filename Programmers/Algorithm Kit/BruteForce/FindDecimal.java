class FindDecimal {
    static int answer,range;
    static boolean check[],numChk[];
    public int solution(String numbers) {
        answer = 0;
        int cnt=numbers.length();
        check=new boolean[cnt];
        
        range=1;
        for(int i=0;i<cnt;i++) range*=10;
        
        numChk=new boolean[range+1];
        
        dfs("",numbers);
        
        return answer;
    }
    
    public static void dfs(String str,String numbers){
        
        if(!str.equals("")){
            int num=Integer.parseInt(str);
            
            if(!d(num) && !numChk[num]){
                answer++;
                numChk[num]=true;
            }
        }
        
        for(int i=0;i<numbers.length();i++){
            if(!check[i]){
                check[i]=true;
                dfs(str+numbers.charAt(i),numbers);
                check[i]=false;
            }
        }
    }
    
    public static boolean d(int n){
        if(n==0 || n==1) return true;
        
        for(int i=2;i<range-1;i++){
            if(i==n) continue;
            if(n%i==0) {
                return true;
            }
        }
        return false;
    }
}
