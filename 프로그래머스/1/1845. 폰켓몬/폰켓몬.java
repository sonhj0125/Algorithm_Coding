import java.util.*;

class Solution {
    public int solution(int[] nums) {
        
        // 최대값 => nums.length / 2 를 max에 대입
        int max = nums.length / 2;
      
        // 중복을 제거한 값 Set 이용해서 nums를 담기
        HashSet<Integer> numsSet = new HashSet<>();
        
        for(int num : nums){
            numsSet.add(num);
        } // end of for
        
        // 중복 제거한 Set의 크기가 max보다 크면 max를
        // 작으면 numsSet의 사이즈를
        if(numsSet.size() > max){
            return max;
        }
        else {
            return numsSet.size();
        }
        
    }

}