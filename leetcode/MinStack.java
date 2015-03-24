/*
 * Design a stack that supports push, pop, top, and retrieving 
 * the minimum element in constant time.

 * push(x) -- Push element x onto stack.
 * pop() -- Removes the element on top of the stack.
 * top() -- Get the top element.
 * getMin() -- Retrieve the minimum element in the stack.
 */
public class MinStack {

    public Stack<Integer> stack = new Stack<Integer>();
    public Stack<Integer> minStack = new Stack<Integer>();

    public void push(int x) {
        stack.push(x);
        if (minStack.size() == 0 || minStack.peek() >= x) {
            minStack.push(x);
        }
    }

    public void pop() {
        if (minStack.peek().equals(stack.peek())) {
            minStack.pop();
        }
        stack.pop();
    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        return minStack.peek();
    }

/*******************************************************************/

    public List<Integer> stack = new ArrayList<Integer>();
    public List<Integer> minStack = new ArrayList<Integer>();

    public void push(int x) {
        stack.add(x);
        if (minStack.size() == 0 || minStack.get(minStack.size() - 1) >= x) {
            minStack.add(x);
        }
    }

    public void pop() {
        if (minStack.get(minStack.size() - 1).equals(stack.get(stack.size() - 1))) {
            minStack.remove(minStack.size() - 1);
        }
        stack.remove(stack.size() - 1);
    }

    public int top() {
        return stack.get(stack.size() - 1);
    }

    public int getMin() {
        return minStack.get(minStack.size() - 1);
    }

}
