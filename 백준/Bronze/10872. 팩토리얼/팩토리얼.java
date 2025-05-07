import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        
        if(num == 0) System.out.println("1");
        else System.out.println(factorial(num));
    }
    public static int factorial(int num) {
        if(num ==1) return 1;
        else return num * factorial(num-1);
    }
}