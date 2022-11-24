# StackPracticeProblems

                        Find duplicate parenthesis in an expression

Given a balanced expression that can contain opening and closing parenthesis, check if it contains any duplicate parenthesis or not.

Input:  ((x+y))+z
Output: true
Explanation: Duplicate () found in subexpression ((x+y))
 
Input:  (x+y)
Output: false
Explanation: No duplicate () is found
 
 
Input:  ((x+y)+((z)))
Output: true
Explanation: Duplicate () found in subexpression ((z))

We can use a stack to solve this problem. The idea is to traverse the given expression and

If the current character in the expression is not a closing parenthesis ')', push the character into the stack.
If the current character in the expression is a closing parenthesis ')', check if the topmost element in the stack is an opening parenthesis or not. If it is an opening parenthesis, then the subexpression ending at the current character is of the form ((exp)); otherwise, continue popping characters from the stack till matching '(' is found for current ')'


                                        Approach of solving 

The idea is to use stack. Iterate through the given expression and for each character in the expression.
 if the character is a open parenthesis ‘(‘ or any of the operators or operands, push it to the top of the stack. 
 If the character is close parenthesis ‘)’, then pop characters from the stack till matching open parenthesis ‘(‘ is found and a counter is used, whose value is incremented for every character encountered till the opening parenthesis ‘(‘ is found. 
 If the number of characters encountered between the opening and closing parenthesis pair, which is equal to the value of the counter, is less than 1, then a pair of duplicate parenthesis is found else there is no occurrence of redundant parenthesis pairs. 
 For example, (((a+b))+c) has duplicate brackets around “a+b”. 
 When the second “)” after a+b is encountered, the stack contains “((“. Since the top of stack is a opening bracket, it can be concluded that there are duplicate brackets.