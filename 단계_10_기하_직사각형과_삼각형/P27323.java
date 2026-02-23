package 단계_10_기하_직사각형과_삼각형;

import java.io.*;

/**
 * 문제
 * 정수 A, B가 주어진다.
 * 세로 길이가 A cm, 가로 길이가 B cm인 직사각형의 넓이를
 * cm² 단위로 구하시오.
 *
 * 입력
 * 표준 입력에 다음과 같은 형태로 입력이 주어진다.
 * A
 * B
 *
 * 출력
 * 세로 길이가 A cm, 가로 길이가 B cm인 직사각형의 넓이를
 * cm² 단위로 구하고,
 * 단위(cm²)는 생략하여 출력한다.
 */
public class P27323 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int A = Integer.parseInt(br.readLine());
        int B = Integer.parseInt(br.readLine());

        System.out.println(A*B);
    }
}
