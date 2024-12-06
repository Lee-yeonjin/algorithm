import java.io.IOException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String inputLine = br.readLine();
        String[] num = inputLine.split(" ");

        String inputLine2 = br.readLine();
        String[] nums = inputLine2.split(" ");

        for(int i=0; i<Integer.valueOf(num[0]); i++){
            if(Integer.valueOf(nums[i]) < Integer.valueOf(num[1])) bw.write(nums[i] + " ");
        }

        bw.flush();
        bw.close();
    }
}