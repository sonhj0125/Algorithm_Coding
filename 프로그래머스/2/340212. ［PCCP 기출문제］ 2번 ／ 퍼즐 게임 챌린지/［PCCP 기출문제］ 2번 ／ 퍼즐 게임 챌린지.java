import java.util.*;
// 이분탐색(매개변수 탐색)
// 문제 번호 i : (diffs[i] - level(지정한 숙련도)) * (times[i-1] + times[i] + times[i])

class Solution {
    
    static int[] diffss;
    static int[] timess;
    static long limits;
    static int size;
    
    public long solution(int[] diffs, int[] times, long limit) {
        
        // static 변수 초기화
        diffss = diffs; // 난이도
        timess = times; // 소요 시간
        limits = limit; // 제한 시간
        size = diffs.length;
        
        long end = Long.MAX_VALUE;
        long start = 0;
        
        // 이분 탐색 시작
        while(start < end) {
            
            long mid = (start + end) / 2;
            long result = calculate(mid);
            
            if(result > limit) {
                start = mid + 1;
            }
            else {
                end = mid;
            }
            
        } // end of while
        
        return start;
        
    } // end of public int solution
    
    
    
    public long calculate(long level){
        
        if(level <= 0) { // level은 항상 0보다 큼
            return Long.MAX_VALUE;
        }
        
        long use = 0; // 해당 숙련도로 소요하는 시간
        
        for(int i=0; i<size; i++) {
            if(diffss[i] <= level){
                use += timess[i];
            }    
            else {
                long count = diffss[i] - level;
                if(i == 0) {
                    use += timess[i] * count + timess[i];
                }
                else {
                    use += (timess[i] + timess[i-1]) * count + timess[i];
                    
                } // end of if(i == 0)
                
            } // end of if(diffss)
            
            if(use > limits){
                // 이미 제한 시간을 넘겼다면 더 계산하지 않음
                return use;
            }
            
        } // end of for i
        
        return use;
        
    } // end of public long calculate
    
}