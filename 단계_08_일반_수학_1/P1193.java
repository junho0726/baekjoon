package 단계_08_일반_수학_1;

import java.io.*;

/**
 * [문제]
 * 무한히 큰 배열에 다음과 같이 분수들이 적혀 있다.
 *
 * 1/1   1/2   1/3   1/4   1/5   …
 * 2/1   2/2   2/3   2/4   …     …
 * 3/1   3/2   3/3   …     …     …
 * 4/1   4/2   …     …     …     …
 * 5/1   …     …     …     …     …
 * …     …     …     …     …     …
 *
 * 이 분수들을 다음과 같은 지그재그 순서로 나열한다.
 *
 * 1/1 → 1/2 → 2/1 → 3/1 → 2/2 → 1/3 → …
 *
 * 이때,
 * 위 순서대로 나열했을 때의 분수를
 * 1번, 2번, 3번, 4번, 5번, … 분수라고 한다.
 *
 * 정수 X가 주어졌을 때,
 * X번째에 해당하는 분수를 구하는 프로그램을 작성하시오.
 *
 * --------------------------------------------------
 * [입력]
 * 첫째 줄에 정수 X가 주어진다.
 * (1 ≤ X ≤ 10,000,000)
 *
 * --------------------------------------------------
 * [출력]
 * X번째 분수를 "분자/분모" 형태로 출력한다.
 */

public class P1193 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int X = Integer.parseInt(br.readLine());

        int diagonal = 1;   // 현재 대각선 번호
        int count = 0;      // 지금까지 나온 분수 개수

        // X가 속한 대각선 찾기
        while (count + diagonal < X) {
            count += diagonal;
            diagonal++;
        }

        // 대각선 안에서의 위치 (1부터 시작)
        int pos = X - count;

        int numerator, denominator;

        // 방향 결정
        if (diagonal % 2 == 1) {   // 홀수 대각선
            numerator = diagonal - pos + 1;
            denominator = pos;
        } else {                   // 짝수 대각선
            numerator = pos;
            denominator = diagonal - pos + 1;
        }

        System.out.println(numerator + "/" + denominator);
    }
}
