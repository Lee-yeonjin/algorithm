import java.util.Scanner;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int c = sc.nextInt();

        System.out.println(str.charAt(c-1));
    }
}