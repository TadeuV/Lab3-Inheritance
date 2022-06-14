package Animals;

public class Animal {
    private int Height;
    private int Weight;
    private String animalType;
    private String bloodType;


    //default constructor

    public Animal(){
        Height = 10;
        Weight = 100;
        animalType = "mammal";
        bloodType = "A";
    }
    
    //parameterized constructor

    public Animal(int Height, int Weight, String animalType, String bloodType){
        this.Height = Height;
        this.Weight = Weight;
        this.animalType = animalType;
        this.bloodType = bloodType;
    }

    public int getHeight() {
        return Height;
    }

    public void setHeight(int height) {
        Height = height;
    }

    public int getWeight() {
        return Weight;
    }

    public void setWeight(int weight) {
        Weight = weight;
    }

    public String getAnimalType() {
        return animalType;
    }

    public void setAnimalType(String animalType) {
        this.animalType = animalType;
    }

    public String getBloodType() {
        return bloodType;
    }

    public void setBloodType(String bloodType) {
        this.bloodType = bloodType;
    }

    
    @Override
    public String toString() {
        return "Animal [Height=" + Height + ", Weight=" + Weight + ", animalType=" + animalType + ", bloodType="
                + bloodType + "]";
    }

    
   
    
}



