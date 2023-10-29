package tn.esprit.gestionzoo.entities;

public class Penguin extends Aquatic {

    //Instruction 20
    private float swimmingDepth;

    public Penguin() {
        super();
    }

    public float getSwimmingDepth(){
        return swimmingDepth;
    }
    public void setSwimmingDepth(float swimmingDepth){
        this.swimmingDepth=swimmingDepth;
    }
    //Instruction 22
    public Penguin(String family, String name, int age, boolean isMammal, String habitat, float swimmingDepth) {
        super(family, name, age, isMammal, habitat);
        this.swimmingDepth = swimmingDepth;
    }


    @Override
    public void swim() {
        System.out.println("This dolphin is swimming.");
    }
    //Instruction 23
    @Override
    public String toString() {
        return super.toString() + ", swimmingDepth:" + swimmingDepth;
    }
}
