import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Please write your code here.
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        String text = st.nextToken();

        // 문자열을 문자 배열로 변환
        char[] chars = text.toCharArray();

        // "" 는 문자열, ''는 char
        chars[1] = 'a';
        chars[chars.length - 2] = 'a';
        
        // 다시 문자열로 변환
        text = new String(chars);

        System.out.println(text);
    }
}