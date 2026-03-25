package 단계_13_정렬;

import java.io.*;
import java.util.*;

/**
 * 문제
 * 알파벳 소문자로 이루어진 N개의 단어가 주어진다.
 * 아래 조건에 따라 단어를 정렬하는 프로그램을 작성하시오.
 *
 * 1. 길이가 짧은 것부터 정렬한다.
 * 2. 길이가 같으면 사전 순으로 정렬한다.
 * 3. 중복된 단어는 하나만 남기고 제거한다.
 *
 * 입력
 * 첫째 줄에 단어의 개수 N이 주어진다. (1 ≤ N ≤ 20,000)
 * 둘째 줄부터 N개의 줄에 걸쳐 알파벳 소문자로 이루어진 단어가
 * 한 줄에 하나씩 주어진다.
 * 각 문자열의 길이는 50을 넘지 않는다.
 *
 * 출력
 * 조건에 따라 정렬한 단어들을 한 줄에 하나씩 출력한다.
 */
public class P1181 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        Set<String> set = new HashSet();

        for(int i = 0; i < N; i++) {
            set.add(br.readLine());
        }

        List<String> list = new ArrayList<>(set);

        Collections.sort(list, (a, b) -> {
            if(a.length() == b.length()) {
                return a.compareTo(b);
            }
            return a.length() - b.length();
        });

        for (String s : list) {
            System.out.println(s);
        }

    }
}
