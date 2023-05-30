import java.io.File;
public class filemethod {
    public static void main(String[] args){
        for (int i=1;i<11;i++){
            createFile("file no " +i);
        }
    }
    public static void createFile(String filename) {
        try {
            File f1 = new File(filename);
            if (f1.createNewFile()) {
                System.out.println("the operation is sucessful");
            } else {
                System.out.println("the file already exists ");
            }
        } catch (Exception ex) {
            System.out.println("something went wrong");
        }
    }

        public static void deleteFile(String filename){
            try {
                File f1 = new File(filename);
                if(f1.delete()){
                    System.out.println("the operation is sucessful");
                }else{
                    System.out.println("the file dosent exists ");
                }
            }catch (Exception ex){
                System.out.println("something went wrong");
            }
    }
}
