import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Please write your code here.
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		
		int threeCnt = 0;
		int fiveCnt = 0;
		
		for (int i = 0; i < 10; i++) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			
			if (a % 3 == 0) {
				threeCnt++;
			} 
			if (a % 5 == 0) {
				fiveCnt++;
			}
		}
		System.out.println(threeCnt+ " " + fiveCnt);
    }
}