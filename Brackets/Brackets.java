package Brackets;

import java.util.*;

public class Brackets {
    public static boolean balancedParenthensies(String s) {
        Deque<Character> stack = new ArrayDeque<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '[' || c == '(' || c == '{') {
                stack.push(c);
            } else if (c == ']') {
                if (stack.isEmpty() || stack.pop() != '[') {
                    return false;
                }
            } else if (c == ')') {
                if (stack.isEmpty() || stack.pop() != '(') {
                    return false;
                }
            } else if (c == '}') {
                if (stack.isEmpty() || stack.pop() != '{') {
                    return false;
                }
            }

        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        String word = "([{}])";
        String words = "([])(){}(())()(}";
        System.out.println(balancedParenthensies(word));
        System.out.println();
        System.out.println(balancedParenthensies(words));
    }
}
