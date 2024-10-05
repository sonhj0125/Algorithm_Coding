import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) throws IOException {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();

    int a = Integer.parseInt(br.readLine());
    int b = Integer.parseInt(br.readLine());
    int c = Integer.parseInt(br.readLine());
    int calc_int = a + b - c;

    String d = "";
    d += a;
    d += b;
    int ab = Integer.parseInt(d);
    int calc_string = ab - c;

    sb.append(calc_int).append("\n");
    sb.append(calc_string);

    System.out.println(sb);

  }
  
}