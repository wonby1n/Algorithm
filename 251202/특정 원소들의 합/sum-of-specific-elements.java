import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Please write your code here.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int[][] arr = new int[4][4];

        // 4×4 배열 입력
        for (int i = 0; i < 4; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 4; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        int sum = 0;

        // 색칠된 칸들만 합산: (i, j)에서 j <= i 인 칸
        for (int i = 0; i < 4; i++) {        // 행 0~3
            for (int j = 0; j <= i; j++) {   // 열 0~i
                sum += arr[i][j];
            }
        }

        System.out.println(sum);
    }
}