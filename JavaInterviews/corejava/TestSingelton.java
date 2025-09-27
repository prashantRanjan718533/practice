package JavaInterviews.corejava;

public class TestSingelton {
    public static void main(String[] args) {

        Singeltons singeltons =      Singeltons.getInstance();
        System.out.println(" singeltons : "+ singeltons.hashCode());

    }
}
