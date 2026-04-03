package 단계_15_약수_배수와_소수_2;

import java.io.*;
import java.util.*;

/**
 * 문제
 * 분수 A/B는 분자가 A, 분모가 B인 분수를 의미한다. A와 B는 모두 자연수이다.
 *
 * 두 분수의 합 또한 분수로 표현할 수 있다.
 * 두 분수가 주어졌을 때, 그 합을 기약분수의 형태로 구하는 프로그램을 작성하시오.
 *
 * 기약분수란 더 이상 약분되지 않는 분수를 의미한다.
 *
 * 입력
 * 첫째 줄과 둘째 줄에 각 분수의 분자와 분모를 뜻하는 두 개의 자연수가 순서대로 주어진다.
 * 입력되는 네 자연수는 모두 30,000 이하이다.
 *
 * 출력
 * 첫째 줄에 구하고자 하는 기약분수의 분자와 분모를 빈 칸을 사이에 두고 순서대로 출력한다.
 */
public class P1735 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());

        int c = Integer.parseInt(st.nextToken());
        int d = Integer.parseInt(st.nextToken());

        int numerator  = a * d + c * b;
        int denominator = b*d;

        StringBuilder sb = new StringBuilder();
        int g = gcd(numerator, denominator);
        sb.append(numerator /= g).append(" ").append(denominator /= g);
        System.out.println(sb);
    }


    static int gcd(int a, int b) {
        while (b != 0) {
            int temp = a % b;
            a = b;
            b = temp;
        }
        return a;
    }

}



