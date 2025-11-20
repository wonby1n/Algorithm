import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int a = Integer.parseInt(br.readLine());


        if ((a % 4 == 0 && a % 100 != 0) || a % 400 == 0) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }

    }
}
