package 단계_09_약수_배수와_소수;

import java.io.*;
import java.util.*;

/**
 * 문제
 * 주어진 수 N개 중에서 소수가 몇 개인지 찾아서
 * 출력하는 프로그램을 작성하시오.
 *
 * 입력
 * 첫 줄에 수의 개수 N이 주어진다.
 * N은 100이하이다.
 * 다음으로 N개의 수가 주어지는데
 * 수는 1,000 이하의 자연수이다.
 *
 * 출력
 * 주어진 수들 중 소수의 개수를 출력한다.
 */
public class P1978 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader (System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        int count  = 0;
        for(int i = 0; i < N; i++){
            int a  = Integer.parseInt(st.nextToken());
            if (a < 2) continue;

            boolean isPrime = true;

            for (int j = 2; j * j <= a; j++) {
                if (a % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) count++;
        }
        System.out.println(count);
    }
}
