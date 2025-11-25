import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Please write your code here.
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        String str1 = st.nextToken();
        String str2 = st.nextToken();

        // 숫자의 길이는 숫자.length 이지만 문자는 문자.length() 으로 해야 함
        int a = str1.length();
        int b = str2.length();

        if (a == b) {
            System.out.println("same");
        } else if (a > b) {
            System.out.println(str1 + " " + a);
        } else if (a < b) {
            System.out.println(str2 + " " + b);
        }
    }
}