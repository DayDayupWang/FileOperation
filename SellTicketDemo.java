public class SellTicketDemo {
    public static void main(String[] args) {
        // 创建SellTicket类的对象
        SellTicket st = new SellTicket();

        // 创建三个Thread类的对象，把SellTicket对象作为构造方法的参数，并给出对应的窗口名称
        Thread th1 = new Thread(st, "窗口1");
        Thread th2 = new Thread(st, "窗口2");
        Thread th3 = new Thread(st, "窗口3");

        // 启动线程
        th1.start();
        th2.start();
        th3.start();
    }
}
