package 단계_09_약수_배수와_소수;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 문제
 * 정수 N이 주어졌을 때, 소인수분해하는 프로그램을 작성하시오.
 *
 * 입력
 * 첫째 줄에 정수 N이 주어진다.
 * (1 ≤ N ≤ 10,000,000)
 *
 * 출력
 * N의 소인수분해 결과를
 * 한 줄에 하나씩 오름차순으로 출력한다.
 *
 * 단, N이 1인 경우 아무것도 출력하지 않는다.
 *
 * 제한
 * 시간 제한: 1초
 * 메모리 제한: 256MB
 */
public class P11653 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        for(int i = 2; i * i <= N; i++) {
            while(N % i == 0) {
                System.out.println(i);
                N /= i;
            }
        }
        if(N > 1) {
            System.out.println(N);
        }
    }
}
