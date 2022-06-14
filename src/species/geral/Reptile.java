package species.geral;

import Animals.Animal;

public class Reptile extends Animal {
    private String skinType;
    private String bone;
    private String eggType;


    public Reptile (){
        super();
        this.skinType = "Dry skin";
        this.bone = "Backbone";
        this.eggType = "Soft-shelled eggs";
    }

    public Reptile (int Height, int Weight, String animalType, String bloodType,String skinType, String bone, String eggType){
        super(Height, Weight, animalType, bloodType);
        this.skinType = skinType;
        this.bone = bone;
        this.eggType = eggType;

    }

    

    public String getSkinType() {
        return skinType;
    }

    public void setSkinType(String skinType) {
        this.skinType = skinType;
    }

    public String getBone() {
        return bone;
    }

    public void setBone(String bone) {
        this.bone = bone;
    }

    public String getEggType() {
        return eggType;
    }

    public void setEggType(String eggType) {
        this.eggType = eggType;
    }

    @Override
    public String toString() {
        return "Reptile [Height=" + getHeight() + ", Weight=" + getWeight() + ", animalType= " + getAnimalType() + ", bloodType= "
        + getBloodType()+ ", skinType= " + skinType + " bone= " + bone + ", eggType= " + eggType + "]";
    }

    
}
