import java.util.Scanner;
public class catchingexception {
    public static void main(String[] args) {
        Scanner name = new Scanner(System.in);
        try {
            System.out.println("enter your first num");
            int f1 = name.nextInt();
            System.out.println("enter your second num");
            int f2 = name.nextInt();
            System.out.println("your number is " + f1 + " " + f2);
        }catch (Exception ex){
            System.out.println("enter numbers only");
        }
    }
}
