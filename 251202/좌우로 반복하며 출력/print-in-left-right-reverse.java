import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Please write your code here.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());

        // int cnt = 1;
        
        for (int i = 1; i <= N; i++) {
            System.out.print(i);
        }
        System.out.println();
        for (int i = N; i > 0; i--) {
            System.out.print(i);
        }
        System.out.println();
        for (int i = 1; i <= N; i++) {
            System.out.print(i);
        }
        System.out.println();
        for (int i = N; i > 0; i--) {
            System.out.print(i);
        }
    }
}