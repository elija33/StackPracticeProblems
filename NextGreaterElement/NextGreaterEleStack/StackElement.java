package NextGreaterElement.NextGreaterEleStack;

public class StackElement {
    public static class stack {
        int top;
        int items[] = new int[100];

        // Stack functions to be used by print
        public void push(int number) {
            if (top == 99) {
                System.out.println("Stack full");
            } else {
                items[++top] = number;
            }
        }

        public int pop() {
            if (top == -1) {
                System.out.println("Underflow error");
                return -1;
            } else {
                int element = items[top];
                top--;
                return element;
            }
        }

        public boolean isEmpty() {
            return (top == -1) ? true : false;
        }
    }

    public static void print(int number[]) {
        int i = 0;
        stack name = new stack();
        name.top = -1;
        int element;
        int next;

        // push the first element to stack
        name.push(number[0]);

        // iterate for rest of the elements
        for (int j = 1; j < number.length; j++) {
            next = number[i];

            if (name.isEmpty() == false) {

                // if stack is not empty, then
                // pop an element from stack
                element = name.pop();

                // if the popped element is smaller than next, then a) print the pair
                // b) keep popping while elements are smaller and stack is not empty.

                while (element < next) {
                    System.out.println(element + "-->" + next);
                    if (name.isEmpty() == true) {
                        break;
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        int number[] = { 2, 5, -3, -4, 6, 7, 2 };
        print(number);
    }
}
