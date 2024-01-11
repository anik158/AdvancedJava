package multithreading;

public class MainThread {
    public static void main(String[] args) {
        Thread thread = Thread.currentThread();

        System.out.println("Thread name is:"+thread.getName());

        thread.setName("Thread one");

        System.out.println("After changing thread name is:"+thread.getName());

        for (int i = 10; i >=0 ; i--) {
            System.out.println(i);

            try{
                Thread.sleep(500);

            } catch (InterruptedException e) {
                System.out.println("Thread is interrupted");
            }
        }
    }
}
