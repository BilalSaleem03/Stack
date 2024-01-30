import java.util.Stack;
public class Stack_pushAtBottom {

    public static void pushAtBottom(int data , Stack<Integer> s)
    {
        if(s.isEmpty())
        {
            s.push(data);
            return;
        }
        int topData = s.pop();
        pushAtBottom(data , s);
        s.push(topData);

    }

    public static void main(String[] args)
    {
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        pushAtBottom(4 , s);

        while(!s.isEmpty())
        {
            System.out.println(s.peek());
            s.pop();
        }
    }
}