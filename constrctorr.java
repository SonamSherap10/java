public class constrctorr {
    public static void main(String[] args){
        player p1 = new player("Erling Haaland",9,"Manchester City","CF",25000000);
        player p2 = new player("Kevin De bruyne",17,"Manchester City","CAM",1200000);
        player p3 = new player("Julian Alvarez",19,"Manchester City","CF",8500000);
        player p4 = new player("Bernardo Silva",20,"Manchester City","RMF",1100000);
        player p5 = new player("Jack Grealish",7,"Manchester City","LWF",11500000);

        p1.printinfo();
        p2.printinfo();
        p3.printinfo();
        p4.printinfo();
        p5.printinfo();
    }
}
class player{
    // properties
    int jersey_no;
    String club;
    String name;
    String position;
    int value;

    //constructor
    player(String name,int jersey_no,String club,String position,int value){
        this.jersey_no=jersey_no;
        this.club=club;
        this.name=name;
        this.position=position;
        this.value=value;
    }
    void printinfo(){
    System.out.println(name +" plays for "+club +" with the jersey.no "+jersey_no +" in the "+position+" position with the market value of "+value+"$");
    }
}