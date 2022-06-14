package species.geral;

import Animals.Animal;

public class Bird extends Animal {
    private String bodyType;
    private String fly;

    public Bird (){
        super();
        this.bodyType = "feathered";
        this.fly = "Flying type";
    }

    public Bird (int Height, int Weight, String animalType, String bloodType,String bodyType, String fly){
        super(Height, Weight, animalType, bloodType);
        this.bodyType = bodyType;
        this.fly = fly;
    }


    public String getBodyType() {
        return bodyType;
    }

    public void setBodyType(String bodyType) {
        this.bodyType = bodyType;
    }

    public String getFly() {
        return fly;
    }

    public void setFly(String fly) {
        this.fly = fly;
    }

    @Override
    public String toString() {
        return "Bird [Height=" + getHeight() + ", Weight=" + getWeight() + ", animalType=" + getAnimalType() + ", bloodType="
        + getBloodType()+ " bodyType=" + bodyType + ", fly= " + fly + "]";
    }

    

}

