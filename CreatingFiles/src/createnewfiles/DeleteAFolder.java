package createnewfiles;
import java.io.File;

public class DeleteAFolder {
   
    public static void main(String[]args){
   File myObj = new File("C:\\Example-Codes-for-Practicing-master\\JavaAdvancePractice\\src\\com\\file\\CreatingFiles\\Rectangle");
   if(myObj.delete()){
       System.out.println("Deleted the folder: "+ myObj.getName());
       }else{
       System.out.println("Failed to delete the folder.");
   }
    }
}
