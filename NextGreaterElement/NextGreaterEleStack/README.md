# StackPracticeProblems
                                                        Next Greater Element
                                                        
Write a function that takes in an array of integers and returns a new array containing, at each index, the next element in the input array that's greater than the element at that index in the input array.

In other words, your function should return a new array where outputArray[i] is the next element in the input array that's greater than inputArray[i]. if there's no such next greater element for a particular index, the value at that index in the output array should be -1. For example, given array = [1, 2]. your function should return [2, -1].

Addsitionally, your function should treat the input array as a circular array. A circular array wraps around itseld as if it were connected end to end. So the next index after the last in a circular array is the first index. This means that, for our problem, give array = [0, 0, 5, 0, 0, 3, 0, 0], the next greater element after 3 is 5, since the array is circular.

Sample Input
array = [2, 5, -3, -4, 6, 7, 2].

Sample Output
[5, 6, 6, 6, 6, -1, 5]

                                                    Implement the idea:
The idea is to store the elements for which we have to find the next greater element in a stack and while traversing the array.
if we find a greater element, we will pair it will the element from the stack till the top element of the stack is less then the current element.

* Push the first element to stack.
* Pick the rest of the elements one by one and follow the following steps in the loop. 
    - Mark the current element as next.
    - If the stack is not empty, compare top most element of stack with next.
    - If next is greater than the top element, Pop element from the stack. next is the next greater element for the popped element.
    - Keep popping from the stack while the popped element is smaller than next. next becomes the next greater element for all such popped elements.
* Finally, push the next in the stack.
* After the loop in step 2 is over, pop all the elements from the stack and print -1 as the next element for them.   