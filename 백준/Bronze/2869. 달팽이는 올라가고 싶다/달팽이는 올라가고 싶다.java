import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] str = br.readLine().split(" ");
        int a = Integer.parseInt(str[0]);
        int b = Integer.parseInt(str[1]);
        int v = Integer.parseInt(str[2]);

        int n = (v-a) / (a-b);

        if((a-b) * n + a >= v) System.out.println(n+1);
        else System.out.println(n + 2);
    }
}