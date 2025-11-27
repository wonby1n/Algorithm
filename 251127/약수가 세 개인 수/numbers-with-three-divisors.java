import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Please write your code here.
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		
		st = new StringTokenizer(br.readLine());
		int start = Integer.parseInt(st.nextToken());
		int end = Integer.parseInt(st.nextToken());

		int total = 0;
		
		for (; start <= end; start++) {
			int cnt = 0;
			for (int i = 1; i <= start; i++) {
				if (start % i == 0) {
					cnt++;
				}
			}		
			if (cnt == 3) {
				total++;
			}
		}
		System.out.println(total);
    }
}