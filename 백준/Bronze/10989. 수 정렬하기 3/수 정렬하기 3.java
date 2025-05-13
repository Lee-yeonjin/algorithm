import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static int[] nums = new int[10000];
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int num = Integer.parseInt(br.readLine());
        int[] nums = new int[10001];

        for(int i=0; i<num; i++){
            int n = Integer.parseInt(br.readLine());
            nums[n] ++;
        }

        for(int i=0; i<nums.length; i++){
            for(int k=nums[i]; k>0; k--){
                sb.append(i).append("\n");
            }
        }
        System.out.print(sb);
    }
}