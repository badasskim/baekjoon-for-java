import java.io.*;
import java.util.Stack;

public class Main
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Stack<Integer> stack = new Stack<>();

        int K = Integer.parseInt(br.readLine());
        int result = 0;

        while(K-- > 0)
        {
            int a = Integer.parseInt(br.readLine());

            if(a == 0) stack.pop();
            else
            {
                stack.push(a);
            }
        }

        if(stack.isEmpty())
        {
            System.out.println(0);
        }
        else
        {
            for (Integer integer : stack)
            {
                result += integer;
            }
            System.out.println(result);
        }


    }
}

