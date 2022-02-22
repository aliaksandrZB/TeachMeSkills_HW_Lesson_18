package task_1;

public class MyThread extends Thread {

    String name;

    public MyThread(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        doInnerLogic();
    }

    private void doInnerLogic(){
        try {
            for (int i = 10; i > 0; i--) {
                System.out.println("Child thread: " + name + " " + i);
                Thread.sleep(100);
            }

            System.out.println("Child thread from completed. " + name);
        } catch(InterruptedException e){
            e.printStackTrace();
        }
    }

}
