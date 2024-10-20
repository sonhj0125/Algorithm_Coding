import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;
/*
   * 삼각형의 세 변의 길이
   * Equilateral : 세 변의 길이가 모두 같은 경우
   * Isosceles : 두 변의 길이만 같은 경우
   * Scalene : 세 변의 길이가 모두 다른 경우
   * 삼각형의 조건을 만족하지 못하는 경우 "Invalid" 출력
   *
   * 7 7 7 "Equilateral"
   * 6 3 2 "Invalid"
   * 삼각형의 조건 : 가장 긴 변의 길이 < 나머지 두 변의 길이의 합
*/
public class Main {
  public static void main(String[] args) throws IOException {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int[] arr = new int[3]; // 세 변의 값 저장할 int형 배열 선언

    // 무한루프
    while(true) {
      StringTokenizer st = new StringTokenizer(br.readLine());
      arr[0] = Integer.parseInt(st.nextToken());
      arr[1] = Integer.parseInt(st.nextToken());
      arr[2] = Integer.parseInt(st.nextToken());

      // 0 0 0 입력 시 종료
      if(arr[0] == 0 && arr[1] == 0 && arr[2] == 0) {
        break;
      }

      // 정렬
      Arrays.sort(arr);

      if(arr[2] >= arr[0] + arr[1]) {
        System.out.println("Invalid");
      }
      else if(arr[0] == arr[1] && arr[1] == arr[2]) {
        System.out.println("Equilateral");
      }
      else if(arr[0] == arr[1] || arr[1] == arr[2] || arr[0] == arr[2]) {
        System.out.println("Isosceles");
      }
      else {
        System.out.println("Scalene");
      }

    }

  }
}