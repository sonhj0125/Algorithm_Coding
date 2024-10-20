import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/*
   * 거리두기 수칙
   * 테이블 = w개
   * 행 = h행
   * 세로 n칸 또는 가로 m칸 이상 비우고 앉기
   * 최대 수용 가능한 인원?
   *
   * h, w, n, m
   * 행에 앉을 수 있는 인원 = 행의 길이 / 행 간격 + 1
   * 열에 앉을 수 있는 인원 = 열의 길이 / 열 간격 + 1
   * 한 자리를 앉고 N or M 만큼 자리를 띄우므로 = n+1 or m+1
   * h/(n+1) or w/(m+1). 값이 1.xx 이면 값 올림 Math.ceil()
*/
public class Main {
  public static void main(String[] args) throws IOException {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    String[] in = br.readLine().split(" ");
    br.close();

    double h = Integer.parseInt(in[0]);
    double w = Integer.parseInt(in[1]);
    double n = Integer.parseInt(in[2]);
    double m = Integer.parseInt(in[3]);

    int x = (int)Math.ceil(h / (n + 1));
    int y = (int)Math.ceil(w / (m + 1));

    System.out.print(x*y);

  }
}