import java.io.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] argvs) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int num = Integer.parseInt(br.readLine());
        for(int i = 0; i < num; i++) {
            String[] str = br.readLine().split(" ");
            ArrayList <String> list = new ArrayList <>();

            for(int k=0; k<str.length; k++){
                list.add(str[k]+" ");
            }
            bw.write("Case #"+(i+1)+": ");
            for(int k=list.size()-1; k>=0; k--){
                bw.write(list.get(k));
            }
            bw.newLine();
        }

        bw.flush();
        bw.close();
    }
}