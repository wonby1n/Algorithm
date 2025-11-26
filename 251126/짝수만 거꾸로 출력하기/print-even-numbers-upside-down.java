import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Please write your code here.
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		
		st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int[] arr = new int[N];
        
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        // 짝수가 N개 다 나올수도 있으니 길이가 N인 배열 만들기
        int[] arr2 = new int[N];
        int idx = 0;

        for (int j = 0; j < N; j++) {
            if (arr[j] % 2 == 0) {
                arr2[idx] = arr[j];
                idx++;
            }
        }

        for (int k = idx-1; k >= 0; k--) {
            System.out.print(arr2[k]+" ");
        }

    }
}