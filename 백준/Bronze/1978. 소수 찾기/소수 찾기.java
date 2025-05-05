import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(br.readLine());      // N개의 수
        String[] s = br.readLine().split(" ");      // 실제 수
        int cnt = 0;    // 소수 개수 출력
        int decimal_cnt;

        int n;
        for (int i = 0; i < num; i++) {
            n = Integer.parseInt(s[i]);
            decimal_cnt = 0;

            for (int k = 2; k <= Math.sqrt(n); k++) {
                if (n % k == 0) decimal_cnt++;
            }
            if (n != 1 && decimal_cnt == 0) {
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}