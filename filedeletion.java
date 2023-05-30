import java.io.File;
public class filedeletion {
    public static void main(String[] args) {
        File fd = new File("kokushibou.txt");
        if (fd.delete()) {
            System.out.println("the file has been deleted ");
        } else {
            System.out.println("NO");
        }
    }
}