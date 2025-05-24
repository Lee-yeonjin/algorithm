import java.io.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        ArrayList<Integer> list = new ArrayList<>();

        while(true){
            String[] str = br.readLine().split(" ");
            list.clear();

            int fir = Integer.parseInt(str[0]);
            int sec = Integer.parseInt(str[1]);
            int thi = Integer.parseInt(str[2]);

            if(fir == 0 && sec == 0 && thi == 0) break;
            else if (fir == sec && sec == thi) {
                bw.write("Equilateral \n");
                continue;
            }

            int max = Math.max(fir, sec);
            max = Math.max(max,thi);

            if(fir != max) list.add(fir);
            if(sec != max) list.add(sec);
            if(thi != max) list.add(thi);

            if(fir == sec || fir == thi || sec == thi) list.add(max);

            if (max >= list.get(0) + list.get(1)) bw.write("Invalid \n");
            else if (fir == sec || fir == thi || sec == thi) bw.write("Isosceles \n");
            else bw.write("Scalene \n");
        }

        bw.flush();
        bw.close();
    }
}