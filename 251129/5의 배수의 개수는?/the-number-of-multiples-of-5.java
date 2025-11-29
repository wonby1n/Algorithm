import java.io.*;
import java.util.*;

public class Main {
  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st;
    StringBuilder sb;

    int[][] matrix = new int[4][4];
    int cnt = 0;

    for (int i =0; i < 4; i++) {
      st = new StringTokenizer(br.readLine());
      for (int j =0; j <4; j++) {
        int a = Integer.parseInt(st.nextToken());
        matrix[i][j] = a;
      }
    }

    for (int i =0; i < 4; i++) {
      for (int j =0; j <4; j++) {
        if (matrix[i][j] % 5 == 0) {
          cnt++;
        }
      }
    }
    System.out.println(cnt);
    }
  }
