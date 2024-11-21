import java.util.Scanner;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int cnt[] = new int[num];
        String str[] = new String[num];

        for(int i=0; i<num; i++){
            cnt[i] = sc.nextInt();
            str[i] = sc.next();
        }

        for (int i=0; i<num; i++){
            String answer = "";
            for(int j=0; j<str[i].length(); j++){
                answer += String.valueOf(str[i].charAt(j)).repeat(cnt[i]);
            }
            System.out.println(answer);
        }
    }
}