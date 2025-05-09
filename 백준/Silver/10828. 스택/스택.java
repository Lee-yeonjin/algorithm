import java.io.*;
import java.util.Stack;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Stack<Integer> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();

        int num = Integer.parseInt(br.readLine());
        for(int i=0; i<num; i++){
            String[] str = br.readLine().split(" ");

            if(str[0].equals("push")) stack.push(Integer.parseInt(str[1]));
            else if(str[0].equals("pop")) {
                if(stack.isEmpty()) sb.append(-1).append("\n");
                else sb.append(stack.pop()).append("\n");
            }
            else if(str[0].equals("top")) {
                if(stack.isEmpty()) sb.append(-1).append("\n");
                else sb.append(stack.peek()).append("\n");
            }
            else if(str[0].equals("size")) sb.append(stack.size()).append("\n");
            else if(str[0].equals("empty")) {
                if(stack.isEmpty()) sb.append(1).append("\n");
                else sb.append(0).append("\n");
            }
        }
        System.out.print(sb);
    }
}