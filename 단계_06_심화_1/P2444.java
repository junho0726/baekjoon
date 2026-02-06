package 단계_06_심화_1;

import java.io.*;

/**
 * 문제
 * 예제를 보고 규칙을 유추한 뒤에 별을 찍어 보세요.
 * 입력
 * 첫째 줄에 N(1 ≤ N ≤ 100)이 주어진다.
 * 출력
 * 첫째 줄부터 2×N-1번째 줄까지 차례대로 별을 출력한다.
 */

public class P2444 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        for (int i = 1; i <= N; i++) {
             for (int j = 0; j < N - i; j++) System.out.print(" ");
             for (int j = 0; j < 2 * i - 1; j++) System.out.print("*");
             System.out.println();
        }

        for (int i = N - 1; i >= 1; i--) {
            for (int j = 0; j < N - i; j++) System.out.print(" ");
            for (int j = 0; j < 2 * i - 1; j++) System.out.print("*");
            System.out.println();
        }
    }
}
