public class abstarction {
public static void main(String[] args ){
    animal c = new cow();
    c.eyes = 2;
    c.eat();
    c.info();

    animal b = new bear();
    b.eyes =2;
    b.eat();
    b.info();

    animal t = new tiger();
    t.eyes= 2;
    t.eat();
    t.info();
}
}
abstract class animal{
    int eyes ;
 public abstract void eat();
 public void info(){
     System.out.println("it has four legs and " + this.eyes +" set of eyes");
 }
}

class cow extends animal{

   public void eat(){
       System.out.println("\n");
       System.out.println("cow is a herbivorous animal ");
   }
}
 class bear extends animal{
    public void eat(){
        System.out.println("\n");
        System.out.println("bear is a omnivorous animal");
    }
 }

 class tiger extends animal{
    public void eat(){
        System.out.println("\n");
        System.out.println("tiger is a carnivorous animal");
    }
 }