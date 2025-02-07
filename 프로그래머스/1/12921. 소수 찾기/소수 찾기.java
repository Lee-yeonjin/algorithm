class Solution {
    public int solution(int n) {
        int cnt = 0;
        
        for(int i=2; i<=n; i++){
            boolean decimal = true;
            for(int k=2; k*k <=i; k++){
                if(i % k == 0) decimal = false;
                if(decimal == false) break;
            }
            if(decimal) cnt ++;
        }
        return cnt;
    }
}