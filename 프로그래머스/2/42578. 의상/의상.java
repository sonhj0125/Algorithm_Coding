import java.util.*;

// clothes = [의상 이름, 의상 종류]
class Solution {
    public int solution(String[][] clothes) {

        Map<String, Integer> map = new HashMap<>();
        
        int answer = 1;
        
        // 의상 종류별로 몇개씩 있는지 Map에 저장
        for(int i=0; i<clothes.length; i++){
            map.put(clothes[i][1], map.getOrDefault(clothes[i][1], 0) + 1);
        }
        
        // 조합, 안입는 경우 고려하기 위해 +1
        for(String key : map.keySet()){
            answer *= (map.get(key) + 1);
        }
        
        answer -= 1;    // 모두 안입을 경우 -1 하기
        
        return answer;
        
        
    }
}