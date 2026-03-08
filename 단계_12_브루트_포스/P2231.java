package 단계_12_브루트_포스;

import java.io.*;

/**
 * 문제
 * 어떤 자연수 N이 있을 때, 그 자연수 N의 분해합은
 * N과 N을 이루는 각 자리수의 합을 의미한다.
 *
 * 어떤 자연수 M의 분해합이 N인 경우,
 * M을 N의 생성자라고 한다.
 *
 * 예를 들어,
 * 245의 분해합은
 * 245 + 2 + 4 + 5 = 256 이므로
 * 245는 256의 생성자가 된다.
 *
 * 어떤 자연수는 생성자가 없을 수도 있으며,
 * 생성자가 여러 개 존재할 수도 있다.
 *
 * 자연수 N이 주어졌을 때,
 * N의 가장 작은 생성자를 구하는 프로그램을 작성하시오.
 *
 * 입력
 * 첫째 줄에 자연수 N이 주어진다.
 * (1 ≤ N ≤ 1,000,000)
 *
 * 출력
 * N의 가장 작은 생성자를 출력한다.
 * 생성자가 없는 경우 0을 출력한다.
 */
public class P2231 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int num = N;
        int count = 0;

        while(num > 0 ){
            num /= 10;
            count++;
        }

        for(int i = N - 9 * count; i <= N; i++) {
            int temp = 0;
            int sum = 0;

            while (temp > 0) {
                sum += temp%10;
                temp /= 10;
            }

            if(i + sum == N) {
                System.out.println(i);
                return;
            }
        }
        System.out.println(0);
    }
}
