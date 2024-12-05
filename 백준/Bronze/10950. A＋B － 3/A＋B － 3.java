import java.io.IOException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main{

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int num = Integer.valueOf(br.readLine());

        for(int i=0; i<num; i++){
            String inputLine = br.readLine();
            String[] Arrays = inputLine.split(" ");

            bw.write(String.valueOf(Integer.parseInt(Arrays[0]) + Integer.parseInt(Arrays[1])));
            bw.newLine();
        }

        bw.flush();
        bw.close();
    }
}