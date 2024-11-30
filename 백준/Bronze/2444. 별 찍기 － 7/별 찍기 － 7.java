import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int cnt = 1;

        for(int i=0; i < (num * 2) -1; i++){
            if(i < num) System.out.print(" ".repeat(num-i -1));
            else System.out.print(" ".repeat(i-num + 1));

            System.out.print("*".repeat(cnt));

            if(i < num -1) cnt = cnt + 2;
            else cnt = cnt - 2;

            System.out.println("");
        }
    }
}