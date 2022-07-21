    import java.io.*;
    import java.util.LinkedList;
    import java.util.Queue;
    import java.util.StringTokenizer;

    //1260 dfs bfs

    public class Main
    {
        static int N; // 전역 메소드에 사용하기에 정적 선언
        static int[][] Dfs_arr = new int[1001][1001];
        static int[][] Bfs_arr = new int[1001][1001];
        static boolean[] Dfs_visit = new boolean[10001]; //순환함수(스택)으로 돌릴 거라 정적으로 선언

        public static void main(String[] args) throws IOException
        {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            StringTokenizer st = new StringTokenizer(br.readLine());
            N = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());

            while(M-- > 0)
            {
                st = new StringTokenizer(br.readLine());
                int first = Integer.parseInt(st.nextToken());
                int second = Integer.parseInt(st.nextToken());
                Dfs_arr[first][second] = Dfs_arr[second][first] = 1;
                Bfs_arr[first][second] = Bfs_arr[second][first] = 1;
            }
            DFS(v);
            System.out.println();
            BFS(v);

        }
        public static void DFS(int start_Node)
        {
            Dfs_visit[start_Node] = true;
            System.out.print(start_Node + " ");
            for(int i = 1; i <=N; i++)
            {
                if(!Dfs_visit[i] && Dfs_arr[start_Node][i] == 1)
                {
                    DFS(i);
                }
            }
        }

        public static void BFS(int start_Node)
        {
            boolean[] Bfs_visit = new boolean[10001];
            Queue<Integer> queue = new LinkedList<Integer>();
            Bfs_visit[start_Node] = true;
            queue.offer(start_Node);
            while(!queue.isEmpty())
            {
                int temp = queue.poll();
                System.out.print(temp + " ");

                for(int i = 1; i <= N; i++)
                {
                    if(!Bfs_visit[i] && Bfs_arr[temp][i] == 1)
                    {
                        Bfs_visit[i] = true;
                        queue.offer(i);
                    }
                }
            }
        }
    }

