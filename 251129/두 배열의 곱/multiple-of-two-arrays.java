import java.io.*;
import java.util.*;

public class Main {
  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st;
    StringBuilder sb;

    // 3행 3열
    int[][] matrix = new int[3][3];
    int[][] matrix2 = new int[3][3];

    // matrix 받기 
    for (int i = 0; i < 3; i++) {
      st = new StringTokenizer(br.readLine());
      for (int j =0; j <3; j++) {
        matrix[i][j] = Integer.parseInt(st.nextToken());
      }
    }

    // 한 줄 버리기
    br.readLine();

    // matrix2 받기
    for (int i = 0; i < 3; i++) {
      st = new StringTokenizer(br.readLine());
      for (int j =0; j <3; j++) {
        matrix2[i][j] = Integer.parseInt(st.nextToken());
      }
    }

    for (int i = 0; i < 3; i++) {
      for (int j =0; j <3; j++) {
        int res = matrix[i][j] * matrix2[i][j];
        System.out.print(res + " ");
      }
      System.out.println();
    }
  }
}