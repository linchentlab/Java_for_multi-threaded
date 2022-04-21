# Java_for_multi-threaded


1、利用所学的线程知识，实现“动态时钟”显示功能。


关键代码：SimpleDateFormat SDF=new SimpleDateFormat("yyyy'年'MM'月'dd'日'HH:mm:ss");//格式化时间

Calendar now=Calendar.getInstance();

String  time=SDF.format(now.getTime());  //得到当前日期和时间

2、编写10个线程，第一个线程从1加到10，第二个线程从11加到20，…第十个线程从91加到100，最后把10个线程的结果相加。

提示：(1)定义类继承Thread；

(2)类成员变量：①start：表示累加的起始值；

②summary：表示10个线程的累加和；

③run()方法：完成起始值开始的10个数累加；累加和计入总和。

注意：中间和计入总和summary操作需要用同步块synchronized同步；

(3) main()中创建10个线程并启动，在显示10个线程和之前需要利用线程插队机制(join())保证所有线程全部工作完成。
