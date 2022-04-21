package 多线程;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DynamicTime {
    public static void main(String[] args){
        Time time = new Time();
        Date date = new Date();
        SimpleDateFormat stf = new SimpleDateFormat("yyyy年MM月dd天 HH时MM分ss秒");
        stf.format(date);
        time.start();
    }
}

class Time extends Thread{
    public void run(){
        while(true){
            Date date = new Date();
            SimpleDateFormat stf = new SimpleDateFormat("yyyy年MM月dd天 HH时MM分ss秒");
            System.out.println(stf.format(date));
            try{
                Thread.sleep(1000);
            }catch(Exception e){
                e.printStackTrace();
            }
        }
    }
}
