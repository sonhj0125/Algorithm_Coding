import java.io.*;
import java.util.*;
// 오름차순 정렬
// 버블 정렬 알고리즘(인접한 값 비교해서 swap or no swap)
// 1<=N<=1,000 이므로 N^2이여도 10,000,000이다. --> 버블정렬
public class Main {
  public static void main(String[] args){
    // sort()함수로 정렬가능하지만, 직접 구현할 것
    /*
      N(정렬할 수 개수)
      A(정렬할 배열 선언)
      for(i : 0 ~ N-1) // loop 개수
      {
        for(j : 0 ~ N-1-i) // 정렬하는 범위(아직 정렬되지 않은 배열의 영역)
        {
          현재 A 배열의 값보다 1칸 오른쪽 배열의 값이 더 작으면 두 수 바꾸기
         }
       }
      A 배열 출력
    */

    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int[] A = new int[N];

    for(int i=0; i<N; i++){
      A[i] = sc.nextInt();
    } // end of for(int i=0; i<N; i++)

    // 버블 정렬을 구현하는 영역
    for(int i=0; i<N-1; i++){
      for(int j=0; j<N-1-i; j++){
        if(A[j]>A[j+1]){ // 인접한 두 수 비교
          int temp = A[j];  // swap 시작
          A[j] = A[j+1];
          A[j+1] = temp;
        }
      }
    }

    // 정렬된 A배열 출력
    for(int i=0; i<N; i++){
      System.out.println(A[i]+" ");
    }

  }
}
