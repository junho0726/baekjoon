package 단계_13_정렬;

import java.io.*;
import java.util.Arrays;

/**
 * 문제
 * N개의 수가 주어졌을 때, 이를 오름차순으로 정렬하는 프로그램을 작성하시오.
 *
 * 입력
 * 첫째 줄에 수의 개수 N(1 ≤ N ≤ 10,000,000)이 주어진다.
 * 둘째 줄부터 N개의 줄에는 수가 주어진다.
 * 이 수는 10,000보다 작거나 같은 자연수이다.
 *
 * 출력
 * 첫째 줄부터 N개의 줄에 오름차순으로 정렬한 결과를
 * 한 줄에 하나씩 출력한다.
 */
public class P10989 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        int [] count = new int [10001];

        for(int i = 0; i < N; i++) {
            count[Integer.parseInt(br.readLine())]++;
        }

        for(int i = 0; i <= 10000; i++) {
            while(count[i] > 0) {
                sb.append(i).append("\n");
                count[i]--;
            }
        }
        System.out.println(sb);
    }
}
