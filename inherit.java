public class inherit {
    public static void main(String[] args){
        school s1 = new school();
        s1.name="bishal";
        s1.roll=4;
        s1.address="sindhuwa bazzar";
        s1.callschoolinfo();

        hostel h1 = new hostel();
        h1.name="sabin";
        h1.roll=27;
        /*  h1.address & h1.schoolinfo() cant be used as a property  and method for
        hostel object cuz it dosen't exist in hostel class */
        h1.callinfo();
    }
}

class hostel {
    //properties
    String name;
    int roll;

    //methods in hostel class
    void callinfo(){
     System.out.println("the name of student is "+name);
     System.out.println("the roll no of student is "+roll);
    }
}
// inheriting the methods and properties of hostel class into school
class school extends hostel{
    String address;

    void callschoolinfo(){
        callinfo();
        System.out.println("the address of the student is "+address);

    }
}