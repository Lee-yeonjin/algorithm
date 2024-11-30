import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        StringBuilder rstr = new StringBuilder(str);

        if(str.equals(rstr.reverse().toString())) System.out.println("1");
        else System.out.println("0");

        sc.close();
    }
}
