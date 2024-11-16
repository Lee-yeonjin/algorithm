import java.util.Scanner;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        String str = sc.next();
        int sum = 0;

        for(int i=0; i<num; i++){
            sum += Integer.valueOf(Character.getNumericValue(str.charAt(i)));
        }

        System.out.println(sum);
    }
}