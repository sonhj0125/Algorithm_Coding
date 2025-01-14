class Solution {
    public int[] solution(int[] numbers, int num1, int num2) {
        // index 사용
        int[] answer = new int[num2 - num1 + 1];
        int index = 0;
        
        for(int i=num1; i<=num2; i++) {
            answer[index] = numbers[i];
            index++;
        }
        
        return answer;
        
        /*
            Array 사용 시
            return Arrays.copyOfRange(numbers, num1, num2 + 1);
            
            * Array.copyOfRange(복사할 배열, 복사 시작 인덱스, 복사 끝 인덱스(-1) 0부터 시작하기 때문) 
                : 자신이 복사하고자 하는 배열의 범위만 지정해서 복사
            * Array.copyOf 
                : Arrays의 메서드를 활용하여 배열을 복사
        */
    }
}