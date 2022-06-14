package species.geral;

import Animals.Animal;

public class Fish extends Animal {
    private String waterType;
    private String gills;

    public Fish(){
        super();
        this.waterType = "salt";
        this.gills = "yes";
    
    }

    public Fish (int Height, int Weight, String animalType, String bloodType,String waterType, String gills){
        super(Height, Weight, animalType, bloodType);
        this.waterType = waterType;
        this.gills = gills;
    }
    
    

    public String getWaterType() {
        return waterType;
    }

    public void setWaterType(String waterType) {
        this.waterType = waterType;
    }

    public String getGills() {
        return gills;
    }

    public void setGills(String gills) {
        this.gills = gills;
    }

    @Override
    public String toString() {
        return "Fish [Height=" + getHeight() + ", Weight=" + getWeight() + ", animalType= " + getAnimalType() + ", bloodType= "
        + getBloodType()+ " gills=" + gills + ", waterType= " + waterType + "]";
    }

    
}
