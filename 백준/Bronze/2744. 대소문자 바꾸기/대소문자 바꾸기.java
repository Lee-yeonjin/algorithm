import java.io.*;

public class Main {
    public static void main(String[] argvs) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String str = br.readLine();

        for(int i=0; i<str.length(); i++){
            if('a' <= str.charAt(i)  && str.charAt(i) <= 'z') bw.write(Character.toUpperCase(str.charAt(i)));
            else bw.write(Character.toLowerCase(str.charAt(i)));
        }

        bw.flush();
        bw.close();
    }
}