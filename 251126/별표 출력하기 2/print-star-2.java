import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args)throws Exception {
        // Please write your code here.
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		
		st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N-i; j++) {
				System.out.print("*"+" ");
			}
			System.out.println();
		}
    }
}