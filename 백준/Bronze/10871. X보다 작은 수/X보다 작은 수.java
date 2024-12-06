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

        int n = Integer.parseInt(num[0]);
        int m = Integer.parseInt(num[1]);

        String inputLine2 = br.readLine();
        String[] nums = inputLine2.split(" ");

        StringBuilder result = new StringBuilder();

        for(int i=0; i<n; i++){
            if(Integer.valueOf(nums[i]) < m) result.append(nums[i]).append(" ");
        }

        bw.write(result.toString().trim());
        bw.flush();
        bw.close();
    }
}