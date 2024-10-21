import java.util.*;
// 변환 점수의 평균 구하기
// (A / M * 100 + B / M * 100 + C / M * 100) / 3 
// => (A + B + C) * M * 100 / 3
// => (A + B + C) * 100 / M / 3
// => sum * 100 / max / 3

// 변수 N에 과목의 수 입력받기
// 길이가 N인 1차 배열 A[] 선언
// 반복문 A[]길이만큼 반복하며, A[i]에 변수 저장
// 최고점은 변수 max에, 총점은 sum에 저장
public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        /*
        int A[] = new int[N];
        for(int i=0; i<N; i++) {
            A[i] = sc.nextInt(); // 데이터 저장
        }
        */
        
        long sum = 0;
        long max = 0;
   
        for(int i=0; i<N; i++) {
            int temp = sc.nextInt(); // 데이터 저장
            
            if(temp > max) {
                max = temp;
            }
            sum = sum + temp;
        }
        
        System.out.println(sum*100.0/max/N);
        
    }
}