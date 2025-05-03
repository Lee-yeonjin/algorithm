import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int cnt = 0;
        int num = Integer.parseInt(br.readLine());

        for(int i=0; i<num; i++) {
            String s = br.readLine();
            int[] alpha = new int[26];
            boolean groupword = true;

            char prev = s.charAt(0);
            for(int k=0; k<s.length(); k++){
                if(prev == s.charAt(k)) alpha[s.charAt(k)-'a'] ++;
                else if(prev != s.charAt(k) && alpha[s.charAt(k)-'a']==0) alpha[s.charAt(k)-'a'] ++;
                else {
                    groupword = false;
                    break;
                }
                prev = s.charAt(k);
            }
            if(groupword) cnt++;
        }
        bw.write(String.valueOf(cnt));
        bw.flush();
    }
}