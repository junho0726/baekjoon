package 단계_14_집합과_맵;

import java.io.*;
import java.util.*;

/**
 * 문제 요약
 * 포켓몬 도감에 1번부터 N번까지 포켓몬 이름이 순서대로 저장되어 있다.
 * 이후 M개의 문제가 주어지는데,
 * 입력이 숫자이면 해당 번호의 포켓몬 이름을 출력하고,
 * 입력이 문자열이면 해당 이름의 포켓몬 번호를 출력하면 된다.
 *
 * 입력
 * 1. 첫째 줄: N, M
 * 2. 다음 N줄: 1번부터 N번까지의 포켓몬 이름
 * 3. 다음 M줄: 맞혀야 하는 문제(숫자 또는 이름)
 *
 * 출력
 * - 각 문제에 대해
 *   숫자가 들어오면 해당 번호의 포켓몬 이름 출력
 *   이름이 들어오면 해당 포켓몬 번호 출력
 */
public class P1620 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        String [] arr = new String[N + 1];
        Map<String, Integer> map = new HashMap<>();

        for(int i = 1; i <= N; i++) {
            String name = br.readLine();
            arr[i] = name;
            map.put(name ,  i);
        }

        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < M; i++){
            String input = br.readLine();
            if(Character.isDigit(input.charAt(0))){
                int num = Integer.parseInt(input);
                sb.append(arr[num]).append("\n");
            } else {
                sb.append(map.get(input)).append("\n");
            }
        }
        System.out.println(sb);
    }
}
