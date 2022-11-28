package Sort.SortStackTemStack;

import java.util.Stack;

public class SortStack {

    // This function return the sorted stack
    public static Stack<Integer> sort(Stack<Integer> input) {
        Stack<Integer> number = new Stack<Integer>();
        while (!input.isEmpty()) {

            // pop out the first element
            int name = input.pop();

            // while temporary stack is not empty and top of stack is greater than temp
            while (!number.isEmpty() && number.peek() > name) {

                // pop from temporary stack and push it to the input stack
                input.push(number.pop());
            }

            // push temp in temporary of stack
            number.push(name);
        }
        return number;
    }

    // Testing Driver Code
    public static void main(String[] args) {
        Stack<Integer> input = new Stack<Integer>();
        input.add(34);
        input.add(3);
        input.add(31);
        input.add(98);
        input.add(92);
        input.add(23);

        // This is the temporary stack
        Stack<Integer> number = sort(input);
        System.out.println("Sorted numbers are:");

        while (!number.empty()) {
            System.out.print(number.pop() + " ");
        }
    }
}
