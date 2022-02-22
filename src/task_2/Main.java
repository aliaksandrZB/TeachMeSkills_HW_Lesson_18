package task_2;

import task_2.MyThread;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Main {

    public static void main(String[] args) {

        Properties appProps = new Properties();
        try {
            appProps.load(new FileInputStream("src\\task_2\\resources\\morning"));
        } catch (IOException e) {
            e.printStackTrace();
        }

        MyThread t1 = new MyThread(appProps.getProperty("threadPriorityName1"));
        MyThread t2 = new MyThread(appProps.getProperty("threadPriorityName2"));
        MyThread t3 = new MyThread(appProps.getProperty("threadPriorityName3"));

        try {
            t1.start();
            t1.join();

            t2.start();
            t2.join();

            t3.start();
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }

    }

}
