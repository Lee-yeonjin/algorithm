import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String str;
        while(true){
            str = br.readLine();
            if(str.equals("0 0")) break;
            String arr[] = str.split(" ");

            int fir = Integer.parseInt(arr[0]);
            int sec = Integer.parseInt(arr[1]);

            if(fir % sec == 0) bw.write("multiple");
            else if(sec % fir == 0) bw.write("factor");
            else bw.write("neither");

            bw.newLine();
        }

        bw.flush();
        bw.close();
    }
}