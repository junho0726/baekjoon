package 단계_10_기하_직사각형과_삼각형;

import java.io.*;
import java.util.*;

public class P3009 {
    public static void main (String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int x = 0, y = 0;
        for(int i = 0; i < 3; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            x ^= Integer.parseInt(st.nextToken());
            y ^= Integer.parseInt(st.nextToken());
        }
        System.out.println(x + " " + y);
    }
}
