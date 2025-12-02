import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Please write your code here.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());

        // 바깥 for: 줄 수를 N번 반복
        for (int line = 1; line <= N; line++) {

            // 홀수 줄: 1 ~ N 출력
            if (line % 2 == 1) {
                for (int i = 1; i <= N; i++) {
                    System.out.print(i);
                }
            } 
            // 짝수 줄: N ~ 1 출력
            else {
                for (int i = N; i >= 1; i--) {
                    System.out.print(i);
                }
            }

            System.out.println();  // 줄 바꿈
        }
    }
}