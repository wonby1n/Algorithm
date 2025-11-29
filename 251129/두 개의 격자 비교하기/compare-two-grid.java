import java.io.*;
import java.util.*;

public class Main {
  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st;

    // N, M 입력
    st = new StringTokenizer(br.readLine());
    int N = Integer.parseInt(st.nextToken());
    int M = Integer.parseInt(st.nextToken());

    // N행 M열
    int[][] matrix = new int[N][M];
    int[][] matrix2 = new int[N][M];

    // matrix 받기
    for (int i = 0; i < N; i++) {          // 🔁 i < N
      st = new StringTokenizer(br.readLine());
      for (int j = 0; j < M; j++) {        // 🔁 j < M
        matrix[i][j] = Integer.parseInt(st.nextToken());
      }
    }

    // matrix2 받기
    for (int i = 0; i < N; i++) {          // 🔁 i < N
      st = new StringTokenizer(br.readLine());
      for (int j = 0; j < M; j++) {        // 🔁 j < M
        matrix2[i][j] = Integer.parseInt(st.nextToken());
      }
    }

    int[][] res = new int[N][M];

    // 두 행렬 비교해서 res 채우기
    for (int i = 0; i < N; i++) {
      for (int j = 0; j < M; j++) {
        if (matrix[i][j] == matrix2[i][j]) {
          res[i][j] = 0;
        } else {
          res[i][j] = 1;
        }
      }
    }

    // 출력
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < N; i++) {
      for (int j = 0; j < M; j++) {
        sb.append(res[i][j]).append(" ");
      }
      sb.append("\n");
    }
    System.out.print(sb.toString());
  }
}
