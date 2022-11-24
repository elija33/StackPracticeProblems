package StackImplementation;

import java.util.ArrayList;

public class Stack {
    static ArrayList<Integer> stackwors = new ArrayList<>();

    // adding element into the stack
    public static void push(int number) {
        stackwors.add(number);
    }

    // Removing Element from the stack
    public int pop() {
        int res = stackwors.get(stackwors.size() - 1);
        stackwors.remove(stackwors.size() - 1);
        return res;
    }

    // looking at the last element in the stack
    public int peek() {
        return stackwors.get(stackwors.size() - 1);
    }

    // checking if the stach is empty
    public boolean isEmpty() {
        return stackwors.isEmpty();
    }

    // Getting the size of the stack
    public int size() {
        return stackwors.size();
    }

    public static void main(String[] args) {

    }
}