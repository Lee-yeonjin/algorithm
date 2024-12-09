import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main{
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String num = br.readLine();
        String[] ans = num.split(" ");

        String[][] nums = new String[Integer.parseInt(ans[0])][Integer.parseInt(ans[1])];
        String[][] nums2 = new String[Integer.parseInt(ans[0])][Integer.parseInt(ans[1])];

        for (int i=0; i<Integer.parseInt(ans[0]); i++){
            String str = br.readLine();
            nums[i] = str.split(" ");
        }

        for (int i=0; i<Integer.parseInt(ans[0]); i++){
            String str = br.readLine();
            nums2[i] = str.split(" ");
        }

        for(int i=0; i < Integer.parseInt(ans[0]); i++){
            for( int k=0; k<Integer.parseInt(ans[1]); k++){
                nums2[i][k] = String.valueOf(Integer.parseInt(nums2[i][k]) + Integer.parseInt(nums[i][k]));
                bw.write(nums2[i][k] + " ");
            }
        bw.newLine();
        }

        bw.flush();
        bw.close();
    }
}