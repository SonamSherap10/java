import java.io.FileWriter;
public class filemodification {
    public static void main(String[] args){
        try{
            FileWriter fw = new FileWriter("kokushibou.txt");
          fw.write("popipopipopipopipo");
          fw.close();
        }catch(Exception ex){
            System.out.println("Something has went wrong");
        }
    }
}
