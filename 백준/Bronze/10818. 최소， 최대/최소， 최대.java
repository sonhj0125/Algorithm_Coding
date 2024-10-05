import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
  public static void main(String[] args) throws IOException {
/*    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    int[] arr = new int[n];

    for(int i = 0; i < n; i++){
      arr[i] = sc.nextInt();
    }

    sc.close();
    Arrays.sort(arr);   // 배열을 오름차순으로 정렬해주는 메소드
    // 최솟값은 배열의 첫번째 원소(index 0)
    // 최댓값은 배열의 마지막 원소(arr.length - 1)
    System.out.print(arr[0] + " " + arr[n - 1]);
  }*/

    // 배열 사용하지 않는 방법
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    Integer.parseInt(br.readLine());
    StringTokenizer st = new StringTokenizer(br.readLine(), " ");
    
    int max = -1000001;
    int min = 1000001;
    
    while(st.hasMoreTokens()) {
      int val = Integer.parseInt(st.nextToken());
      if(val > max){
        max = val;
      }
      if(val < min) {
        min = val;
      }
    }
    
    System.out.println(min + " " + max);
    
  }
}