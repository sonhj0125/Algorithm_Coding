class Solution {
    public int solution(int a, int b) {
        int totalScore = 0;
        
        if(a % 2 == 1 && b % 2 == 1) {
            totalScore += (a*a) + (b*b);
        }
        else if(a % 2 == 1 || b % 2 == 1) {
            totalScore += 2 * (a + b);
        }
        else {
            if(a > b) {
                totalScore += a - b;
            }
            else if(a == b) {
                totalScore += 0;
            }
            else {
                totalScore += b - a;
            }
        }
        
        return totalScore;
    }
}