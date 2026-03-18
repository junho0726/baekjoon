package 단계_13_정렬;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class P1427 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        char [] arr = str.toCharArray();

        Arrays.sort(arr);

        for(int i = arr.length -1;  i >= 0; i--) {
            System.out.print(arr[i]);
        }
    }
}
