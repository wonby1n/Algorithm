import java.io.*;
import java.util.*;

public class Main {
  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st;
    StringBuilder sb;

    // 3행 3열
    int[][] matrix = new int[3][3];

    // 총 세 줄 받기  
    for (int i = 0; i < 3; i++) {
      st = new StringTokenizer(br.readLine());
      for (int j =0; j <3; j++) {
        matrix[i][j] = Integer.parseInt(st.nextToken());
      }
    }
    
    // 3배로 출력
    for (int i = 0; i <3 ;i++) {
      for (int j = 0; j <3; j++) {
        int res = matrix[i][j] * 3;
        System.out.print(res +" ");
      }
      System.out.println();
    }
  }
}