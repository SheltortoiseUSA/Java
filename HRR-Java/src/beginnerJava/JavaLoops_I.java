package beginnerJava;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class JavaLoops_I {

	public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        
        int N = Integer.parseInt(bufferedReader.readLine().trim());
        int ans;
        
        for (int i = 1; i <= 10; i++) {
            ans = N * i;
            System.out.println(N + " x " + i + " = " + ans);
        }

        bufferedReader.close();
    }
}
