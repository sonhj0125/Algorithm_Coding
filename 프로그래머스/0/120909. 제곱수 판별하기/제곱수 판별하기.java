class Solution {
    public int solution(int n) {
        int answer = 0;
        // Math.sqrt ==> 제곱근(루트) 구하기
        double a = Math.sqrt(n);
        
        if(a%1 == 0){
            answer = 1;
        } else{
            answer = 2;
        }
        
        return answer;
    }
}