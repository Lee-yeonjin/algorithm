import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int num = Integer.parseInt(br.readLine());

        for(int i=0; i<num; i++){
            String[] s = br.readLine().split(",");
            int sum = Integer.parseInt(s[0]) + Integer.parseInt(s[1]);
            sb.append(sum).append("\n");
        }

        System.out.println(sb);
    }
}