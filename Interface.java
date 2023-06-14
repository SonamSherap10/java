public class Interface {
    public static void main(String[] args){
        dogz d1 = new dogz();
        d1.callz();
        d1.legs();

        dogz.lion l1= new dogz.lion();
        l1.pupu();
        l1.callz();
    }
}
    interface eyez{
     void pupu();
    }


    interface animalz{
    void callz();
    }

    class dogz implements animalz{
       void legs(){
           System.out.println("it has 4 legs");
       }
        public void callz(){
           System.out.println("it howls");
       }
       static class lion implements animalz , eyez {
           public void pupu(){
               System.out.println("king leo");
           }
           public void callz(){
               System.out.println("it roars");
           }
       }
    }

