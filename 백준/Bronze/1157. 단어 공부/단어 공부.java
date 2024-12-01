import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine().toUpperCase();
        int max = 0, count;
        char alpha = str.charAt(0);

        while(true){
            int num = str.length();
            char c = str.charAt(0);
            String str2 = str.replaceAll(String.valueOf(c),"");
            int num2 = str2.length();

            count = num - num2;

            if(count >= max) {
                if(count == max) alpha = '?';
                else alpha = c;
                
                max = count;
            }

            if(str2.length() == 0) break;
            else str = str2;
        }
        System.out.println(alpha);
    }
}