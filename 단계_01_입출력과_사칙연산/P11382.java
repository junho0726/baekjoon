package 단계_01_입출력과_사칙연산;

import java.io.*;
import java.util.*;

/**
 * 문제 꼬마 정민이는 이제 A + B 정도는 쉽게 계산할 수 있다. 이제 A + B + C를 계산할 차례이다!
 * 입력 첫 번째 줄에 A, B, C (1 ≤ A, B, C ≤ 10¹²)이 공백을 사이에 두고 주어진다.
 * 출력 A+B+C의 값을 출력한다.
 */
public class P11382 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        long a = Long.parseLong(st.nextToken());
        long b = Long.parseLong(st.nextToken());
        long c = Long.parseLong(st.nextToken());

        System.out.println(a+b+c);

    }
}
