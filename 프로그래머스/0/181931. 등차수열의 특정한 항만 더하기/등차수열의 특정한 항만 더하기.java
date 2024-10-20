class Solution {
    public int solution(int a, int d, boolean[] included) {
        int answer = 0;
        
        // 첫째항이 a, 공차가 d인 등차수열
        // included[i]가 i+1항
        // 3, 4 -> |3|7|11|15|19| -> included 길이가 5
        
        for(int i=0; i<included.length; i++){
            
            if(included[i]){
                answer += a + (d*i);
            }
            
        } // end of for
        
        
        return answer;
    }
}