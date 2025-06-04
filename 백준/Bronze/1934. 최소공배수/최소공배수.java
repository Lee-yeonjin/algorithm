import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader  br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int num = Integer.parseInt(br.readLine());
        for(int i=0; i<num; i++){
            String[] str = br.readLine().split(" ");
            int fir = Integer.parseInt(str[0]);
            int sec = Integer.parseInt(str[1]);

            int max = Math.max(fir, sec);
            int min = Math.min(fir, sec);

            int least_num  = max_num(max, min);
            sb.append(fir * sec / least_num).append("\n");
        }
        System.out.print(sb);
    }

    public static int max_num(int max, int min){
        int num = 1;
        for(int i=1; i<=min; i++){
            if(max % i ==0 && min % i == 0) num = i;
        }
        return num;
    }
}