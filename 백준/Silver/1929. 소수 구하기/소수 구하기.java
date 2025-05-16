import java.io.*;

public class Main {
    public static void main(String[] argvs) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] str = br.readLine().split(" ");
        int fir = Integer.parseInt(str[0]);
        int sec = Integer.parseInt(str[1]);

        for(int i=fir; i<=sec; i++){
            boolean decimal = true;
            for(int k = 2; k<=Math.sqrt(i); k++){
                if(i % k == 0) {
                    decimal = false;
                    break;
                }
            }
            if(decimal && i != 1) bw.write(i+"\n");
        }
        bw.flush();
        bw.close();
    }
}