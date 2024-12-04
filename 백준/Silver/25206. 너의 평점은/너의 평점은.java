import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

            String inputLine;
            int cnt = 0;
            float sum = 0.0f;
            float grade = 0.0f;

            for(int i=0; i<20; i++){
                inputLine = br.readLine();
                String[] split = inputLine.split(" ");
                if(!split[2].equals("P")){
                    if(split[2].equals("A+")) grade = 4.5f;
                    else if (split[2].equals("A0")) grade = 4.0f;
                    else if (split[2].equals("B+")) grade = 3.5f;
                    else if (split[2].equals("B0")) grade = 3.0f;
                    else if (split[2].equals("C+")) grade = 2.5f;
                    else if (split[2].equals("C0")) grade =2.0f;
                    else if (split[2].equals("D+")) grade = 1.5f;
                    else if (split[2].equals("D0")) grade = 1.0f;
                    else if (split[2].equals("F")) grade = 0.0f;

                    sum += (Float.valueOf(split[1]) * grade);
                    cnt += Float.valueOf(split[1]);
                }
            }

            if (cnt > 0) {
                bw.write(String.format("%.6f",sum/cnt));
            } else {
                bw.write("0.000000");
            }

            bw.flush();
            bw.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
