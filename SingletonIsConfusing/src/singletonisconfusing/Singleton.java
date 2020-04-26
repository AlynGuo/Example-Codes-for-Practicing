package singletonisconfusing;

public class Singleton {

    private static Singleton singleton = new Singleton();
    
    /*
    private constructor - prevents any other class from instantiating
    */
    
    private Singleton()
    {
    }
    
    public static Singleton getInstance()
    {
        return singleton; 
    }
    
    protected static void demoMethod()
    {
        System.out.println("demoMethod for  singleton");
    }

    static class getInstance extends Singleton {

        public getInstance() {
        }
    }
}
