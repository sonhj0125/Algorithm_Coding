class Solution {
    public int solution(int n, int k) {
        int answer = 0;
        int f = n / 10;
        
        if(f >= 1) {
            answer = (n*12000) + (k*2000) - (f*2000);
        }
        else {
            answer = (n*12000) + (k*2000);
        }
        
        return answer;
    }
}