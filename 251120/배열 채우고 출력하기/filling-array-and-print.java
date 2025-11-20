import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Please write your code here.
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st;
    StringBuilder sb = new StringBuilder();

    String[] arr = br.readLine().split(" ");

    for (int i = 9; i >= 0; i--) {
      System.out.print(arr[i]);
    }
    }
}