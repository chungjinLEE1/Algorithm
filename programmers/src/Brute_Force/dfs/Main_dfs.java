package Brute_Force.dfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main_dfs {
    static int[][] map;
    static boolean[] visited;
    static StringTokenizer st;
    static int N, M, start, end;

    public static void main(String[] args)  throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        M = Integer.parseInt(br.readLine());

        map = new int[N+1][N+1];
        visited = new boolean[N + 1];

        for(int m =0; m<M; m++){// 그래프 정보 입력하기
            st = new StringTokenizer(br.readLine(), " ");
            start = Integer.parseInt(st.nextToken());
            end = Integer.parseInt(st.nextToken());
            map[start][end] = 1;
            map[end][start] = 1;
        }
        System.out.println("그래프 DFS 방문 순서 : ");
        dfs(1);

    }

    static void dfs(int point){
        Stack<Integer> stack = new Stack<>(); // DFS 이전 정점을 저장하기 위한 스택
        stack.push(point);

        System.out.println(point + " ");

        while(!stack.isEmpty()){
            for(int i=1; i<N; i++){
                if(map[point][i] == 1 && visited[i] == false){ // 다음 정점과 연결되어 있고 아직 방문하지 않았다면
                    stack.push(i);
                    visited[i] = true;
                    dfs(i);;

                }
            }
            stack.pop();
        }


    }

}
