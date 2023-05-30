import java.io.File;
public class bhooti {
    public static void main(String[] args) {
        try {
     File f1 = new File("kokushibou.txt");
     if(f1.createNewFile()){
         System.out.println("the operation is sucessful");
     }else{
         System.out.println("the file already exists ");
     }
        }catch (Exception ex){
            System.out.println("something went wrong");
        }
        
    }

}
