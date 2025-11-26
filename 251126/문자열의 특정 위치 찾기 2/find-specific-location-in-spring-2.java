import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Please write your code here.
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;

		st = new StringTokenizer(br.readLine());
		char token = st.nextToken().charAt(0);
		
		String[] arr = {"apple","banana","grape","blueberry","orange"};
		int cnt = 0;
		
        for (int i = 0; i < 5; i++) {
            if ((arr[i].charAt(2) == token) || (arr[i].charAt(3) == token)) {
                cnt++;
                System.out.println(arr[i]);
            }
        }
		System.out.println(cnt);
    }
}