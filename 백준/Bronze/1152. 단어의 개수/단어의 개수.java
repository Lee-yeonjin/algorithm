import java.util.Scanner;

class Main{
    public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
       String str = sc.nextLine().trim();
       String data[] = str.split(" ");

        if(str.isEmpty()) {
            System.out.println(0);
        } else {
            System.out.println(data.length);
        }
    }
}