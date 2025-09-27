package JavaInterviews.corejava;

public class Singeltons {
    public  static Singeltons singelton = null;
    private Singeltons(){

    }
    public  static Singeltons getInstance(){
        if(singelton== null){
            singelton =  new Singeltons();
        }
        return  singelton;
    }
}
