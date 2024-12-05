import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main{

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int count = 0;
        int num = Integer.parseInt(br.readLine());
        String inputLine = br.readLine();
        String[] Arrays = inputLine.split(" ");
        int find = Integer.parseInt(br.readLine());

        for(int i=0; i<Arrays.length; i++){
            if(Integer.parseInt(Arrays[i]) == find) count ++;
        }

        System.out.println(count);

        bw.flush();
        bw.close();
    }
}