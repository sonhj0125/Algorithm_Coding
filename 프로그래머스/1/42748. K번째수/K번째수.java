import java.util.*;

// array의 i번째 부터 j번째 까지 자르고 정렬
// 이후, k번째에 있는 수를 구하기
// array = {1,5,2,6,3,7,4} / commands = {{2,5,3},{4,4,1},{1,7,3}}
class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length]; // 3
        int n = 0;
        
        for(int i=0; i<commands.length; i++){
            
            int k = 0;
            
            int[] list = new int[commands[i][1] - commands[i][0] + 1];
            // commands의 j 구간 값
            // new int[4] : j = 2 ~ 5 => 5 - 2 + 1 = 4
            // new int[1] : j = 4 ~ 4 => 4 - 4 + 1 = 1
            // new int[7] : j = 1 ~ 7 => 7 - 1 + 1 = 7
            
            for(int j=commands[i][0]; j<=commands[i][1]; j++){
                
                list[k++] = array[j - 1];
                // {5,2,6,3} / {6} / {1,5,2,6,3,7,4}
                
            } // end of for(int j)
            
            Arrays.sort(list); // 오름차순 정렬 {2,3,5,6} / {6} / {1,2,3,4,5,6,7}
            answer[n++] = list[commands[i][2] - 1]; // {5,6,3}
            
        } // end of for(int i)
        
        
        return answer;
    }
}