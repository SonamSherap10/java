import java.io.File;
import java.util.Scanner;

public class FileReader {
    public static void main(String[] args){
       try{
           File fr = new File("kokushibou.txt");
        Scanner read = new Scanner(fr);
        while (read.hasNextLine()){
            String content = read.nextLine();
            System.out.println(content);
        }
              read.close();
    }catch(Exception ex ){
           System.out.println("an error has occured");
       }
}
}
