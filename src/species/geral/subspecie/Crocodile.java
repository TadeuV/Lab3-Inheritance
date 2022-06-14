package species.geral.subspecie;

import Animals.Animal;
import species.geral.Reptile;

public class Crocodile extends Reptile{

    

    public Crocodile() {
    super();
   
    }
   
    public Crocodile(int Height, int Weight, String animalType, String bloodType, String skinType, String bone,
        String eggType) {
        super(Height, Weight, animalType, bloodType, skinType, bone, eggType = "Hard-Shelled eggs");
}





    @Override
    public String toString() {
        return "Crocodile [Height=" + getHeight() + ", Weight=" + getWeight() + ", animalType= " + getAnimalType() + ", bloodType= "
        + getBloodType()+ ", skinType= " + getSkinType() + " bone= " + getBone() + ", eggType= " + getEggType() +"]";
    }
    
   

    

    
   
}
