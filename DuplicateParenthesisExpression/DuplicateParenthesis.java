package DuplicateParenthesisExpression;

import java.util.ArrayDeque;
import java.util.Deque;

public class DuplicateParenthesis {
    public static boolean Duplicate(String expression) {

        // create a stack of characters
        Deque<Character> word = new ArrayDeque<>();

        // Iterate througth the given expression
        char chargive[] = expression.toCharArray();
        for (char name : chargive) {
            // if current character is close parenthesis ')'
            if (name == ')') {
                // pop character is close parenthesis
                char top = word.peek();
                word.pop();

                // stores the number of characters between a
                // closing and opening parenthesis
                // if this count is less than or equal to 1
                // then the brackets are redundant else not

                int element = 0;
                while (top != '(') {
                    element++;
                    top = word.peek();
                    word.pop();
                }
                if (element < 1) {
                    return true;
                } // push open parenthesis '(', operators and operands to stack
            } else {
                word.push(name);
            }
        }
        // No duplicates found
        return false;
    }

    public static void main(String[] args) {
        String word = "(((a+(b))";
        System.out.println(Duplicate(word));
    }
}
