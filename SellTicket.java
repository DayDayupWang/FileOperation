public class SellTicket implements Runnable {
    private static int tickets = 100;
    // private Object obj = new Object();
    private int x = 0;

    @Override
    public void run() {
        while (true) {
            if (x % 2 == 0) {
                // synchronized (obj) {
                // synchronized (this) { //同步方法锁
                synchronized (SellTicket.class) { // 静态同步方法锁
                    // t1进来后就会把这段代码锁起来
                    if (tickets > 0) {
                        try {
                            Thread.sleep(10);
                            // t1线程休息100毫秒
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        // 窗口正在出售第100张票
                        System.out.println(Thread.currentThread().getName() + "正在出售第" + tickets + "张票");
                        tickets--;
                    }
                }
            } else {
                sellticks();
            }
            x++;
        }

    }

    /*
     * private void sellticks() {
     * synchronized (obj) {
     * //t1进来后就会把这段代码锁起来
     * if (tickets > 0) {
     * try {
     * Thread.sleep(100);
     * //t1线程休息100毫秒
     * } catch (InterruptedException e) {
     * e.printStackTrace();
     * }
     * //窗口正在出售第100张票
     * System.out.println(Thread.currentThread().getName() + "正在出售第" + tickets +
     * "张票");
     * tickets--;
     * }
     * }
     * }
     */

    // 同步方法
    /*
     * private synchronized void sellticks() {
     * if (tickets > 0) {
     * try {
     * Thread.sleep(100);
     * //t1线程休息100毫秒
     * } catch (InterruptedException e) {
     * e.printStackTrace();
     * }
     * //窗口正在出售第100张票
     * System.out.println(Thread.currentThread().getName() + "正在出售第" + tickets +
     * "张票");
     * tickets--;
     * }
     * }
     */

    // 静态同步方法
    private static synchronized void sellticks() {
        if (tickets > 0) {
            try {
                Thread.sleep(100);
                // t1线程休息100毫秒
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            // 窗口正在出售第100张票
            System.out.println(Thread.currentThread().getName() + "正在出售第" + tickets + "张票");
            tickets--;
        }
    }
}
