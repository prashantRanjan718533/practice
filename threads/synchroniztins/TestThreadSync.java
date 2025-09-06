package threads.synchroniztins;

public class TestThreadSync  extends  Thread{

    private  Counter counter;
    public  TestThreadSync(Counter counter)
    {
        this.counter=counter;
    }

    @Override
    public void run() {
        for (int i = 0; i <10 ; i++) {
            counter.increment();
        }
    }
}
