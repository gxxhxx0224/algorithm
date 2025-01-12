import java.io.*;
import java.util.*;

//Gold 5 2608 "로마 숫자" (문자열)
public class Main {
    static StringBuilder sb;
    static Map<Character,Integer> toNum;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        toNum=new HashMap<>();
        toNum.put('I', 1);
        toNum.put('V', 5);
        toNum.put('X', 10);
        toNum.put('L', 50);
        toNum.put('C', 100);
        toNum.put('D', 500);
        toNum.put('M', 1000);

        String a=br.readLine();
        String b=br.readLine();

        int sum=0;

        sum+=getSum(a);
        sum+=getSum(b);

        sb = new StringBuilder();

        sb.append(sum+"\n");

        getRome(sum);
        System.out.print(sb);
    }

    public static void getRome(int sum) {
        while (sum > 0) {
            int count = 0;
            if (sum >= 1000) {
                count = sum / 1000;
                for (int i = 0; i < count; i++) {
                    sb.append("M");
                }
                sum %= 1000;
            } else if (sum >= 900) {
                count = sum / 900;
                for (int i = 0; i < count; i++) {
                    sb.append("CM");
                }
                sum %= 900;
            } else if (sum >= 500) {
                count = sum / 500;
                for (int i = 0; i < count; i++) {
                    sb.append("D");
                }
                sum %= 500;
            } else if (sum >= 400) {
                count = sum / 400;
                for (int i = 0; i < count; i++) {
                    sb.append("CD");
                }
                sum %= 400;
            } else if (sum >= 100) {
                count = sum / 100;
                for (int i = 0; i < count; i++) {
                    sb.append("C");
                }
                sum %= 100;
            } else if (sum >= 90) {
                count = sum / 90;
                for (int i = 0; i < count; i++) {
                    sb.append("XC");
                }
                sum %= 90;
            } else if (sum >= 50) {
                count = sum / 50;
                for (int i = 0; i < count; i++) {
                    sb.append("L");
                }
                sum %= 50;
            } else if (sum >= 40) {
                count = sum / 40;
                for (int i = 0; i < count; i++) {
                    sb.append("XL");
                }
                sum %= 40;
            } else if (sum >= 10) {
                count = sum / 10;
                for (int i = 0; i < count; i++) {
                    sb.append("X");
                }
                sum %= 10;
            } else if (sum >= 9) {
                count = sum / 9;
                for (int i = 0; i < count; i++) {
                    sb.append("IX");
                }
                sum %= 9;
            } else if (sum >= 5) {
                count = sum / 5;
                for (int i = 0; i < count; i++) {
                    sb.append("V");
                }
                sum %= 5;
            } else if (sum >= 4) {
                count = sum / 4;
                for (int i = 0; i < count; i++) {
                    sb.append("IV");
                }
                sum %= 4;
            } else if (sum >= 1) {
                count = sum / 1;
                for (int i = 0; i < count; i++) {
                    sb.append("I");
                }
                sum %= 1;
            }
        }
    }

    public static int getSum(String str){
        int sum=0;
        int count=0;
        for(int i=0;i<str.length()-1;i++) {
            if(toNum.get(str.charAt(i))<toNum.get(str.charAt(i+1))){
                sum+=(toNum.get(str.charAt(i+1))-toNum.get(str.charAt(i)));
                count+=2;
                i++;
            }else{
                sum+=toNum.get(str.charAt(i));
                count+=1;
            }
        }
        if(count<str.length())
            sum+=toNum.get(str.charAt(str.length()-1));

        return sum;
    }
    public static Map<String, Integer> getHash() {
        Map<String, Integer> hash = new HashMap<>();
        hash.put("I", 1);
        hash.put("V", 5);
        hash.put("X", 10);
        hash.put("L", 50);
        hash.put("C", 100);
        hash.put("D", 500);
        hash.put("M", 1000);
        return hash;
    }

}
