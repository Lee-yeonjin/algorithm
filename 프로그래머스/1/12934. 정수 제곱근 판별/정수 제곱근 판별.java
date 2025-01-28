import static java.lang.Math.*;

class Solution {
    public long solution(long n) {
        long sqrtN = (long) sqrt(n);
        
        if (sqrtN * sqrtN == n) {
            return (sqrtN + 1) * (sqrtN + 1);
        }
        return -1;
    }
}