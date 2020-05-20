package createnewfiles;
import java.io.File;

public class GetFileInfo {

    public static void main(String[]args){
        
        File info = new File("newfile.txt");
        if(info.exists()){
        System.out.println("File name: "+ info.getName());
          System.out.println("Absolute path: "+ info.getAbsolutePath());
            System.out.println("Writeable: "+ info.canWrite());
              System.out.println("Readable: "+ info.canRead());
                System.out.println("File size in byte: "+ info.length());
        }
        else{
            System.out.println("The file does not exists.");
        }
    }    
}
