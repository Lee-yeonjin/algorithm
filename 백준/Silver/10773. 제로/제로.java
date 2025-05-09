import java.io.*;
import java.util.Stack;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Mystack stack = new Mystack();

        int num = Integer.parseInt(br.readLine());
        for(int i=0; i<num; i++){
            int n = Integer.parseInt(br.readLine());
            if(n == 0) stack.pop();
            else stack.push(n);
        }

        int sum = 0;
        for(int k=stack.size(); k>0; k--){
            sum += stack.pop();
        }
        System.out.println(sum);
    }
}
class Mystack {
    Stack<Integer> stack = new Stack<>();
    public void push(int num){
        stack.push(num);
    }

    public int pop(){
        return stack.pop();
    }

    public int size(){
        return stack.size();
    }
}