import java.io.FileWriter;
public class file {
    public static void main(String[]args){
    try
    {
        FileWriter f1 = new FileWriter("kokushibou.txt",true);
        f1.write("this is a 2rd string ");
        f1.close();
        }catch (Exception ex){
            System.out.println("the operation is not sucessful");
        }
    }
}



