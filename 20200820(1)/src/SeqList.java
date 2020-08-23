/**
 * @author LD
 * @date 2020/8/20 18:02
 */
//实现顺序表

class Node {
    public int data;
    public Node next;
    public Node(int data) {
        this.data = data;
    }
}
public class SeqList {
    public Node head;

    //头插法
    public void addFist(int data) {
        Node node = new Node(data);
        if(this.head == null) {
            this.head = node;
            return;
        }
        node.next = this.head;
        this.head = node;
    }

    //尾插法
    public void addLast(int data) {
        Node node = new Node(data);
        Node cur = head;
        if(this.head == null) {
            this.head = node;
            return;
        }
        while (cur.next != null) {
            cur = cur.next;
        }
        cur.next = node;
    }

    //任意位置插入，第一个数据节点为0号下标
    public void addIndex(int index,int data) {
        Node node = new Node(data);
        if(index == 0) {
            addFist(data);
            return;
        }
        if(index == size()) {
            addLast(data);
            return;
        }
        Node cur = searchIndex(index);
        node.next = cur.next;
        cur.next = node;

    }
    private Node searchIndex(int index) {
        if(index < 0 ||index > size()) {
            throw new RuntimeException("index位置不合法");
        }
        int count = 1;
        Node cur = this.head;
        while (count < index) {
            cur = cur.next;
            count++;
        }
        return cur;
    }

    //查找是否包含关键字key是否在单链表当中
     public boolean contains(int key) {
        Node cur = this.head;
        while (cur != null) {
            if(cur.data == key) {
                return true;
            }
            cur = cur.next;
        }
        return false;
     }

     //删除第一次出现关键字为key的节点
    public void remove(int key) {
        if(this.head == null) {
            return;
        }
        //删除的是头结点
        if(this.head.data == key) {
            this.head = this.head.next;
            return;
        }

        //找到删除节点的前驱
        Node prev = seachPrev(key);
        if(prev == null) {
            System.out.println("没有这个节点");
            return;
        }
        prev.next = prev.next.next;

    }


    //删除所有值为key的节点
    public Node removeAll(int key) {
        if(this.head == null){
            return null;
        }
        Node cur = this.head.next;
        Node prev = this.head;
        while (cur != null){
            if(cur.data == key) {
                prev.next = cur.next;
                cur = cur.next;
            }else {
                prev = cur;
                cur = cur.next;
            }
        }
        if(this.head.data == key) {
            this.head = this.head.next;
        }
        return head;
    }

    private Node seachPrev(int key) {
        Node prev = this.head;
        while (prev.next != null) {
            if(prev.next.data == key) {
                return prev;
            }else {
                prev = prev.next;
            }
        }
        return null;
    }

    //顺序表长度
    public int size() {
        Node cur = head;
        int count = 0;
        while (cur != null) {
            count++;
            cur = cur.next;
        }
        return count;
    }
    //打印顺序表
    public void disPlay() {
        Node cur = this.head;
        while (cur != null) {
            System.out.println(cur.data+" ");
            cur = cur.next;
        }
    }

    //删除单链表
    public void clear() {
        this.head = null;
    }

    //找中间位置节点
    public Node middleNode() {
       int prev = size()/2;
       Node cur = this.head;
       while (prev != 0) {
           cur = this.head.next;
           prev--;
       }
       return cur;
    }

    //找倒数第k个节点
    public Node findKthToTail(int k) {
        int ret = size()-k;
        Node cur = this.head;
        while (ret != 0) {
            cur = cur.next;
            ret--;
        }
        return cur;

    }

    //判断链表中是否有环
    public boolean hasCycle() {
        Node fast= this.head;
        Node slow = this.head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if(fast == slow) {
                return true;
            }
        }
      return false;
    }


    //返回环彻底入口位置
    public Node detectCycle() {
        Node fast = this.head;
        Node slow = this.head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if(fast == slow) {
                break;
            }
        }
        if(fast == null && fast.next == null) {
            return null;
        }

        slow = this.head;
        while (slow != fast) {
            slow = slow.next;
            fast = fast.next;

        }
        return slow;
    }


    //反转单链表
    public Node reverseList() {
        Node prev = null;
        Node cur = this.head;
        Node newHead = null;
        while (cur != null) {
            Node curNext = cur.next;
            if(curNext == null) {
                newHead = cur;
            }
            cur.next = prev;
            prev = cur;
            cur = curNext;
        }
        return newHead;
    }


    //反转单链表（头插法）
    public Node reverseList2() {
        Node
    }


}
