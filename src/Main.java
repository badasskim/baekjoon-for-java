import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;

//11047 동전 0
public class Main
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        ArrayList<Integer> arr = new ArrayList<>();
        int count = 0;

        while(N-- > 0)
        {
            arr.add(Integer.parseInt(br.readLine()));
        }

        for(int i = arr.size()-1; i >=0; i--)
        {
            if(K == 0) break;
            if(arr.get(i) <= K)
            {
                count += K / arr.get(i);
                K = K%arr.get(i);
            }
        }

        System.out.println(count);

    }
}

