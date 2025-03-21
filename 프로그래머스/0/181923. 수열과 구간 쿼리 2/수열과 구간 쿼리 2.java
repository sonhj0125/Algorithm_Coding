import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        
        int[] answer = new int[queries.length];
        Arrays.fill(answer, -1);
        
        for(int i=0; i<queries.length; i++) {
            int[] query = queries[i];
            int s = query[0], e = query[1], k = query[2];
            
            for(int j=s; j<=e; j++) {
                if(k < arr[j]) {
                    answer[i] = answer[i] == -1 ? arr[j] : Math.min(answer[i], arr[j]);
                }
            }
            
        }
        
        return answer;
    }
}