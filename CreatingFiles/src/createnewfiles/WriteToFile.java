package createnewfiles;
import java.io.FileWriter;
import java.io.IOException;

public class WriteToFile {
    
      public static void main(String[]args){
          
          try{
              FileWriter myWriter = new FileWriter("newfile.txt");
              myWriter.write("Files in java are freaking confusing.");
              myWriter.close();
              System.out.println("Successfully wrote to the file!");
          }catch(IOException e){
              System.out.println("An error occurred.");
              e.printStackTrace();
          }
      }    
}
