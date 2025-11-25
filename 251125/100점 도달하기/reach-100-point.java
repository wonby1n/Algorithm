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
		
		for (;a < 101; ++a) {
			if (a >= 90) {
				System.out.print("A"+" ");
			} else if (a>=80) {
				System.out.print("B"+" ");
			} else if (a>=70) {
				System.out.print("C"+" ");
			} else if (a>=60) {
				System.out.print("D"+" ");
			} else {
				System.out.print("F"+" ");
			}
		}
    }
}