package Sort;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Program {
  public ArrayList<Integer> sortStack(ArrayList<Integer> stack) {
    // Write your code here.
    helper(stack);
    return stack;
  }

  public void helper(List<Integer> stack) {
    if (stack.size() == 0) {
      return;
    }
    int curr = stack.get(stack.size() - 1);
    stack.remove(stack.size() - 1);
    helper(stack);
    if (stack.size() == 0 || stack.get(stack.size() - 1) < curr) {
      stack.add(curr);
    } else {
      Stack<Integer> name = new Stack<>();
      while (stack.size() > 0 && stack.get(stack.size() - 1) > curr) {
        name.add(stack.get(stack.size() - 1));
        stack.remove(stack.size() - 1);
      }
      stack.add(curr);
      while (!name.isEmpty()) {
        stack.add(name.pop());
      }
    }
  }
}
