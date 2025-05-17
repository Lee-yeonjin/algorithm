import java.io.*;

public class Main {
    public static void main(String[] argvs) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        while(true){
            int num = Integer.parseInt(br.readLine());
            if (num == 0) break;
            int cnt = 0;

            for(int i = num+1; i<=num * 2; i++){
                boolean decimal = true;
                for(int k=2; k<=Math.sqrt(i); k++){
                    if(i % k == 0) {
                        decimal = false;
                        break;
                    }
                }
                if(decimal) cnt ++;
            }
            bw.write(cnt+"\n");
        }
        bw.flush();
        bw.close();
    }
}