import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> list = new ArrayList<>();
        int sum = 0;

        for(int i=0; i<5; i++){
            int num = Integer.parseInt(br.readLine());
            list.add(num);
            sum += num;
        }
        Collections.sort(list);
        System.out.println(sum/5);
        System.out.print(list.get(2));
    }
}