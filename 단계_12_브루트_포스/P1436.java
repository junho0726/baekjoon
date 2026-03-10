package 단계_12_브루트_포스;

import java.io.*;

/**
 * 문제
 * 666은 종말을 나타내는 수라고 한다. 많은 블록버스터 영화에서는 666이 들어간 제목을 사용한다.
 * 영화감독 숌은 "세상의 종말"이라는 시리즈 영화의 감독이다.
 *
 * 조지 루카스는 스타워즈를 만들 때 스타워즈 1, 스타워즈 2, 스타워즈 3처럼 제목을 지었고,
 * 피터 잭슨은 반지의 제왕을 만들 때 반지의 제왕 1, 반지의 제왕 2, 반지의 제왕 3처럼 제목을 지었다.
 *
 * 하지만 숌은 자신이 이들을 뛰어넘는다는 것을 보여주기 위해 영화 제목을 다르게 만들기로 했다.
 *
 * 종말의 수란 어떤 수에 '6'이 적어도 3개 이상 연속으로 들어가는 수를 말한다.
 *
 * 예시
 * 가장 작은 종말의 수 : 666
 * 다음 수 : 1666, 2666, 3666 ...
 *
 * 따라서 숌은 다음과 같이 영화 제목을 만든다.
 *
 * 1번째 영화 : 세상의 종말 666
 * 2번째 영화 : 세상의 종말 1666
 * ...
 *
 * 일반화하면
 * N번째 영화의 제목은
 *
 * 세상의 종말 (N번째로 작은 종말의 수)
 *
 * 가 된다.
 *
 * 숌은 이 시리즈를 항상 순서대로 만들며 다른 영화는 만들지 않는다.
 *
 * 입력
 * 첫째 줄에 N이 주어진다.
 * N은 10,000보다 작거나 같은 자연수이다.
 *
 * 출력
 * N번째 영화의 제목에 들어간 수를 출력한다.
 */

public class P1436 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int count = 0;
        int num = 0;

        while(true) {
            if(String.valueOf(num).contains("666")) {
                count ++;
            }

            if(count == N) {
                System.out.println(num);
                break;
            }
            num++;
        }
    }
}
