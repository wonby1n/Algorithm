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
		int num = 2;
		int res = 1;
		
		while (res <= N) {
			res += num;
			if (res >= N) {
				System.out.println(num);
				break;
			}
			num++;
		}
    }
}