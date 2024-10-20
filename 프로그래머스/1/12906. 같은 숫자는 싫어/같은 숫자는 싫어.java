import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        
        // 스택 생성
        Stack<Integer> stack = new Stack<>();
        
        // arr 순회
        for(int i : arr) {
            // 스택이 비어있거나 i가 직전에 담긴 값과 다를 경우 스택에 i 넣기
            if(stack.empty() || !stack.peek().equals(i)) {
                stack.push(i);
            }
        }
        
        // stack to array
        // 중복된 값 제거, 배열로 반환
        return stack.stream().mapToInt(i -> i).toArray();
        
        /*
            < 리스트 사용 시 >
            List<Integer> list = new ArrayList<>();
            // arr의 첫 번째 요소 담기
            list.add(arr[0]);
            
            // arr 순회
            for(int i=1; i<arr.length; i++) {
                // arr의 현재 값이 직전 값과 같으면 무시
                if(arr[i-1] == arr[i]) {
                    continue;
                }
                else {
                    list.add(arr[i]);
                }
            }
            
            return list.stream().mapToInt(i -> i).toArray();
        
        */
 
    }
}