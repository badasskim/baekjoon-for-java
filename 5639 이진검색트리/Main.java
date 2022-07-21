import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main
{
    static class node
    {
        int data;
        node left, right;

        node(int data)
        {
            this.data = data;
        }
        node(int data, node left, node right)
        {
            this.data = data;
            this.left = left;
            this.right = right;
        }

        void insert(int n)
        {
            if(n < this.data)
            {
                if(this.left == null)
                {
                    this.left = new node(n);
                }
                else
                {
                    this.left.insert(n);
                }
            }
            else
            {
                if(this.right == null)
                {
                    this.right = new node(n);
                }
                else
                {
                    this.right.insert(n);
                }
            }
        }
    }

    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        node root = new node(Integer.parseInt(br.readLine()));
        String input;
        while(true)
        {
            input = br.readLine();
            if(input == null || input.equals(""))
            {
                break;
            }
            root.insert(Integer.parseInt(input));
        }
        postOrder(root);
    }
    static void postOrder(node node)
    {
        if(node == null)
            return;

        postOrder(node.left);
        postOrder(node.right);
        System.out.println(node.data);

    }

}

