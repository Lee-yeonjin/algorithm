import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String s = br.readLine();

        int k = 1;
        for(int i=0; i<s.length(); i++){
            if(k == 10) {
                sb.append(s.charAt(i) +"\n");
                k = 0;
            }
            else  sb.append(s.charAt(i));
            k++;
        }
        System.out.println(sb);
    }
}