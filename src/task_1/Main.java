package task_1;

public class Main {

    public static void main(String[] args) {

        MyThread t1 = new MyThread("T1");
        MyThread t2 = new MyThread("T2");
        MyThread t3 = new MyThread("T3");

        try {
            t3.start();
            t3.join();

            t2.start();
            t2.join();

            t1.start();
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }

    }

}
