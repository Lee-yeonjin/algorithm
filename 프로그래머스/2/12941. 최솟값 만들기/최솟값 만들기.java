import java.util.Arrays;

class Solution
{
    public int solution(int []A, int []B)
    {
        Arrays.sort(A);
        Arrays.sort(B);
        
        int answer = 0;
        int len = A.length;
        
        for(int i=0; i<len; i++){
            answer += A[i] * B[len-i-1];
        }

        return answer;
    }
}