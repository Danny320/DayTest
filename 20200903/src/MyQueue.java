/**
 * @author LD
 * @date 2020/9/12 10:35
 */
class Node {
    public int data;
    public Node next;

    public Node(int data) {
        this.data = data;
    }
}
public class MyQueue {

    int usedSize;
    public Node front;//头
    public Node rear;//尾巴

    public boolean offer(int val) {
        Node node = new Node(val);
        if(this.rear == null) {
            this.front = node;
            this.rear = node;
        }else {
            this.rear.next = node;
            this.rear = node;
        }
        this.usedSize++;
        ;return true;
    }
    public int poll() {
        if(isEmpty()) {
            throw new RuntimeException("队列为空");
        }
        int data = this.front.data;
        this.front = this.front.next;
        return data;
    }

    public int peek() {
        if(isEmpty()) {
            throw new RuntimeException("队列为空");
        }
        int data = this.front.data;
        return data;
    }


    public boolean isEmpty() {
        if(usedSize == 0) {
            return true;
        }
        return false;
    }

    public int size() {
        return this.usedSize;
    }




}
