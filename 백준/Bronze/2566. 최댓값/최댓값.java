import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[][] nums = new int[9][9];

        // 9x9 배열 입력 받기
        for (int i = 0; i < 9; i++) {
            String str = br.readLine();
            String[] strs = str.split(" ");

            for (int j = 0; j < 9; j++) {
                nums[i][j] = Integer.parseInt(strs[j]);
            }
        }

        int max = -1; // 초기값을 -1로 설정
        int h = 0, y = 0;

        // 최대값 찾기
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (nums[i][j] > max) {
                    max = nums[i][j];
                    h = i + 1; // 1-based index
                    y = j + 1; // 1-based index
                }
            }
        }

        // 결과 출력
        bw.write(max + "\n");
        bw.write(h + " " + y + "\n");
        bw.flush();
        bw.close();
    }
}
