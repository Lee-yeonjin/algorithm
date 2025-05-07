import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());

        if(num == 0) System.out.println(0);
        else if(num == 1) System.out.println(1);
        else System.out.println(fibo(num));
    }
    public static int fibo(int n) {
        if(n == 0) return 0;
        else if(n == 1) return 1;
        return fibo(n - 1) + fibo(n-2);
    }
}