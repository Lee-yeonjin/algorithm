import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)) ;

        String[] nums = br.readLine().split(" ");

        int num = Integer.parseInt(nums[1]); // 진법 수
        int sum = 0;

        for(int i=0; i<nums[0].length(); i++){
            if('A' <= nums[0].charAt(i) && nums[0].charAt(i) <= 'Z'){
                sum += (nums[0].charAt(i) - 'A' + 10) * Math.pow(num, nums[0].length()-i-1);
            }
            else sum += (nums[0].charAt(i) - '0') * Math.pow(num, nums[0].length()-i-1);
        }

        bw.write(String.valueOf(sum));
        bw.flush();
        bw.close();
    }
}