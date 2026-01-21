package 단계_01_입출력과_사칙연산;

import java.io.*;

/**
 * 문제 (세 자리 수) × (세 자리 수)는 다음과 같은 과정을 통하여 이루어진다.
 *      472        (1)
 *   x  385        (2)
 *  --------
 *     2360        (3)
 *    3776         (4)
 *   1416          (5)
 *  --------
 *   181720        (6)
 * (1)과 (2)위치에 들어갈 세 자리 자연수가 주어질 때 (3), (4), (5), (6)위치에 들어갈 값을 구하는 프로그램을 작성하시오.
 * 입력 첫째 줄에 (1)의 위치에 들어갈 세 자리 자연수가, 둘째 줄에 (2)의 위치에 들어갈 세자리 자연수가 주어진다.
 * 출력 첫째 줄부터 넷째 줄까지 차례대로 (3), (4), (5), (6)에 들어갈 값을 출력한다.
 */
public class P2588 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());

        int b1 = b % 10;
        int b2 = (b / 10) %10;
        int b3 = (b / 100) %10;

        StringBuilder sb = new StringBuilder();

        sb.append(a*b1).append('\n');
        sb.append(a*b2).append('\n');
        sb.append(a*b3).append('\n');
        sb.append(a*b);

        System.out.println(sb);

    }
}
