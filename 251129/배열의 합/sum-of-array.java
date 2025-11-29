import java.io.*;
import java.util.*;

public class Main {
  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st;
    StringBuilder sb;

    int[] arr = new int[4];

    for (int i =0; i < 4; i++) {
      st = new StringTokenizer(br.readLine());
      int sum = 0;

      for (int j = 0; j <4; j++) {
        arr[i] = Integer.parseInt(st.nextToken());
        sum += arr[i];
      }
      System.out.println(sum);
    }
  }
}