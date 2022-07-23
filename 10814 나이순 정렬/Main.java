import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//10814 나이순 정렬
public class Main
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder[] sb = new StringBuilder[201];
        int N = Integer.parseInt(br.readLine());

        for(int i = 0; i < sb.length; i++){
            sb[i] = new StringBuilder();
        }

        while(N-->0){
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int age = Integer.parseInt(st.nextToken());
            String name = st.nextToken();
            sb[age].append(age).append(' ').append(name).append('\n');
        }

        StringBuilder total = new StringBuilder();
        for(StringBuilder temp: sb)
        {
            total.append(temp);
        }
        System.out.println(total);
    }

}

