import java.util.Scanner;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int[] alphabet = new int[26];

        for(int i=0; i<alphabet.length; i++) {alphabet[i] = -1; }

        for(int i=0; i<str.length(); i++) {
            alphabet[str.charAt(i) - 'a'] = str.indexOf(str.charAt(i));
        }

        for(int i=0; i<alphabet.length; i++) {
            System.out.print(alphabet[i] + " ");
        }
    }
}