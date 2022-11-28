//实现多线程
// 方式1：继承Thread类
// 1:定义一个类MyThread继承Thread类
// 2:在MyThread类中重写run()方法
// 3:创建MyThread类的对象
// 4:启动线程
public class MyThreadDemo {
    public static void main(String[] args) {
        Thread my1 = new Thread();
        Thread my2 = new Thread();
        Thread my3 = new Thread();
        my1.start();
        try {
            my1.join();// 等my1消亡后再执行后两个
        } catch (InterruptedException e) {

            e.printStackTrace();
        }
        // 设置守护线程，主线程执行完毕后随JVM结束而结束
        my2.setDaemon(true);
        my3.setDaemon(true);
        my2.start();
        my3.start();
        // 返回对当前正在执行的线程对象的引用
        System.out.println(Thread.currentThread().getName());
        System.out.println(Thread.MAX_PRIORITY);
        System.out.println(Thread.MIN_PRIORITY);
        my1.setPriority(1);
        my2.setPriority(5);
    }
}
