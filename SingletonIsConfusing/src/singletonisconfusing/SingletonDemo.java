package singletonisconfusing;

public class SingletonDemo {
     
    public static void main(String[]args)
    {
        Singleton tmp = new Singleton.getInstance();
        Singleton.demoMethod();
        
    }
}
