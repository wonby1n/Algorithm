import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Please write your code here.
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		
		st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		
		for (int i =1; i < N+1; i++) {
			for (int j = 1; j < N+1; j++) {
				int a = (i*j);
				if (j==N) {
					System.out.print(i +" * " +j + " = " + a);
				} else {					
					System.out.print(i +" * " +j + " = " + a+", ");
				}
			}
			System.out.println();
		}
    }
}