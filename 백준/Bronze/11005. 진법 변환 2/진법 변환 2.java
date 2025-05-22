import java.io.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)) ;
        ArrayList<Integer> list = new ArrayList<>();

        String[] nums = br.readLine().split(" ");

        int fir = Integer.parseInt(nums[0]); // 구해야 하는 수
        int num = Integer.parseInt(nums[1]); // 진법 수

        while(fir > 0){
            list.add(fir % num);
            fir = fir / num;
        }

        for(int k=list.size()-1; k>=0; k--){
            if(list.get(k) >= 10) bw.write((char)('A' + list.get(k)-10));
            else bw.write('0'+list.get(k));
        }

        bw.flush();
        bw.close();
    }
}