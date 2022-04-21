package 多线程2;

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

