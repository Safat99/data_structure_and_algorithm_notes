## Introduction (What is it?)
* A particular Linear Data structure
* Follows LIFO principal

## How do we make a stack?
The class should have 3 methods to create the Stack data-structure
- push(x) 
- pop(), which will remove the latest item of Stack
- peek(), returns the value of the top(current pointer) item of the stack 

## Some examples/applications of Stack (When to chose Stack over Array)

1. for undo mechanism
2. Backtracking algorithms
3. Balancing symbols `[{()}]`

## Advantage to choose
1. Clarifying the intent, like we are going to implement the LIFO rule.
2. Restricting operations: If we want our List to limit the operations, like using push(), pop() and peek(). We can use Stack. In that case we cannot add a content in the middle of the list.
3. Optimizing operations: All the methods of it are 0(1). so choosing stack is better when possible.