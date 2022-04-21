package 多线程2;
//编写10个线程，第一个线程从1加到10，第二个线程从11加到20，…第十个线程从91加到100，最后把10个线程的结果相加。
//
//提示：(1)定义类继承Thread；
//
//(2)类成员变量：①start：表示累加的起始值；
//
//②summary：表示10个线程的累加和；
//
//③run()方法：完成起始值开始的10个数累加；累加和计入总和。
//
//              注意：中间和计入总和summary操作需要用同步块synchronized同步；
//
//              (3) main()中创建10个线程并启动，在显示10个线程和之前需要利用线程插队机制(join())保证所有线程全部工作完成。
public class AddOperation {
    public static void main(String[] args) {
        Add[] t = new Add[10];
        for(int i=0;i<t.length;i++){
            t[i] = new Add(10*i);
            t[i].start();
        }
        System.out.println(Add.sum);
    }
}

class Add extends Thread{
    private int startNumber = 5;
    static int sum = 0;
    public Add(int startNumber){
        this.startNumber = startNumber;
    }
    public void run(){
        int mySum = 0;
        for(int i=1;i<=10;i++){
            mySum = startNumber + i + mySum;
        }
        System.out.println(Thread.currentThread().getName() + ":" + mySum);
        summary(mySum);
    }
    public static synchronized void summary(int mySum){
        sum = sum +mySum;
    }
}

