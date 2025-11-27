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
		
		
		for (int i =1; i <= N; i++) {
			st = new StringTokenizer(br.readLine());
			int a =Integer.parseInt(st.nextToken());
			int b =Integer.parseInt(st.nextToken());
			
			int total = 0;
			for (; a <= b; a++) {
				if (a % 2 == 0) {
					total += a;
				}
			}
			System.out.println(total);
		}
    }
}