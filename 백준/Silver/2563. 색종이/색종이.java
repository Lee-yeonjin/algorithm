import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int [][] nums = new int [100][100];

        for(int i=0; i < 100; i++){
            for(int k=0; k < 100; k++){
                nums[i][k] = 0;
            }
        }

        int num = Integer.parseInt(br.readLine());
        for(int i=0; i<num; i++){
            String [] array = br.readLine().split(" ");

            int fir = Integer.parseInt(array[0]);
            int sec = Integer.parseInt(array[1]);

            for(int k=fir; k < fir + 10; k++){
                for(int j = sec; j < sec + 10; j++){
                    nums[k][j] = 1;
                }
            }
        }

        int count = 0;

        for(int i=0; i<100; i++){
            for(int k=0; k < 100; k++){
                if(nums[i][k] == 1){ count ++; }
            }
        }
        System.out.print(count);
    }
}