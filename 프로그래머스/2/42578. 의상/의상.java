import java.util.*;

class Solution {
    public int solution(String[][] clothes) {
        int answer = 1;
        
        // 1. HashMap
        Map<String, Integer> map = new HashMap<>();
        
        // 2. put 저장. 옷 종류별로 구분
        for(String[] cloth : clothes){
            
            if(!map.containsKey(cloth[1])){
                map.put(cloth[1], 1);
            }
            else {
                map.put(cloth[1], map.get(cloth[1]) + 1);
            }
            
        } // end of for
        
        // 입지 않은 경우 추가
        for(Integer value : map.values()) {
            answer *= value + 1;
        }
        
        // 아무 종류의 옷도 입지 않은 경우 제외
        return answer - 1;
    }
}