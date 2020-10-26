package Problem1;

public class MinStack extends ArrayStack<Integer> {
    // okay to add member variables
    // can only use Stack interface and ArrayStack from this folder
    // do not use Java Stack
    ArrayStack auxStack;
    public MinStack(int size) {
        super(size);
        auxStack = new ArrayStack(size);
    }
    @Override
    public boolean push(Integer val) {
        super.push(val);
        if (auxStack.size() <= 1) {
            auxStack.push(val);
            return true;
        }
        if (val <= (int) auxStack.peek()) {
            auxStack.push(val);
            return true;
        }
        return false;
    }

    @Override
    public Integer pop() {
        if (super.peek() <= (int) auxStack.pop()) {
             auxStack.pop();
        }
        return super.pop();
    }

    public Integer getMin() {

        return (int) auxStack.peek(); // place holder
    }
}

