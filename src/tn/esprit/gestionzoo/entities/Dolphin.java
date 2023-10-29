package tn.esprit.gestionzoo.entities;

public class Dolphin extends Aquatic {

    //Instruction 20
    private float swimmingSpeed;

    public Dolphin() {
        super();
    }

    //Instruction 22
    public Dolphin(String family, String name, int age, boolean isMammal, String habitat, float swimmingSpeed) {
        super(family, name, age, isMammal, habitat);
        this.swimmingSpeed = swimmingSpeed;
    }

    //Instruction 24  28
    @Override
    public void swim() {
        System.out.println("This dolphin is swimming.");
    }

    //Instruction 23
    @Override
    public String toString() {
        return super.toString() + ", swimmingSpeed:" + swimmingSpeed;
    }
}
