/**
 * @author LD
 * @date 2020/8/31 21:01
 */
class Node {

    public int data;//数据
    public Node next;
    public Node prev;
    public Node(int data){
        this.data = data;
    }
        }
public class MyLinkedList {
    public Node head;
    public Node tail;

    //头插法
     public void addFirst(int data){
         Node node = new Node(data);
         if(this.head == null) {
            this.head = node;
             this.tail = node;
         }else{
             node.next = head;
             head.prev = node;
             this.head = node;
         }
     }


     //尾插法
     public void addLast(int data) {
         Node node = new Node(data);
         if(this.head == null) {
             this.head =node;
             this.tail = node;
         }
        this.tail.next = node;
         node.prev = tail;
         this.tail = node;
     }
     //任意位置插入,第一个数据节点为0号下标
     public boolean addIndex(int index,int data) {
         Node node = new Node(data);
         if(index < 0 || index > size()) {
             return false;
         }


         Node cur = this.head;
         while (index-1 > 0) {
             cur = cur.next;
             index--;
         }
         node.next = cur.next;
         cur.next.prev = node;
         node.prev = cur;
         cur.next = node;
         return true;
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
         Node cur = this.head.next;
         Node prev = this.head;
         while(cur != null) {
             if(cur.data == key) {
                 prev.next = cur.next;
                 cur.next.prev = prev;
             }
             cur = cur.next;
             prev = prev.next;
         }

    }
     //删除所有值为key的节点
     public void removeAllKey(int key) {

     }
     //得到单链表的长度
     public int size() {
         Node cur = this.head;
         int count = 0;
         while(cur != null) {
             count++;
             cur = cur.next;
         }
         return count;
     }
     //打印
     public void display() {

     }
     public void clear() {

     }

}
