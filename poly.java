// here the same call info method calls diffrent outputs
public class poly {
public static void main(String[] args){
    laptop l1= new laptop();
    l1.callinfo();
    laptop l2= new laptop2();
    l2.callinfo();
    laptop l3= new laptop3();
    l3.callinfo();
}
}

class laptop{
    void callinfo(){
        System.out.println("Acer");
    }
}

class laptop2 extends laptop{
    void callinfo(){
        System.out.println("Dell");
    }
}

class laptop3 extends laptop{
    void callinfo(){
        System.out.println("Lenovo");
    }
}