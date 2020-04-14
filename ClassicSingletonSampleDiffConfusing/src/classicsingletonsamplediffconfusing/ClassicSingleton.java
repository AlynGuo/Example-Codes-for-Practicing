
package classicsingletonsamplediffconfusing;

public class ClassicSingleton {

         private static ClassicSingleton instance = null;
         
         private ClassicSingleton()
         {
         }
         
         public static ClassicSingleton getInstance()
         {
             if(instance == null)
             {
                 instance = new ClassicSingleton();
                 System.out.println("You have created ClassicSingleton.");
             }
             return instance;
         }
          public static void main(String[] args)
          {
              ClassicSingleton s = ClassicSingleton.getInstance();
              ClassicSingleton.getInstance();
          }
}
