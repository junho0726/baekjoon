package 단계_03_반복문;

import java.io.*;
import java.util.*;

/**
 * 문제
 * 본격적으로 for문 문제를 풀기 전에 주의해야 할 점이 있다.
 * 입출력 방식이 느리면 여러 줄을 입력받거나 출력할 때 시간초과가 날 수 있다는 점이다.
 *
 * C++을 사용하고 있고 cin/cout을 사용하고자 한다면,
 * cin.tie(NULL)과 sync_with_stdio(false)를 둘 다 적용해 주고,
 * endl 대신 개행문자(\n)를 사용해야 한다.
 * 단, 이렇게 하면 scanf/printf/puts/getchar/putchar 등
 * C의 입출력 방식과는 함께 사용할 수 없다.
 *
 * Java를 사용하고 있다면,
 * Scanner와 System.out.println 대신
 * BufferedReader와 BufferedWriter를 사용할 수 있다.
 * BufferedWriter.flush()는 맨 마지막에 한 번만 호출하면 된다.
 *
 * Python을 사용하고 있다면,
 * input 대신 sys.stdin.readline을 사용할 수 있다.
 * 단, 이 경우 맨 끝의 개행문자까지 함께 입력되므로,
 * 문자열을 저장할 때는 rstrip()을 사용하는 것이 좋다.
 *
 * 또한 입력과 출력 스트림은 서로 독립적이므로,
 * 모든 테스트케이스를 한 번에 저장한 뒤 출력할 필요는 없다.
 * 테스트케이스를 하나 입력받을 때마다
 * 바로 하나씩 출력해도 된다.
 *
 * 입력
 * 첫 줄에 테스트케이스의 개수 T가 주어진다.
 * (1 ≤ T ≤ 1,000,000)
 *
 * 다음 T줄에는 각각 두 정수 A와 B가 주어진다.
 * (1 ≤ A, B ≤ 1,000)
 *
 * 출력
 * 각 테스트케이스마다 A + B를
 * 한 줄에 하나씩 순서대로 출력한다.
 */
public class P15552 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for(int i = 1; i <= num; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            sb.append(a + b).append('\n');
        }
        System.out.println(sb);
    }
}
