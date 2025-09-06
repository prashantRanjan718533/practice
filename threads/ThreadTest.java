package threads;

public class ThreadTest {
    public static void main(String[] args) throws InterruptedException {
        ThreadJavaOld threadJavaOld  = new ThreadJavaOld();
//        System.out.println("--threadJavaOld----"+threadJavaOld.getState());
        threadJavaOld.start();

//        System.out.println("--threadJavaOld- after run---"+threadJavaOld.getState());
        Thread.sleep(10);
        System.out.println("--threadJavaOld- after sleep---"+
                threadJavaOld.getName()+ " "+
                threadJavaOld.getState());
        threadJavaOld.join();
        System.out.println("---");
        System.out.println(threadJavaOld.getState());
        //interface Runnable
        ThreadINtfrace threadINtfrace = new ThreadINtfrace();
        Thread superinterface =new Thread(threadINtfrace);
        superinterface.start();
    }
}
