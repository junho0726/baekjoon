package 단계_12_브루트_포스;

import java.io.*;
import java.util.*;

/**
 * 문제
 * 지민이는 자신의 저택에서 MN개의 단위 정사각형으로 나누어져 있는 M×N 크기의 보드를 찾았다.
 * 어떤 정사각형은 검은색으로 칠해져 있고, 나머지는 흰색으로 칠해져 있다.
 * 지민이는 이 보드를 잘라서 8×8 크기의 체스판으로 만들려고 한다.
 *
 * 체스판은 검은색과 흰색이 번갈아서 칠해져 있어야 한다.
 * 구체적으로, 각 칸이 검은색과 흰색 중 하나로 색칠되어 있고,
 * 변을 공유하는 두 개의 사각형은 다른 색으로 칠해져 있어야 한다.
 *
 * 따라서 이 정의를 따르면 체스판을 색칠하는 경우는 두 가지뿐이다.
 * 1. 맨 왼쪽 위 칸이 흰색인 경우
 * 2. 맨 왼쪽 위 칸이 검은색인 경우
 *
 * 보드가 체스판처럼 칠해져 있다는 보장이 없기 때문에,
 * 지민이는 8×8 크기의 체스판으로 잘라낸 후 몇 개의 정사각형을 다시 칠해야 한다.
 * 8×8 크기의 영역은 보드의 어느 위치에서든 선택할 수 있다.
 *
 * 지민이가 다시 칠해야 하는 정사각형의 최소 개수를 구하는 프로그램을 작성하시오.
 *
 * 입력
 * 첫째 줄에 N과 M이 주어진다. (8 ≤ N, M ≤ 50)
 * 둘째 줄부터 N개의 줄에 걸쳐 보드의 각 행 상태가 주어진다.
 * B는 검은색, W는 흰색을 의미한다.
 *
 * 출력
 * 다시 칠해야 하는 정사각형 개수의 최솟값을 출력한다.
 */
public class P1018 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        char[][] board = new char[N][M];

        for(int i = 0; i < N; i++) {
            board[i] = br.readLine().toCharArray();
        }

        int answer = Integer.MAX_VALUE;

        for(int i = 0; i <= N - 8; i++){
            for(int j = 0; j <= M - 8; j++) {
                int countW = 0;
                int countB = 0;


                for(int x = 0; x < 8; x++) {
                    for(int y = 0; y < 8; y++) {

                        char current = board[i+x][j+y];

                        if((x+y) %2 ==0) {
                            if(current != 'W') countW++;
                            if(current != 'B') countB++;
                        } else {
                            if(current != 'B') countW++;
                            if(current != 'W') countB++;
                        }
                    }
                }
                answer = Math.min(answer, Math.min(countW, countB));
            }
        }
        System.out.println(answer);
    }
}
