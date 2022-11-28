# StackPracticeProblems
                                                        Next Greater Element
                                                        
Write a function that takes in an array of integers and returns a new array containing, at each index, the next element in the input array that's greater than the element at that index in the input array.

In other words, your function should return a new array where outputArray[i] is the next element in the input array that's greater than inputArray[i]. if there's no such next greater element for a particular index, the value at that index in the output array should be -1. For example, given array = [1, 2]. your function should return [2, -1].

Addsitionally, your function should treat the input array as a circular array. A circular array wraps around itseld as if it were connected end to end. So the next index after the last in a circular array is the first index. This means that, for our problem, give array = [0, 0, 5, 0, 0, 3, 0, 0], the next greater element after 3 is 5, since the array is circular.

Sample Input
array = [2, 5, -3, -4, 6, 7, 2].

Sample Output
[5, 6, 6, 6, 6, -1, 5]

                                        The Idea of Implementing Next Greater Element
The idea is to use two loops    
    The outer loop picks all the elements one by one.
    The inner loop looks for the first greater element for the element picked by the outer loop.
    If a greater element is found then that element is printed as next, otherwise, -1 is printed.

Traverse the array from index 0 to end.
For each element start another loop from index i + 1 to end.
If a greater element is found in the second loop then print it and break the loop, else print -1.

