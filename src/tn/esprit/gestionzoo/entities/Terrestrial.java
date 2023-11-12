package tn.esprit.gestionzoo.entities;

public abstract non-sealed class Terrestrial extends Animal implements Omnivore<FOOD>{

    private int nbrLegs;

    public Terrestrial() {
    }

    //Instruction 22
    public Terrestrial(String family, String name, int age, boolean isMammal, int nbrLegs) {
        super(family, name, age, isMammal);
        this.nbrLegs = nbrLegs;
    }

    //Instruction 37--

    public void eatMeat(Food meat) {
        if (meat == Food.MEAT || meat == Food.BOTH) {
            System.out.println("Terrestrial is eating meat.");
        } else {
            System.out.println("Terrestrial does not eat this type of food.");
        }
    }
    public void eatPlant(Food plant) {
        if (plant == Food.PLANT || plant == Food.BOTH) {
            System.out.println("Terrestrial is eating plants.");
        } else {
            System.out.println("Terrestrial does not eat this type of food.");
        }
    }

    public void eatPlantAndMeat(Food food) {
        System.out.println("Terrestrial is eating both plants and meat.");
    }


    //Instruction 23
    @Override
    public String toString() {
        return super.toString() + ", nbrLegs:" + nbrLegs;
    }
}
