import java.io.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        ArrayList<Integer> list_x = new ArrayList<>();
        ArrayList<Integer> list_y = new ArrayList<>();
        int num;

        for(int i=0; i<3; i++){
            String[] str = br.readLine().split(" ");
            if(list_x.contains(Integer.parseInt(str[0]))){
                num = list_x.indexOf(Integer.parseInt(str[0]));
                list_x.remove(num);
            }
            else list_x.add(Integer.parseInt(str[0]));

            if(list_y.contains(Integer.parseInt(str[1]))) {
                num = list_y.indexOf(Integer.parseInt(str[1]));
                list_y.remove(num);
            }
            else list_y.add(Integer.parseInt(str[1]));
        }

        bw.write(list_x.get(0) + " " + list_y.get(0));
        bw.flush();
        bw.close();

    }
}