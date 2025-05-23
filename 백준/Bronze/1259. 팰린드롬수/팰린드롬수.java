import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        while (true) {
            String s = br.readLine();
            if (s.equals("0")) break;

            boolean isPalindrome = true;
            int len = s.length();

            for (int i = 0; i < len / 2; i++) {
                if (s.charAt(i) != s.charAt(len - 1 - i)) {
                    isPalindrome = false;
                    break;
                }
            }
            if (isPalindrome) sb.append("yes\n");
            else sb.append("no\n");
        }
        System.out.print(sb);
    }
}