import java.util.*;
class NumberList {
    public boolean solution(String[] phone_book) {
        boolean answer = true;
        
        Arrays.sort(phone_book);
        for(int i=0;i<phone_book.length-1;i++){
            String a=phone_book[i];
            String b=phone_book[i+1];
            
            boolean chk=false;
            
            for(int j=0;j<a.length();j++){
                if(a.charAt(j)!=b.charAt(j)){
                    chk=true;
                    break;
                }
            }
            if(!chk){
                return false;
            }
        
        }
        
        return true;
    }
}
