import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Please write your code here.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();

        // i번째 줄 만들기 (총 N줄)
        for (int i = 1; i <= N; i++) {
            // i번째 줄에 찍을 별 개수 = 2*i - 1
            int starCount = 2 * i - 1;

            // 별 개수만큼 * 추가
            for (int j = 0; j < starCount; j++) {
                sb.append('*');
            }

            // 줄바꿈
            sb.append('\n');
        }

        // 한 번에 출력
        System.out.print(sb.toString());
    }
}