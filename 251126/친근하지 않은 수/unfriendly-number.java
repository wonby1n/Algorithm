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
		int cnt = 0;
		
		for (int i = 1; i <= N; i++) {
			if ((i % 2 == 0) || (i % 3 == 0) || (i % 5 == 0)) {
				continue;
			}
			cnt++;
		}
		
		System.out.println(cnt);
    }
}