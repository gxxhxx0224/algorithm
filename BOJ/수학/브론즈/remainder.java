import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class remainder {
	public static void main(String[] args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		
		boolean[] a=new boolean[42];
		int count=0;
		int n;
		
		for(int i=0;i<10;i++) {
			n=Integer.parseInt(br.readLine())%42;
			a[n]=true;
		}
		for(int i=0;i<42;i++) {
			if(a[i]) count++;
		}
		bw.write(count+"\n");
		br.close();
		bw.flush();
		bw.close();
		}
		}
	
