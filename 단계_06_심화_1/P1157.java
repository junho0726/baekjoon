package 단계_06_심화_1;

import java.io.*;

/**
 * 문제
 * 알파벳 대소문자로 된 단어가 주어지면, 이 단어에서 가장 많이 사용된 알파벳이 무엇인지 알아내는 프로그램을 작성하시오. 단, 대문자와 소문자를 구분하지 않는다.
 * 입력
 * 첫째 줄에 알파벳 대소문자로 이루어진 단어가 주어진다. 주어지는 단어의 길이는 1,000,000을 넘지 않는다.
 * 출력
 * 첫째 줄에 이 단어에서 가장 많이 사용된 알파벳을 대문자로 출력한다. 단, 가장 많이 사용된 알파벳이 여러 개 존재하는 경우에는 ?를 출력한다.
 */
public class P1157 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();

        int[] count = new int[26];

        for(int i = 0; i < s.length(); i++) {
            char c = Character.toUpperCase(s.charAt(i));
            count[c - 'A']++;
        }

        int max = 0;
        char result = '?';

        for(int i = 0; i < 26; i++) {
            if(count[i] > max) {
                max = count[i];
                result = (char) (i + 'A');
            } else if( count[i] == max) {
                result = '?';
            }
        }
        System.out.println(result);
    }
}
