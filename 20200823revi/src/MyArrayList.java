import java.util.Arrays;

/**
 * @author LD
 * @date 2020/8/23 15:24
 */
public class MyArrayList {
    public int[] elem;
    public int usedSize;
    public static final int intCapacity = 10;


    public MyArrayList() {
        this.elem = new int[intCapacity];
        this.usedSize = 0;
    }

    //打印顺序表
    public void disPlay() {
        for(int i = 0; i < this.usedSize; i++) {
            System.out.print(this.elem[i]+" ");
            System.out.println();
        }
    }

    //在 pos 位置新增元素
    public void add(int pos, int data) {
        if(isFull()) {
            this.elem = Arrays.copyOf(this.elem,this.elem.length*2);
        }

        if(pos < 0 || pos > this.usedSize) {
            System.out.println("插入位置不合理");
            return;
        }
        for(int i = this.usedSize-1; i >= pos; i--) {
            this.elem[i++] = this.elem[i];
        }
        this.elem[pos] = data;
        this.usedSize++;
    }

    //isfull
    private boolean isFull() {
        if(this.usedSize == this.elem.length) {
            return true;
        }
        return false;
    }

    //判定是否包含某个元素
    public boolean contains(int toFind) {
        for(int i = 0; i< this.usedSize; i++) {
            if(this.elem[i] == toFind) {
                return true;
            }
        }
        return false;
    }

    //查找某个元素的对应位置
    public int search(int toFind) {
        for(int i = 0; i<this.usedSize; i++) {
            if(this.elem[i] == toFind) {
                return i;
            }
        }
        return -1;
    }

    //获取 pos 位置的元素
    public int getPos(int pos) {
        if (this.usedSize == 0) {
            throw new RuntimeException("pos 位置不合法");
        }
       checkPos(pos);
        return this.elem[pos];
    }
    private void checkPos(int pos) {
        if(pos < 0 || pos > this.usedSize-1) {
            throw new RuntimeException("pos 位置不合法");

        }
    }
    private boolean isEmpty() {
        return this.usedSize == 0;
    }

    //给pos位置的元素设置为 value
    public void setPos(int pos,int value) {
        checkPos(pos);
        this.elem[pos] = value;
    }

    //删除第一次出现的关键字
    public void remove(int toRemove) {
       int index = search(toRemove);
       if(index == -1) {
           System.out.println("没有要删除的数字");
       }
        for(int i = index; i < this.usedSize-1; i++) {
           this.elem[i] = this.elem[i+1];
        }
        this.usedSize--;
    }


    //获取顺序表长度
    public int size() {
        return this.usedSize;
    }

    //清空顺序表
    public void clear() {
        this.usedSize = 0;
    }

}
