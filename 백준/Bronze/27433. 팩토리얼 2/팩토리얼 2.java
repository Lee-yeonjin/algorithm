import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Long num = Long.parseLong(br.readLine());

        if(num == 0) System.out.println(1);
        else System.out.println(factorial(num));
    }
    public static Long factorial(Long n) {
        if(n == 1) return 1L;
        return n * factorial(n - 1);
    }
}