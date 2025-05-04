import java.io.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        ArrayList<Integer> list = new ArrayList<>();

        String[] nums = br.readLine().split(" ");
        int num = Integer.parseInt(nums[0]);
        int sequence = Integer.parseInt(nums[1]);

        for(int i=1; i<=num/2; i++){
            if(num % i == 0) list.add(i);
        }
        list.add(num);

        if(list.size() >= sequence) bw.write(String.valueOf(list.get(sequence-1)));
        else bw.write("0");

        bw.flush();
    }
}