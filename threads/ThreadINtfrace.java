package threads;

public class ThreadINtfrace  implements Runnable{

    @Override
    public void run() {
        System.out.println("runnable is working :"+ Thread.currentThread().getName() +" -- "+ Thread.currentThread().getState());
    }

}
