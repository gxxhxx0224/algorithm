import java.io.*;
import java.util.*;

//G5 13273 로마숫자
public class Main {
    static Map<String, Integer> toNum;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        StringBuilder sb=new StringBuilder();
        toNum=new HashMap<>();
        toNum.put("I",1);
        toNum.put("IV",4);
        toNum.put("V",5);
        toNum.put("IX",9);
        toNum.put("X",10);
        toNum.put("XL",40);
        toNum.put("L",50);
        toNum.put("XC",90);
        toNum.put("C",100);
        toNum.put("CD",400);
        toNum.put("D",500);
        toNum.put("CM",900);
        toNum.put("M",1000);

        for(int i=0;i<n;i++){
            String str=br.readLine();

            if(Character.isDigit(str.charAt(0)))
                sb.append(numToString(Integer.parseInt(str))).append("\n");
            else
                sb.append(toInt(str)).append("\n");
        }
        System.out.print(sb);
    }
    public static int toInt(String str){
        int sum=0;
        int count=0;
        for(int i=0;i<str.length()-1;i++) {
            if (toNum.get(String.valueOf(str.charAt(i)) + String.valueOf(str.charAt(i + 1))) != null) {
                count += 2;
                sum += toNum.get(str.substring(i,i+2));
                i++;
            } else {
                count += 1;
                sum += toNum.get(String.valueOf(str.charAt(i)));
            }
        }
        if(count<str.length()) sum+=toNum.get(String.valueOf(str.charAt(str.length()-1)));

        return sum;
    }

    public static String numToString(int num){
        StringBuilder sb=new StringBuilder();

        while(num>0){
            int count=0;

            if(num>=1000){
                count=num/1000;

                for(int i=0;i<count;i++)
                    sb.append("M");
                num%=1000;
            }else if(num>=900){
                count=num/900;

                for(int i=0;i<count;i++)
                    sb.append("CM");
                num%=900;
            }else if(num>=500){
                count=num/500;

                for(int i=0;i<count;i++)
                    sb.append("D");
                num%=500;
            }else if(num>=400){
                count=num/400;

                for(int i=0;i<count;i++)
                    sb.append("CD");
                num%=400;
            }else if(num>=100){
                count=num/100;

                for(int i=0;i<count;i++)
                    sb.append("C");
                num%=100;
            }else if(num>=90){
                count=num/90;

                for(int i=0;i<count;i++)
                    sb.append("XC");
                num%=90;
            }else if(num>=50){
                count=num/50;

                for(int i=0;i<count;i++)
                    sb.append("L");
                num%=50;
            }else if(num>=40){
                count=num/40;

                for(int i=0;i<count;i++)
                    sb.append("XL");
                num%=40;
            }else if(num>=10){
                count=num/10;

                for(int i=0;i<count;i++)
                    sb.append("X");
                num%=10;
            }else if(num>=9){
                count=num/9;

                for(int i=0;i<count;i++)
                    sb.append("IX");
                num%=9;
            }else if(num>=5){
                count=num/5;

                for(int i=0;i<count;i++)
                    sb.append("V");
                num%=5;
            }else if(num>=4){
                count=num/4;

                for(int i=0;i<count;i++)
                    sb.append("IV");
                num%=4;
            }
            else if(num>=1){
                count=num/1;

                for(int i=0;i<count;i++)
                    sb.append("I");
                num%=1;
            }
        }
        return sb.toString();
    }

}
