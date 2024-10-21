import java.io.*;
import java.util.*;
// 투 포인터
// 연속된 자연수의 합을 구하기 => 시작 인덱스와 종료 인덱스를 지정하기(투 포인터)

// 입력받은 값을 N에 저장.
// sum 은 start_index와 end_index를 갖는 연속된 합의 크기
// count 는 1. 자신의 값이 연속된 합의 값과 동일한 경우

// 투 포인터 이동 원칙
// sum > N : sum = sum - start_index; start_index++;
// sum < N : end_index++; sum = sum + end_index;
// sum == N : end_index++; sum = sum + end_index; count++; (연속된 수로 표현되는 값을 찾음!)

public class Main {
  public static void main(String[] args) {
    /*
      N 변수 저장
      사용 변수 초기화(count = 1, start_index = 1, end_index = 1; sum = 1)
      while(end_index != N) {
        if(sum == N) count 증가, end_index 증가, sum 값 변경
        else if(sum > N) sum 값 변경, start_index 증가
        else if(sum < N) end_index 증가, sum 값 변경
      }
      count 출력
     */

    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();

    int count = 1;
    int start_index = 1;
    int end_index = 1;
    int sum = 1;

    while(end_index != N) {
      if(sum == N) {
        count++;
        end_index++;
        sum = sum + end_index;
      }
      else if(sum > N) {
        sum = sum - start_index;
        start_index++;
      }
      else if(sum < N) {
        end_index++;
        sum = sum + end_index;
      }

    } // end of while

    System.out.println(count);

  }
}