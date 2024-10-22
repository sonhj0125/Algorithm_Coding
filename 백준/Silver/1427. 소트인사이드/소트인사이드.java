import java.io.*;
import java.util.*;
// 내림차순 정렬
// N은 1,000,000,000 보다 작거나 같은 자연수. ==> N의 자릿수가 10자리(작은 수임)
// 선택 정렬 이용해보기
// String 변수로 정렬할 데이터를 받아 int 형 배열에 저장.
// substring()함수 사용해 각 자릿수별로 나눈 후 배열에 저장
public class Main {
  public static void main(String[] args){
    /*
      str(정렬할 수)
      A(자릿수별로 구분해 저장한 배열)
      for(str 의 길이만큼 반복하기) {
        A 배열 저장 -> str.substring 사용
      }
      for(i: B ~ str 의 길이만큼 반복하기) {
        for(j: i+1 ~ str 의 길이만큼 반복하기) {
          현재 범위에서 Max 값 찾기
        }
        현재 i의 값과 Max 값 중 Max 값이 더 크면 swap 수행하기
      }
      A 배열 출력하기
    */

    Scanner sc = new Scanner(System.in);
    String str = sc.next();
    int[] A = new int[str.length()];

    // A 배열에 데이터 넣기
    for(int i=0; i<str.length(); i++){
      A[i] = Integer.parseInt(str.substring(i, i+1));
    }

    // 선택정렬
    for(int i=0; i<str.length(); i++){
      int Max = i; // 맨 앞에 있는 인덱스가 최댓값 세팅
      for(int j=i+1; j<str.length(); j++){
        if(A[j] > A[Max]) {
          Max = j;  // 맥스값 찾기
        }
      }
      // 현재 i의 값과 Max 값 중 Max 값이 더 크면 swap 수행하기
      if(A[i] < A[Max]) { // 최댓값이 나왔으면
        int temp = A[i];  // swap
        A[i] = A[Max];
        A[Max] = temp;
      }
    } // end of for

    // 정렬한 A 배열 출력하기
    for(int i=0; i<str.length(); i++){
      System.out.print(A[i]);
    }

  }
}
