import java.util.*;
// 각도로 풀 수도 있음(분침보다 시침의 각도가 커지면 겹침 발생)

class Solution {
    public int solution(int h1, int m1, int s1, int h2, int m2, int s2) {
        
        int answer = -1;
        
        // 시간, 분, 초를 초로 변환
        int start = toSecond(h1, m1, s1);
        int end = toSecond(h2, m2, s2);
        
        // 끝나는 시간까지는 몇번 울리는지 - 시작 시간까지는 몇번 울리는지 + 현재 시간에 울리는지
        answer = cal(end) - cal(start) + (alramNow(start) ? 1 : 0);
        // 현재 시간도 빼버렸으므로 현재 시간에 울리는지 확인하고 더해준다.
        
        return answer;
        
    } // end of public int solution(int h1, int m1, int s1, int h2, int m2, int s2)
    
    
    
    static int cal(int time){
        
        int sm = time * 59 / 3600;
        // 분침이 한 바퀴 도는데 초침이랑 59번 겹침
        // 그럼 1번 울리는데 3600/59 초마다 울림
        // time에 59를 곱하고 3600으로 나눠주면 몇번 울리는지 알 수 있다.
        // 즉, time == 100 이라면 1초에 59/3600 번 울리는데, 59*100을 3600으로 나눠주면 5900/3600 = 1.xxxx 이다.
        // 1번 울린다는 것!
        
        int sh = time * 719 / 43200;
        // 시침이 한 바퀴 도는데 43200초
        // 60초에 1번 겹치고 60초가 60(분) * 12(시간) 번 겹침
        // 시침이 한바퀴 도는데 720 - 1 = 719번 겹침
        
        int a = 43200 <= time ? 2 : 1;
        // 12:00:00 가 몇번 나오는지 계산해서 빼준다.
        // 시침 분침 둘다 더했으니 빼야함.
        // 43200 즉, 시간이 12시 이상이면 2 나옴
        // 아니면 1
        
        return sm + sh - a;
        
    } // end of static int cal(int time)
    
    
    
    static int toSecond(int h, int m, int s) {
        
        int k = h * 3600 + m * 60 + s;
        return k;
        
    } // end of static int toSecond
    
    
    
    static boolean alramNow(int time){
        
        return time * 59 % 3600 == 0 || time * 719 % 43200 == 0; 
        // 현재시간에 알람이 울리는지 체크

    } // end of static boolean alramNow
    
}