import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Please write your code here.
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		
		while (true) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			
			if (a < 25) {
				System.out.println("Higher");
			} else if (a > 25) {
				System.out.println("Lower");
			} else {
				System.out.println("Good");
				break;
			}
		}
    }
}