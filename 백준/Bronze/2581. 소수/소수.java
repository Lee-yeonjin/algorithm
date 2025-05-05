import java.io.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> list = new ArrayList<>();

        int num = Integer.parseInt(br.readLine());      // 첫 번째 수
        int num2 = Integer.parseInt(br.readLine());     // 두 번째 수
        int decimal_cnt;
        int sum = 0;

        for(int i=num; i<=num2; i++){
            decimal_cnt = 0;
            for(int k=2; k<=Math.sqrt(i); k++){
                if(i % k == 0) decimal_cnt ++;
            }
            if(i != 1 && decimal_cnt == 0) {
                list.add(i);
                sum += i;
            }
        }
        if(!list.isEmpty()) {
            System.out.println(sum);
            System.out.println(list.get(0));
        }
        else {
            System.out.println("-1");
        }
    }
}