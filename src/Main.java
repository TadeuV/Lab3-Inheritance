import Animals.Animal;
import species.geral.Bird;
import species.geral.Fish;
import species.geral.Reptile;
import species.geral.subspecie.Crocodile;
import species.geral.subspecie.Eagle;
import species.geral.subspecie.Eel;

public class Main {
    public static void main(String[] args) throws Exception {
        Animal test = new Animal();
        Animal test2 = new Animal(120,20,"Reptile", "-O");
        Bird test3 = new Bird(220, 15, "bird", "-B", "no feather", "cant fly");
        Reptile test4 = new Reptile (220, 15, "snake", "-B", "dry", "backbone","soft egg");
        Crocodile test5 = new Crocodile(220, 15, "snake", "-B", "dry", "backbone","hard egg");
        Eagle test6 = new Eagle ();
        Eel test7 = new Eel();
        
        

        System.out.println(test);
        System.out.println(test2);
        System.out.println(test3);
        System.out.println(test4);
        System.out.println(test5);
        System.out.println(test6);
        System.out.println(test7);
    }
}
