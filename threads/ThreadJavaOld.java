package threads;

public class ThreadJavaOld extends Thread {

        @Override
      public  void run(){
            try {
                Thread.sleep(50);
//                System.out.println("Thread call extends Thread is running : -- :"+ Thread.currentThread().getName()+". --"+
//                        Thread.currentThread().getState());
//
//                System.out.println("Thread call extends Thread is running : -- :"+ Thread.currentThread().getName());

            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
}
