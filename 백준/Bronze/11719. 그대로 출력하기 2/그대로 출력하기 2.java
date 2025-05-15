import java.io.*;

public class Main {
    public static void main(String[] argvs) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        while (true) {
            String str = br.readLine();
            if(str == null) break;
            bw.write(str);
            bw.newLine();
        }

        bw.flush();
        bw.close();
    }
}