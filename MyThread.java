public class MyThread extends Thread {

    public MyThread() {
    }

    // 给线程命名
    public MyThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(i);
        }
    }
}
