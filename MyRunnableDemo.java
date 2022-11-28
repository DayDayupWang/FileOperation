public class MyRunnableDemo {

    public static void main(String[] args) {
        // 创建MyRunnable类的对象
        MyRunnable mr = new MyRunnable();

        // 创建Thread类的对象，把MyRunnable对像作为构造方法的参数
        // public Thread(Runnable target)
        // Thread t1 = new Thread(mr);
        // Thread t2 = new Thread(mr);

        // public Thread(Runnable target, String name)
        Thread t1 = new Thread(mr, "高铁");
        Thread t2 = new Thread(mr, "飞机");

        // 启动线程
        t1.start();
        t2.start();
    }
}
