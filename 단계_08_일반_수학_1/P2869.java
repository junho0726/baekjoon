package 단계_08_일반_수학_1;

import java.io.*;
import java.util.*;

/**
 * [문제]
 * 땅 위에 달팽이가 있다.
 * 이 달팽이는 높이가 V미터인 나무 막대를 올라가려고 한다.
 *
 * 달팽이는 낮 동안 A미터를 올라갈 수 있고,
 * 밤에 잠을 자는 동안 B미터만큼 미끄러진다.
 *
 * 단, 정상에 도달한 이후에는 더 이상 미끄러지지 않는다.
 *
 * 달팽이가 나무 막대를 모두 올라가려면
 * 총 며칠이 걸리는지를 구하는 프로그램을 작성하시오.
 *
 * --------------------------------------------------
 * [입력]
 * 첫째 줄에 세 정수 A, B, V가 공백으로 구분되어 주어진다.
 * (1 ≤ B < A ≤ V ≤ 1,000,000,000)
 *
 * --------------------------------------------------
 * [출력]
 * 달팽이가 나무 막대를 모두 올라가는 데
 * 필요한 최소 일수를 출력한다.
 */
public class P2869 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int V = Integer.parseInt(st.nextToken());

        int day = (V - A) / (A - B);
        if ((V - A) % (A - B) != 0) {
            day++;
        }
        day++;

        System.out.println(day);

    }
}
