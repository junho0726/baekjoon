package 단계_12_브루트_포스;

import java.io.*;
import java.util.*;

/**
 * 문제
 * 수현이는 4차 산업혁명 시대에 살고 있는 중학생이다. 코로나19로 인해
 * 수현이는 비추얼 학교로 비추얼 출석해 비추얼 강의를 듣고 있다.
 *
 * 수현이의 비추얼 선생님은 문자 2개인 연립방정식을 해결하는 방법에 대해
 * 강의하고 다음과 같은 문제를 숙제로 냈다.
 *
 * 다음 연립방정식에서 x와 y의 값을 계산하시오.
 *
 *      ax + by = c
 *      dx + ey = f
 *
 * 수현이는 숙제를 풀 시간이 없어서 빠르게 답을 구하려고 한다.
 * 입력된 방정식을 만족하는 x와 y 값을 구하시오.
 *
 * 입력
 * 정수 a, b, c, d, e, f 가 공백으로 구분되어 주어진다.
 * (-999 ≤ a, b, c, d, e, f ≤ 999)
 *
 * 문제에서 언급한 방정식을 만족하는 (x, y)가 유일하게 존재하며
 * x와 y는 각각 -999 이상 999 이하의 정수이다.
 *
 * 출력
 * 연립방정식의 해 x와 y를 공백으로 구분하여 출력한다.
 */
public class P19532 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        int d = Integer.parseInt(st.nextToken());
        int e = Integer.parseInt(st.nextToken());
        int f = Integer.parseInt(st.nextToken());

        for(int x = -999; x<=999; x++) {
            for(int y = -999; y<=999; y++){
                if(a*x + b*y == c && d*x + e*y == f) {
                    System.out.println(x+" "+y);
                    return;
                }
            }
        }

    }
}
