import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Please write your code here.
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st;
    StringBuilder sb = new StringBuilder();

    int a = Integer.parseInt(br.readLine());
    String[] temp = br.readLine().split(" ");
    int[] arr = new int[temp.length];
    
    for (int i = 0; i < temp.length; i++) {
      arr[i] = Integer.parseInt(temp[i]);
    }

    for (int i = 0; i < temp.length; i++) {
        int res = arr[i] * arr[i];
        System.out.print(res+" ");
    }

    }
}