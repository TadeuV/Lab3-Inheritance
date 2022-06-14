package species.geral.subspecie;

import Animals.Animal;
import species.geral.Fish;

public class Eel extends Fish{
    private String skill;

    
    public Eel (){
        super();
        this.skill = "eletric charge";
    }

    public Eel (int Height, int Weight, String animalType, String bloodType,String waterType, String gills, String skill ){
        super(Height, Weight, animalType, bloodType, waterType, gills);
        this.skill = skill;
    }

    public String getSkill() {
        return skill;
    }

    @Override
    public String toString() {
        return "eel [ \n Height: "+ getHeight() + "\n Weight: " + getWeight() + "\n Animal Type: " + getAnimalType() + "\n Blood Type: " 
        + getBloodType() + "\n gills=" + getGills() + ",\n waterType= " + getWaterType() + "\n skill=" + skill + "]";
    }

}
