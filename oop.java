public class oop{
    public static void main(String[] args) {
     dog d1 = new dog();
     d1.breed="Shiba Inu";
     d1.weight=24;
     d1.info();
    }
}
class dog{            // we have created a class named dog
    String breed;
    int weight;

    void info(){
        System.out.println("the dog is a "+this.breed);
        System.out.println("the dog is a "+this.weight);
    }
}

