import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String str;
        String[][] arr = new String[5][];

        int max = 0;
        for(int i=0; i<5; i++){
            str = br.readLine();
            arr[i] = str.split("");
            if(arr[i].length > max) max = arr[i].length;
        }

        for(int i=0; i<max; i++){
            for(int k=0; k<5; k++){
                if (i < arr[k].length) { // 유효한 인덱스인지 확인
                    bw.write(arr[k][i]);
                }
            }
        }

        bw.flush();
        bw.close();
    }
}