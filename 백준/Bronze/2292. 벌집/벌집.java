import java.util.Scanner;

/*
   * 육각형 벌집 중앙 1번에서 N번 방까지 최소 개수의 방을 지나기
   * 시작과 끝을 포함하여 몇 개의 방을 지나는지 계산
   *
   * 중앙의 방이 1. 이웃하는 방에 돌아가며 1씩 증가하는 주소.
   *
   * 숫자 N 13 -> 3개의 방
   * N = 1 -> 벌집개수 1 -> 방 1개 지남(최소 루트)
   * N = 2 ~ 7 -> 벌집개수 6 -> 방 2개 지남
   * N = 8 ~ 19 -> 벌집개수 12 -> 방 3개 지남
   * N = 20 ~ 37 -> 벌집개수 18 -> 방 4개 지남
   * N = 38 ~ 61 -> 벌집개수 24 -> 방 5개 지남
*/
public class Main {
  public static void main(String[] args){

    Scanner sc = new Scanner(System.in);

    int N = sc.nextInt();
    int root = 1; // 최소 루트
    int range = 2; // 벌집개수, 범위(최솟값 기준)

    if(N == 1) { // 만약 N이 1이라면 최소 루트는 1
      System.out.print(1);
    }
    else {  // 1이 아니라면
      while(range <= N) { // 범위가 N보다 커지기 직전까지 반복
        range = range + (6 * root); // 다음 범위의 최솟값으로 초기화
        // root가 2일 때, range = 6 + (6 * 2) = 18
        root++; // root를 3으로
      }
      System.out.print(root);
    }

  }
}
