import java.util.Stack;

public class StackExample{

    void method(){
    //Stack<Integer> stack = new
}

public static void main (String args[]){
       StackExample stackExample = new StackExample();
       Stack<Integer> stack = new Stack<Integer>();
       System.out.println("Stack value " +stack);
       boolean abc = stack.empty();
    System.out.println("Stack is empty " +abc);
    stack.push(1);
    stack.push(10);
    stack.push(20);
    stack.push(30);
    stack.push(40);
    stack.push(50);
    System.out.println("Stack value " +stack);
    int peek = stack.peek();
    System.out.println("Stack value for peek " +peek);
    System.out.println("Stack value " +stack);
    int pop = stack.pop();
    System.out.println("Stack value after pop " +pop);
    System.out.println("Stack value " +stack);

}

}