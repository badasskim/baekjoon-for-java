    import java.io.*;
    import java.util.*;

    //1920 수 찾기 하하하!
    public class Main
    {
        static int N;
        static int[] arr;
        public static void main(String[] args) throws IOException
        {
            StringTokenizer st;
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            N = Integer.parseInt(br.readLine());
            arr = new int[N];
            st = new StringTokenizer(br.readLine());

            for(int i = 0; i < N; i++)
            {
                arr[i] = Integer.parseInt(st.nextToken());
            }

            Arrays.sort(arr);
            int M = Integer.parseInt(br.readLine());
            st = new StringTokenizer(br.readLine());

            for(int i = 0; i < M; i++)
            {
                int temp = Integer.parseInt(st.nextToken());
                System.out.println(binarySearch(temp, 0, arr.length - 1));
            }
        }

        public static int binarySearch(int target, int low, int high)
        {
            if(low > high) return 0;
            int mid = (low + high) / 2;
            if(arr[mid] == target) return 1;
            else if(arr[mid] > target) return binarySearch(target, low, mid-1);
            else return binarySearch(target, mid+1, high);
        }
    }

