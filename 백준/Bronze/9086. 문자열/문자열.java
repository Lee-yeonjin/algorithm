import java.util.Scanner;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        String str[] = new String[num];

        for(int i=0; i<num; i++){
            str[i] = sc.next();
        }

        for(int i=0; i<num; i++){
            System.out.println(String.valueOf(str[i].charAt(0))+String.valueOf(str[i].charAt(str[i].length()-1)));
        }
    }
}