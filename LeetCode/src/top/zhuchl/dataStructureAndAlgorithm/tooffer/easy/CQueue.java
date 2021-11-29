package top.zhuchl.dataStructureAndAlgorithm.tooffer.easy;

import java.util.Stack;

/**
 * 用两个栈实现一个队列。队列的声明如下，请实现它的两个函数 appendTail 和 deleteHead ，
 * 分别完成在队列尾部插入整数和在队列头部删除整数的功能。(若队列中没有元素，deleteHead操作返回 -1 )
 *
 * @Author AlphaZcl
 * @Date 2021/7/7
 **/
public class CQueue {

    private Stack<Integer> inStack;
    private Stack<Integer> outStack;

    public CQueue(){
        inStack = new Stack<>();
        outStack = new Stack<>();
    }

    public void appendTail(int value) {
        inStack.push(value);
    }

    public int deleteHead() {
        if(outStack.empty()){
            while(!inStack.empty()){
                outStack.push(inStack.pop());
            }
        }
        if(outStack.isEmpty()){
            return -1;
        }
        return outStack.pop();
    }

    public static void main(String[] args) {
        CQueue cQueue = new CQueue();
        cQueue.appendTail(3);
        cQueue.appendTail(4);
        cQueue.appendTail(5);
        System.out.println(cQueue.deleteHead());
        System.out.println(cQueue.deleteHead());
        cQueue.appendTail(6);
        System.out.println(cQueue.deleteHead());
    }
}
