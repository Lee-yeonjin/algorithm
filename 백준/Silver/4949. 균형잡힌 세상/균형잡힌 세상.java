import java.util.Stack;
import java.io.*;

public class Main {
    public static void main(String[] argvs) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        while(true){
            String str = br.readLine();
            if(str.equals(".")) break;
            Stack<Character> stack = new Stack<>();

            for(int i=0; i<str.length(); i++){
                if(str.charAt(i)== '(' || str.charAt(i) == '[') stack.push(str.charAt(i));
                else if(str.charAt(i)== ')' && !stack.isEmpty()) {
                    if (stack.peek() == '(') stack.pop();
                    else stack.push(str.charAt(i));
                }
                else if(str.charAt(i)== ']' && !stack.isEmpty()) {
                    if (stack.peek() == '[') stack.pop();
                    else stack.push(str.charAt(i));
                }
                else if(stack.isEmpty() && str.charAt(i) == ')') {
                    stack.push(str.charAt(i));
                    break;
                }
                else if(stack.isEmpty() && str.charAt(i) == ']') {
                    stack.push(str.charAt(i));
                    break;
                }
            }
            if(stack.isEmpty()) bw.write("yes" + "\n");
            else bw.write("no" + "\n");
        }

        bw.flush();
        bw.close();
    }
}
