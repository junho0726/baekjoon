package 단계_03_반복문;

import java.io.*;
import java.util.*;

/**
 * 문제
 * 준원이는 지난주에 처음으로 코스트코에 방문했다.
 * 몇 개 담지 않았다고 생각했지만, 계산된 금액이 예상보다 너무 높게 나왔다.
 * 이에 준원이는 영수증을 확인하며 계산이 정확한지 검증하려고 한다.
 *
 * 영수증에는 다음 정보가 적혀 있다.
 * 1. 구매한 각 물건의 가격과 개수
 * 2. 구매한 물건들의 총 금액
 *
 * 구매한 물건의 가격과 개수를 이용해 계산한 총 금액이
 * 영수증에 적힌 총 금액과 일치하는지 확인하는 프로그램을 작성하시오.
 *
 * 입력
 * - 첫째 줄에 영수증에 적힌 총 금액 X가 주어진다.
 * - 둘째 줄에 구매한 물건의 종류 수 N이 주어진다.
 * - 이후 N개의 줄에 각 물건의 가격 a와 개수 b가 공백으로 구분되어 주어진다.
 *
 * 출력
 * - 계산한 총 금액이 영수증의 총 금액과 일치하면 "Yes"를 출력한다.
 * - 일치하지 않으면 "No"를 출력한다.
 */
public class P25304 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int totalPrice = Integer.parseInt(br.readLine());
        int num = Integer.parseInt(br.readLine());
        int price = 0;

        for(int i = 1; i <= num; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            price += a*b;
        }

        if(totalPrice == price) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
