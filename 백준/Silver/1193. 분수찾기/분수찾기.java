import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int num = Integer.parseInt(br.readLine());
        int cnt = 1;
        int fir = 1, sec = 1, sum = 3; // 분자, 분모, 합계

        while(true){
            if(cnt == num) break;

            if(sum % 2 != 0){
                fir = 1;
                sec = sum -1;
            }
            else {
                fir = sum - 1;
                sec = 1;
            }

            for(int k=1; k<sum; k++){
                cnt ++;
                if(cnt == num) break;
                else if(sum % 2 != 0){
                    fir++;
                    sec--;
                }
                else {
                    fir --;
                    sec ++;
                }
            }
            sum ++;

        }
        bw.write(fir + "/" + sec);
        bw.flush();
        bw.close();
    }
}