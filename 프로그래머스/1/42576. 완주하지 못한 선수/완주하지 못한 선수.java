import java.util.*;
// participant N명, completion N-1명
// participant = 선수 이름 담긴 배열
// completion = 완주한 선수 이름 담긴 배열
// 완주하지 못한 선수 이름?

class Solution {
    public String solution(String[] participant, String[] completion) {

        /*
            < 배열 이용 >
            1. 정렬
            Arrays.sort(participant);
            Arrays.sort(completion);
        
            2. 하나씩 비교해서 동일하지 않으면 출력
            for(int i=0; i<completion.length; i++){
                if(participant[i].equals(completion[i])){
                    continue;
                }
                else {
                    return participant[i];
                }
            }
            
            return participant[participant.length - 1];
        
        */
        
        String answer = "";
        Map<String, Integer> map = new HashMap<>();
        
        for(String player : participant){
            map.put(player, map.getOrDefault(player, 0) + 1);
            // 참여자를 Map에 넣고 1씩 증가
            // 동명이인이 있으면 숫자가 2,3... 추가
        } // end of for(String player : participant)
        
        for(String clear : completion){
            map.put(clear, map.get(clear) - 1);
            // 완주자 목록 읽으면서 저장된 맵의 value를 1씩 감소시킴
        } // end of for(String clear : completion)
        
        for(String key : map.keySet()) {
            if(map.get(key) != 0){
                answer = key;
                break;
            }
        } // end of for(String key : map.keySet())
        
        return answer;
        
    }
}