import java.util.LinkedList;
import java.util.Queue;

/**
 * @author LD
 * @date 2020/9/13 10:33
 */
//队列实现栈


class MyStack0 {


    private Queue<Integer> queue1;
    private Queue<Integer> queue2;

    /** Initialize your data structure here. */
    public MyStack0() {
        queue2 = new LinkedList<>();
        queue1 = new LinkedList<>();
    }

    /** Push element x onto stack. */
    public void push(int x) {
       if(!queue1.isEmpty()) {
           queue1.offer(x);
       }else if(!queue2.isEmpty()) {
           queue2.offer(x);
       }else {
           queue1.offer(x);
       }
    }

    /** Removes the element on top of the stack and returns that element. */
    public int pop() {
        if(empty()) {
            return -1;
        }
        int data = 0;


        if (!queue1.isEmpty()) {
            int size = queue1.size()-1;
            for(int i = 0; i < size; i++) {
                queue2.offer(queue1.poll());
            }
            data = queue1.poll();
        }else {
            int size = queue2.size()-1;
            for(int i = 0; i < size; i++) {
                queue1.offer(queue2.poll());
            }
            data = queue2.poll();
        }
        return data;
    }

    /** Get the top element. */
    public int top() {
        if(empty()) {
            return -1;
        }
        int data = 0;

        if (!queue1.isEmpty()) {
            int size = queue1.size()-1;
            for(int i = 0; i < size; i++) {
                data = queue1.poll();
                queue2.offer(data);
            }

        }else {
            int size = queue2.size()-1;
            for(int i = 0; i < size; i++) {
                data = queue2.poll();
                queue1.offer(data);
            }
        }
        return data;
    }

    /** Returns whether the stack is empty. */
    public boolean empty() {

        return queue1.isEmpty()&&queue2.isEmpty();
    }
}
public class MyStack2 {

}
