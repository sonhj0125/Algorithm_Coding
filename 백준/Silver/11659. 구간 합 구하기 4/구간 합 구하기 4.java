import java.io.*;
import java.util.*;
// 합 배열 공식 = S[i] = S[i-1] + A[i]
// 구간 합 공식 = S[j] - S[i-1] (구간 i ~ j)
// suNo(숫자 개수), quizNo(질의 개수) 저장
// for 숫자 개수만큼 반복하며, 합 배열 생성
// for 질의 개수만큼 반복하며, 질의 범위 받고, 구간 합 출력

public class Main {
  public static void main(String[] args) throws IOException {
    // 받는 데이터가 많은 경우, BufferedReader 사용 ==> 예외처리할것!
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    // 숫자의 개수가 10만개인 경우, int형으로 받지 않고 StringTokenizer로 분리해서 받아 사용
    // 첫번째 줄 읽기
    StringTokenizer st = new StringTokenizer(br.readLine());
    int suNo = Integer.parseInt(st.nextToken()); // 숫자 개수
    int quizNo = Integer.parseInt(st.nextToken()); // 질의 개수


    // 두번째 줄 읽기
    // 합배열 선언
    long[] S = new long[suNo + 1];    // 선언(long형으로 할 것)
    // 배열은 0번째 인덱스를 무시하고 사용하고자 +1

    // 두번째 줄에 있는걸 한줄로 받아오기
    st = new StringTokenizer(br.readLine());

    for(int i = 1; i <= suNo; i++) {
      S[i] = S[i-1] + Integer.parseInt(st.nextToken());
    } // end of for i


    // 질의 개수만큼 반복하기
    for(int q = 0; q < quizNo; q++){
      st = new StringTokenizer(br.readLine());

      int i = Integer.parseInt(st.nextToken()); // 첫번째 나온 숫자
      int j = Integer.parseInt(st.nextToken()); // 두번째 나온 숫자

      System.out.println(S[j] - S[i-1]); // 구간 합 구하기

    } // end of for q

  }
}