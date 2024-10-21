import java.io.*;
import java.util.*;
// 투 포인터
// 연속된 자연수의 합을 구하기 => 시작 인덱스와 종료 인덱스를 지정하기(투 포인터)
// 투 포인터 이동 원칙
// A[i] + A[j] > M; j--; 번호의 합이 M보다 크므로 큰 번호 index 내린다.
// A[i] + A[j] < M; i++; 번호의 합이 M보다 작으므로 작은 번호 index 올림.
// A[i] + A[j] == M; i++; j++; count++; 양쪽 포인터를 모두 이동시키고 count 올림.

// 1번째 줄에 재료의 개수
// 2번째 줄에 갑옷을 만드는 데 필요한 수
// 3번째 줄에 N개의 재료들

public class Main {
  public static void main(String[] args) throws IOException {
    // N개의 재료들을 정렬할 것
    // 양쪽 끝 위치를 투 포인터로 지정할 것

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int N = Integer.parseInt(br.readLine());
    int M = Integer.parseInt(br.readLine());
    int[] A = new int[N]; // 배열 받기

    // 한 줄 받기
    StringTokenizer st = new StringTokenizer(br.readLine());

    for(int i=0; i<N; i++) {
      // 배열에 데이터가 저장됨
      A[i] = Integer.parseInt(st.nextToken());
    } // end of for i

    Arrays.sort(A); // 오름차순 정렬

    // 변수의 초기화
    int count = 0;
    int i = 0;  // A[0] -> Min
    int j = N-1;  // 양쪽 끝에 포인터. A[N-1]

    while(i<j) {
      if(A[i] + A[j] < M) {
        i++;
      }
      else if(A[i] + A[j] > M) {
        j--;
      }
      else {
        count++;
        i++;
        j--;
      }

    } // end of while

    System.out.println(count);

  }
}