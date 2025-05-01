import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int num = Integer.parseInt(br.readLine());
        int k;
        for(int i=0; i<num; i++){
            k = Integer.parseInt(br.readLine());
            sb.append((int)k/25 + " " + (int)((k%25)/10) + " " + (int)((k%25)%10)/5 + " " + (int)((((k%25)%10)%5)/1) + "\n");
        }
        System.out.println(sb);
    }
}