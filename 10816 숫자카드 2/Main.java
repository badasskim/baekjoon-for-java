import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

//10816 숫자카드2
public class Main
{
    static int[] arr;
    static int M;
    static int count;
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int N = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        arr = new int[N];
        for(int i = 0; i < N; i++)
        {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);
        N = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        while(N-- > 0)
        {
            int num = Integer.parseInt(st.nextToken());
            sb.append(upper(num) - lower(num)).append(" ");
        }
        System.out.println(sb);
    }

    //------------------시간 초과 메소드-----------------//
//    public static int BS(int temp, int low, int high)
//    {
//        if(low > high) return 0;
//        int middle = (low + high)/2;
//        if(arr[middle] == temp)
//        {
//            count++;
//            for( int i = middle + 1; i <= high; i++)
//            {
//                if(arr[i] == temp)
//                {
//                    count++;
//                }
//                else break;
//            }
//
//            for(int i = middle -1; i >=low; i--)
//            {
//                if(arr[i] == temp)
//                {
//                    count++;
//                }
//                else break;
//            }
//            return count;
//        }
//        else if(arr[middle]> temp)
//        {
//            return BS(temp, low, middle-1);
//        }
//        else return BS(temp, middle+1, high);
//    }

    public static int lower(int a)
    {
        int low = 0;
        int high = arr.length;

        while(low<high)
        {
            int middle = (low + high)/ 2;
            if(a <=arr[middle]) high = middle;
            else low = middle + 1;

        }
        return low;
    }

    public static int upper(int a)
    {
        int low = 0;
        int high = arr.length;

        while(low<high)
        {
            int middle = (low + high)/ 2;
            if(a <arr[middle]) high = middle;
            else low = middle + 1;
        }
        return low;
    }
}

