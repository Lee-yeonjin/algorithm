import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> list = new ArrayList<>();
        Stack<Integer> stack = new Stack<>();

        int num = Integer.parseInt(br.readLine());
        String[] str = br.readLine().split(" ");

        int cnt = 1;
        for(int i=0; i<num; i++){
            while(!stack.isEmpty() && stack.peek() == cnt){
                stack.pop();
                cnt++;
            }

            if(Integer.parseInt(str[i]) == cnt) {
                cnt ++;
            }
            else stack.push(Integer.parseInt(str[i]));
        }

        while(!stack.isEmpty() && stack.peek() == cnt){
            stack.pop();
            cnt ++;
        }

        if(stack.isEmpty()) System.out.println("Nice");
        else System.out.println("Sad");
    }
}