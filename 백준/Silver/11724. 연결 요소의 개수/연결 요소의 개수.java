import java.io.*;
import java.util.*;
// DFS
// 방향 없는 그래프가 주어졌을 때, 연결 요소의 개수를 구하기
// 인접리스트 그리기, 방문 배열 그리기(방문시 F->T)

public class Main {

  static boolean[] visited;
  static ArrayList<Integer>[] A;

  public static void main(String[] args) throws IOException {
    /*
      n(노드 개수), m(엣지 개수)
      A(그래프 데이터 저장 인접 리스트)
      visited(방문 기록 저장 배열)
      for(n의 개수만큼 반복하기) {
        A 인접 리스트의 각 ArrayList 초기화하기
      }

      for(n의 개수만큼 반복하기) {
        if(방문하지 않은 노드가 있으면) {
          연결요소개수++;
          DFS 실행하기
        }
      }

      // DFS 구현
      DFS {
        if(현재 노드 == 방문 노드) return;
        visited 배열에 현재 노드 방문 기록하기
        현재 노드의 연결 노드 중 방문하지 않은 노드로 DFS 실행하기(재귀 함수 형태)
      }
    */
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());

    int n = Integer.parseInt(st.nextToken()); // 노드 개수
    int m = Integer.parseInt(st.nextToken()); // 에지 개수
    visited = new boolean[n+1];
    A = new ArrayList[n+1];
    for(int i=1; i<n+1; i++){
      A[i] = new ArrayList<Integer>();
    }

    for(int i=0; i<m; i++){
      st = new StringTokenizer(br.readLine());
      int s = Integer.parseInt(st.nextToken()); // 시작점
      int e = Integer.parseInt(st.nextToken()); // 종료점
      A[s].add(e);  // 시작점에서 종료점으로 갈 수 있고,
      A[e].add(s);  // 종료점에서 시작점으로 갈 수 있음
    }

    int count = 0; // 정답 초기화
    for(int i=1; i<n+1; i++){ // n의 개수만큼 반복
      if(!visited[i]){  // 방문하지 않은 노드가 있으면
        count++;
        DFS(i);
      }
    }

    System.out.println(count);

  }

  private static void DFS(int v) {
    if(visited[v]) {
      return;
    }
    visited[v] = true;
    for(int i : A[v]){ // i와 연결되어있는 노드를 찾음
      if(!visited[i]){
        DFS(i); // 함수안에서 자기자신을 다시 부름 == 재귀함수
      }
    }
  }


}
