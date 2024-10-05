import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt(); // 숫자의 개수
    String a = sc.next(); // 숫자를 문자열로 받기
    sc.close();

    int sum = 0;

    for(int i = 0; i < n; i++){
      // 입력받은 문자열의 첫번째 원소(charAT(0))부터 마지막 N 까지 누적합
      sum += a.charAt(i) - '0'; // 아스키코드 변환 '-48' 또는 '0'
    }

    System.out.println(sum);

  }

}