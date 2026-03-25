package 단계_13_정렬;

import java.io.*;
import java.util.*;

/**
 * 문제
 * 온라인 저지에 가입한 사람들의 나이와 이름이 가입한 순서대로 주어진다.
 * 이때, 회원들을 다음 조건에 따라 정렬하는 프로그램을 작성하시오.
 *
 * 1. 나이가 증가하는 순으로 정렬한다.
 * 2. 나이가 같으면 먼저 가입한 사람이 앞에 오도록 한다. (입력 순서 유지)
 *
 * 입력
 * 첫째 줄에 회원의 수 N이 주어진다. (1 ≤ N ≤ 100,000)
 *
 * 둘째 줄부터 N개의 줄에 걸쳐 각 회원의 나이와 이름이 공백으로 구분되어 주어진다.
 * - 나이: 1 이상 200 이하의 정수
 * - 이름: 알파벳 대소문자로 이루어진 문자열 (길이 ≤ 100)
 *
 * 입력은 가입한 순서대로 주어진다.
 *
 * 출력
 * 회원들을 나이 순으로, 나이가 같으면 가입한 순서를 유지하여
 * 한 줄에 한 명씩 "나이 이름" 형식으로 출력한다.
 */
public class P10814 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        List<Person> list = new ArrayList<>();

        for(int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int age = Integer.parseInt(st.nextToken());
            String name = st.nextToken();

            list.add(new Person(age, name));
        }

        Collections.sort(list, (a, b) -> Integer.compare(a.age, b.age));

        for (Person person : list) {
            System.out.println(person.age+" "+person.name);
        }
        

    }
    static class Person {
        int age;
        String name;

        public Person(int age, String name) {
            this.age = age;
            this.name = name;
        }

    }
}
