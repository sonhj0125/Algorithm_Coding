class Solution {
    public int[] solution(int[] arr, int k) {
        if(k % 2 == 1) {
            for(int i=0; i<arr.length; i++) {
                arr[i] *= k;
            }
        }
        else if(k % 2 == 0) {
            for(int j=0; j<arr.length; j++) {
                arr[j] += k;
            }
        }
        return arr;
    }
}