package 단계_13_정렬;

import java.io.*;
import java.util.*;

/**
 * 문제
 * 수직선 위에 N개의 좌표 X1, X2, ..., XN이 있다.
 * 이 좌표에 좌표 압축을 적용하려고 한다.
 *
 * Xi를 좌표 압축한 결과 X'i의 값은
 * Xi > Xj를 만족하는 서로 다른 좌표 Xj의 개수와 같아야 한다.
 *
 * X1, X2, ..., XN에 좌표 압축을 적용한 결과
 * X'1, X'2, ..., X'N를 출력하는 프로그램을 작성하시오.
 *
 * 입력
 * 첫째 줄에 좌표의 개수 N이 주어진다.
 *
 * 둘째 줄에는 공백으로 구분된 X1, X2, ..., XN이 주어진다.
 *
 * 출력
 * 첫째 줄에 X'1, X'2, ..., X'N을 공백 한 칸으로 구분하여 출력한다.
 */
public class P18870 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int [] arr = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        int [] sorted = arr.clone();
        Arrays.sort(sorted);
        Map<Integer, Integer> map = new HashMap<>();

        int idx = 0;
        for(int num : sorted) {
            if(!map.containsKey(num)){
                map.put(num, idx++);
            }
        }
        StringBuilder sb = new StringBuilder();
        for(int num : arr) {
            sb.append(map.get(num)).append(" ");
        }
        System.out.print(sb);
    }
}
