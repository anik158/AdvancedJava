package multithreading;


class NewRunnable implements Runnable{

    Thread thread ;

    int threadNum;
    NewRunnable(int threadNum){
        this.threadNum = threadNum;
        thread = new Thread(this,"Worker thread 1");
        thread.start();
    }
    @Override
    public void run() {

        for (int i = 1; i<=5  ; i++) {
            System.out.println(threadNum+" - Worker thread: "+i);

            try{
                Thread.sleep(2000);

            } catch (InterruptedException e) {
                System.out.println(threadNum+ " - Worker thread is interrupted");
            }
        }
        System.out.println("Exiting the "+threadNum +" worker thread.");
    }
}
public class WorkingThread {

    public static void main(String[] args) {
        System.out.println("Main thread starting...");
        NewRunnable obj1 = new NewRunnable(1);
        NewRunnable obj2 = new NewRunnable(2);
        System.out.println("Thread 1 is alive? - "+obj1.thread.isAlive());
        System.out.println("Thread 2 is alive? - "+obj2.thread.isAlive());

        try {
            obj1.thread.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Thread 1 is alive? - "+obj1.thread.isAlive());
        System.out.println("Thread 2 is alive? - "+obj2.thread.isAlive());
        System.out.println("Main thread exited");
    }
}
