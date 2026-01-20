package 단계_01_입출력과_사칙연산;

import java.util.*;
import java.io.*;

/**
 * 문제 두 정수 A와 B를 입력 받은 다음 , AXB를 출력하는 프로그램을 작성하시오
 * 입력 첫째 줄에 A와 B가 주어진다. (0 < A, B < 10)
 * 출력 첫째 줄에 AXB를 출력한다.
 */
public class P10998 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        System.out.println(a*b);
    }
}
