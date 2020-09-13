import java.util.Arrays;

/**
 * @author LD
 * @date 2020/9/12 10:01
 */
public class MyStack<T> {
    public T[] elem;
    public int top;//表示当前可以存放元素的下标

    public MyStack() {
        this.elem = (T[])new Object[10];
    }


    public void push(T val){
        if(full()) {
            this.elem = Arrays.copyOf(this.elem,this.elem.length*2);
        }
        this.elem[top++] = val;
    }


    public boolean empty() {
        if(this.top == 0) {
            return true;
        }
        return false;
    }

    public boolean full() {
        if (this.elem.length == this.top) {
            return true;
        }
        return false;
    }

    public T pop() {
        if(empty()) {
            throw new RuntimeException("栈空！");
        }
        T data = (T)this.elem[this.top-1];
        this.top--;
        return data;
    }

    public T peek() {
        if(empty()) {
            throw new RuntimeException("栈空！");
        }
        return this.elem[top-1];
    }

    public int size() {
        return this.top;
    }





}


