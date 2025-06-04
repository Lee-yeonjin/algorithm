import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader  br = new BufferedReader(new InputStreamReader(System.in));

        String[] fir = br.readLine().split(" ");
        String[] sec = br.readLine().split(" ");

        int num1 = Integer.parseInt(fir[1]) * Integer.parseInt(sec[1]); // 분모
        int num2 = (Integer.parseInt(fir[0]) * Integer.parseInt(sec[1])) + (Integer.parseInt(sec[0]) * Integer.parseInt(fir[1])); // 분자

        int min_num = gcd(num2, num1);
        System.out.println(num2/min_num + " " + num1/min_num);
    }

    public static int gcd(int num1, int num2){
        if(num2 == 0) return num1;
        return gcd(num2, num1 % num2);
    }
}