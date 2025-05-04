import java.io.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        ArrayList<Integer> list = new ArrayList<>();
        int sum = 0;

        while (true) {
            int num = Integer.parseInt(br.readLine());
            if (num == -1) break;

            for (int k = 1; k <= num / 2; k++) {
                if (num % k == 0) {
                    sum += k;
                    list.add(k);
                }
            }
            if (num != sum) {
                bw.write(num + " is NOT perfect.\n");
                list.clear();
            } else {
                bw.write(num + " = ");
                for (int i = 0; i < list.size() - 1; i++) {
                    bw.write(list.get(i) + " + ");
                }
                bw.write(list.get(list.size() - 1) + "\n");
            }
            sum = 0;
        }
        bw.flush();
    }
}