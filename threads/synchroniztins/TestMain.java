package threads.synchroniztins;

public class TestMain {
    public static void main(String[] args) {
    Counter counter = new Counter();
    TestThreadSync t1 = new TestThreadSync(counter);
        TestThreadSync t2 = new TestThreadSync(counter);
        t1.start();
        t2.start();
        System.out.println(counter.getCount());


    }
}
