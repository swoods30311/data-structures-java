import java.util.Stack;

public class WorkingWithStacks {
    public static void main(String[] args) {
        //Hardcode class implementation of the Stack DS
        Stack <Integer> stack = new Stack<>();

        stack.push(1);
        stack.push(2);
        stack.push(3);
        System.out.println(stack.peek());//3
        System.out.println(stack.size());//3
        System.out.println(stack.pop());//3
        System.out.println(stack.size());//2
    }
}