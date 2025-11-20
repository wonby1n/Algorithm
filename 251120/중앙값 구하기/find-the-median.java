
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Please write your code here.
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		
		st = new StringTokenizer(br.readLine());
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		int c = Integer.parseInt(st.nextToken());
		
		if ((a > b && a < c) || (a < b && a > c )) {
			System.out.println(a);
		} else if ((b > a && b < c) || (b < a && b > c)) {
			System.out.println(b);
		} else {
			System.out.println(c);
		}
    }
}