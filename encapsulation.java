public class encapsulation {
    public static void main(String[] args){
        data d1 = new data();
        d1.setName("sonam sherpa");
        d1.setRoll(20);

        data d2 = new data();
        d2.setName("Bishal Limbu");
        d2.setRoll(4);

        data d3 = new data();
        d3.setName("Nischal basnet");
        d3.setRoll(29);

         System.out.println("the name is "+ d1.getName() +" the roll no is " +d1.getRoll());
         System.out.println("the name is "+ d2.getName() +" the roll no is " +d2.getRoll());
         System.out.println("the name is "+ d3.getName() +" the roll no is " +d3.getRoll());

    }
}

class data{
    // hiding data
    private String name;
    private int roll;


// creating getter to retrive  the value of the variables
int getRoll(){
    return this.roll;
}
String getName() {
    return this.name;
}

// creating setter to set the value
    void setRoll(int roll){
    this.roll=roll;
    }
    void setName(String name){
        this.name=name;
    }
}