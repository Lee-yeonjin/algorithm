import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        if(num == 1) {
            System.out.println(1);
            return;
        }

        int start = 2, end = 7, i = 1;
        while(true) {
            if(start<= num && num <= end){
                System.out.println(i+1);
                break;
            }
            i++;
            start = end + 1;
            end  = end + 6*i;
        }
    }
}