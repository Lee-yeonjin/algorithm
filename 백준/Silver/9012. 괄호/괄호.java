import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int num = Integer.parseInt(br.readLine());

        for(int i=0; i<num; i++) {
            Stack<Character> stack = new Stack<>();
            boolean vps = true;

            String s = br.readLine();
            if(s.length() % 2 != 0 || s.charAt(0) == ')') {
                sb.append("NO").append("\n");
                continue;
            }

            stack.push(s.charAt(0));
            for(int k=1; k<s.length(); k++) {
                if(stack.isEmpty() && s.charAt(k) == ')') {
                    vps = false;
                    break;
                }
                else if(!stack.isEmpty() && stack.peek() == s.charAt(k)) stack.push(s.charAt(k));
                else if(!stack.isEmpty() && stack.peek() != s.charAt(k)) stack.pop();
                else stack.push(s.charAt(k));
            }

            if(vps && stack.isEmpty())sb.append("YES").append("\n");
            else sb.append("NO").append("\n");
        }
        System.out.print(sb);
    }
}