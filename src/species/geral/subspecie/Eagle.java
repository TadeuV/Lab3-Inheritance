package species.geral.subspecie;

import species.geral.Bird;

public class Eagle extends Bird {

   
    public Eagle() {
        super();
    }
   
   
    public Eagle(int Height, int Weight, String animalType, String bloodType, String bodyType, String fly) {
        super(Height, Weight, animalType, bloodType, bodyType, fly);
    }


    @Override
    public String toString() {
        return "Eagle [Height=" + getHeight() + ", Weight=" + getWeight() + ", animalType=" + getAnimalType() + ", bloodType="
        + getBloodType()+ " bodyType=" + getBodyType() + ", fly= " + getFly() + "]";
    }

    

    
}
