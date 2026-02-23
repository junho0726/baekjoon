package 단계_10_기하_직사각형과_삼각형;

import java.io.*;
import java.util.*;

/**
 * 문제
 * 한수는 현재 (x, y)에 있다.
 * 직사각형은 각 변이 좌표축에 평행하며,
 * 왼쪽 아래 꼭짓점은 (0, 0),
 * 오른쪽 위 꼭짓점은 (w, h)에 있다.
 *
 * 직사각형의 경계선까지 가는 거리의 최솟값을
 * 구하는 프로그램을 작성하시오.
 *
 * 입력
 * 첫째 줄에 정수 x, y, w, h가 주어진다.
 *
 * 출력
 * 첫째 줄에 문제의 정답을 출력한다.
 */
public class P1085 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());
        int w = Integer.parseInt(st.nextToken());
        int h = Integer.parseInt(st.nextToken());

        int min1 = Math.min(x, w-x);
        int min2 = Math.min(y, h-y);

        System.out.println(Math.min(min1, min2));
    }
}
