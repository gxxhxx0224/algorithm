import java.io.*;
import java.util.*;

public class Main {
	static int n;
	static char arr[][];
    public static void main(String[] args) throws IOException{
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	n=Integer.parseInt(br.readLine()); //보드의 크기
    	arr=new char[n][n];
    	
    	for(int i=0;i<n;i++) {
    		String input=br.readLine();
    		
    		for(int j=0;j<n;j++) {
    			arr[i][j]=input.charAt(j);
    		}
    	}
    	
    	int max=0;
    	for(int i=0;i<n;i++) {
    		for(int j=0;j<n;j++) {
    			if(i<n-1) { //상하스왑
    				swap(i,j,i+1,j);
    				max=Math.max(max, yCount(j));
    				max=Math.max(max, xCount(i));
    				max=Math.max(max, xCount(i+1));
    				swap(i,j,i+1,j);
    			}
    			
    			if(j<n-1) { //좌우스왑
    				swap(i,j,i,j+1);
    				max=Math.max(max, xCount(i));
    				max=Math.max(max, yCount(j));
    				max=Math.max(max, yCount(j+1));
    				swap(i,j,i,j+1);
    			}
    		}
    	}
    	System.out.print(max);
    }
    static int xCount(int y) {
    	int count=1;
    	int max=1;
    	for(int x=1;x<n;x++) {
    		if(arr[y][x]==arr[y][x-1]) {
    			count++;
    			max=Math.max(max, count);
    		}else count=1;
    	}
    	return max;
    }
    static int yCount(int x) {
    	int count=1;
    	int max=1;
    	for(int y=1;y<n;y++) {
    		if(arr[y][x]==arr[y-1][x]) {
    			count++;
    			max=Math.max(max, count);
    		}else count=1;
    	}
    	return max;
    }
    static void swap(int y,int x,int ny,int nx) {
    	char temp=arr[y][x];
    	arr[y][x]=arr[ny][nx];
    	arr[ny][nx]=temp;
    }
}
