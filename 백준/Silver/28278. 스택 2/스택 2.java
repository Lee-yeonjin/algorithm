import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        MyStack stack = new MyStack();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int num = Integer.parseInt(br.readLine());

        for(int i=0; i<num; i++){
            String s = br.readLine();
            if(s.charAt(0) == '1') stack.push(Integer.parseInt(s.substring(2)));
            else if(s.equals("2")) sb.append(stack.pop()).append("\n");
            else if(s.equals("3")) sb.append(stack.size()).append("\n");
            else if(s.equals("4")) sb.append(stack.isEmpty()).append("\n");
            else if(s.equals("5")) sb.append(stack.peek()).append("\n");
        }

        System.out.print(sb);
    }
}

class MyStack {
    private Stack<Integer> stack = new Stack<>();

    public void push(int num){
        stack.push(num);
    }

    public int pop(){
        if(stack.isEmpty()) return -1;
        return stack.pop();
    }

    public int size(){
        return stack.size();
    }

    public int isEmpty(){
        if(stack.isEmpty()) return 1;
        else return 0;
    }

    public int peek(){
        if(stack.isEmpty()) return -1;
        return stack.peek();
    }
}