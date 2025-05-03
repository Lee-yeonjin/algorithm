import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int cnt = 0;
        int num = Integer.parseInt(br.readLine());

        for(int i=0; i<num; i++) {
            String s = br.readLine();
            int[] alpha = new int[26];
            boolean groupword = true;

            char prev = s.charAt(0);
            for(int k=0; k<s.length(); k++){
                char now = s.charAt(k);
                if(prev == now) alpha[s.charAt(k)-'a'] ++;
                else if(prev != now && alpha[s.charAt(k)-'a']==0) alpha[s.charAt(k)-'a'] ++;
                else {
                    groupword = false;
                    break;
                }
                prev = now;
            }
            if(groupword) cnt++;
        }
        System.out.println(cnt);
    }
}