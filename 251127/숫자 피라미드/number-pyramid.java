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
			for (int j = 1; j <= i; j++) {
                sb.append(i);
                if (j < i) {          // 마지막 숫자 뒤에는 공백 안 붙이기 (필수는 아님, 깔끔하게 하려고)
                    sb.append(" ");
                }
            }
            sb.append("\n");          // 줄 바꿈
        }

        System.out.print(sb.toString());
    }
}