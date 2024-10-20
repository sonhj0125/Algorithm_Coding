// 주사위 굴릴 때 나온 숫자 a, b, c

// a, b, c 가 모두 다르면 a+b+c점
// 세 숫자 중 어느 두 숫자는 같고 나머지는 다르면, (a+b+c)*(a*a + b*b + c*c)점
// 세 숫자가 모두 같다면 (a+b+c)*(a*a + b*b + c*c)*(a*a*a + b*b*b + c*c*c)점

class Solution {
    public int solution(int a, int b, int c) {
        int answer = 0;
        
        if(a != b && a != c && b != c) {
            answer = a + b + c;
        }
        else if(a == b && a == c) {
            answer = (a + b + c) * (a*a + b*b + c*c) * (a*a*a + b*b*b + c*c*c);
        }
        else {
            answer = (a + b + c) * (a*a + b*b + c*c);
        }
        
        return answer;
    }
}