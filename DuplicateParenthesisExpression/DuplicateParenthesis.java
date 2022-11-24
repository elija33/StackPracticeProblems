package DuplicateParenthesisExpression;

import java.util.ArrayDeque;
import java.util.Deque;

public class DuplicateParenthesis {
    public static boolean Duplicate(String expression) {
        Deque<Character> word = new ArrayDeque<>();
        for (int i = 0; i < expression.length(); i++) {
            char checking = expression.charAt(i);
            if (checking == '[' || checking == '(' || checking == '{') {
                word.push(checking);
            }
        }

    }

    public static void main(String[] args) {

    }
}
