class Solution {
    public long[] solution(int x, int n) {
        long[] answer = new long[n];
        long sum = x;
        for(int i=0; i<n; i++){
            answer[i] = (long)sum;
            sum += (long)x;
        }
        return answer;
    }
}