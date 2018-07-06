1. Why does LinkedStack not require an explicit constructor?
Answer:
-------
Default constructor(No parameter) is enough for linkedStack class (we really don't need any parametrized constructor for linkedStack).
So, Java compiler itself creates a default constructor for us.


2. What is the time and (extra) space complexity of each of the LinkedStack methods, as well as ReverseLines.main?
Answer:
-------
            Time complexity     Space complexity
push    -       O(1)                O(1)
peek    -       O(1)                O(1)
pop     -       O(1)                O(1)
isEmpty -       O(1)                O(1)
asList  -       O(n)                O(1)
Where n is the size of the linkedStack


3. How else (not using Node) could we have implemented LinkedStack in such a way that it is still based on a linked list but the asList method uses constant time and space?
Answer:
-------
If we use LinkedStack instance variable of type List instead of type Node then asList method can be constant time and space.


4. Is it better for push and pop to return the item or the stack itself? Briefly discuss the pros and cons of each design.
Answer:
-------
We are using pop to remove the object at the top of this stack and return that object as the value of this function.
So that we get the removed object from pop.
But, If we return the remaining stack then we won't get the removed object at all. Because we are returning the stack after removing the top element. This is the disadvantage of returning stack for pop.
In the case of push, If we return the stack then we have to look into the top of the stack whether the object is inserted or not. This is the disadvantage of returning stack for push.