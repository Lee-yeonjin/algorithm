import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int[] nums = new int[3];

        int sum = 0;
        for(int i=0; i<3; i++){
            int num = Integer.parseInt(br.readLine());
            sum += num;
            nums[i] = num;
        }

        if(sum != 180) bw.write("Error");
        else if(nums[0] == 60 && nums[1] == 60 && nums[2] == 60) bw.write("Equilateral");
        else if(nums[0] == nums[1] || nums[0] == nums[2] || nums[1] == nums[2]) bw.write("Isosceles");
        else bw.write("Scalene");

        bw.flush();
        bw.close();
    }
}