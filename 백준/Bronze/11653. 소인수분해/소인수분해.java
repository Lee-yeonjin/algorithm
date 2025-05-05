import java.io.*;
import java.lang.StringBuilder;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int num = Integer.parseInt(br.readLine());
        if(num == 1) return;

       while(num > 1){
           for(int i=2; i<=num; i++){
               if(num % i == 0) {
                   sb.append(i+"\n");
                   num = num/i;
                   break;
               }
           }
       }
       System.out.println(sb);
    }
}