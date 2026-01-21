package 단계_01_입출력과_사칙연산;

import java.io.*;
import java.util.*;

/**
 * 문제 (A+B)%C는 ((A%C) + (B%C))%C 와 같을까?
 * (A×B)%C는 ((A%C) × (B%C))%C 와 같을까?
 * 세 수 A, B, C가 주어졌을 때, 위의 네 가지 값을 구하는 프로그램을 작성하시오.
 * 입력 첫째 줄에 A, B, C가 순서대로 주어진다. (2 ≤ A, B, C ≤ 10000)
 * 출력 첫째 줄에 (A+B)%C, 둘째 줄에 ((A%C) + (B%C))%C, 셋째 줄에 (A×B)%C, 넷째 줄에 ((A%C) × (B%C))%C를 출력한다.
 */
public class P10430 {
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());

        StringBuilder sb = new StringBuilder();
        sb.append((a+b)%c).append("\n");
        sb.append(((a%c)+(b%c))%c).append("\n");
        sb.append((a*b)%c).append("\n");
        sb.append(((a%c)*(b%c))%c).append("\n");
      
        System.out.print(sb);
    }
}
