import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int fir = Integer.parseInt(br.readLine());
        int sec = Integer.parseInt(br.readLine());
        int thi = Integer.parseInt(br.readLine());

        String sum = String.valueOf(fir * sec * thi);
        int[] nums = new int[10];

        for(int i=0; i<sum.length(); i++){
            nums[sum.charAt(i)-'0'] ++;
        }

        for(int i=0; i<nums.length; i++){
            System.out.println(nums[i]);
        }
    }
}