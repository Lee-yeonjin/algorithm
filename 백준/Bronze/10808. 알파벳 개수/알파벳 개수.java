import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int[] alphabet = new int[26];

        int num;
        for(int i=0; i<s.length(); i++){
            num = 97;
            num = (int)s.charAt(i)-num;
            alphabet[num]++;
        }

        for(int i=0; i<alphabet.length; i++){
            System.out.print(alphabet[i]+ " ");
        }
    }
}