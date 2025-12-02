import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine().trim());

        // 바깥 for: 각 행(row)을 위에서 아래로 돌기
        for (int i = 0; i < N; i++) {
            // 안쪽 for: 각 열(column)을 왼쪽에서 오른쪽으로 돌기
            for (int j = 0; j < N; j++) {
                int val;
                if (j % 2 == 0) {       // 열 번호가 홀수(1,3,5...) → 위에서 아래로 1~N
                    val = i + 1;
                } else {                // 열 번호가 짝수(2,4,6...) → 위에서 아래로 N~1
                    val = N - i;
                }
                System.out.print(val);
            }
            System.out.println();       // 한 행 끝나면 줄바꿈
        }
    }
}