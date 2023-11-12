package tn.esprit.gestionzoo.entities;

//Instruction 37--
public abstract non-sealed class Aquatic extends Animal implements Carnivore<FOOD> {

    protected String habitat;

    public Aquatic() {
    }

    //Instruction 22
    public Aquatic(String family, String name, int age, boolean isMammal, String habitat) {
        super(family, name, age, isMammal);
        this.habitat = habitat;
    }

    //Instruction 37--

    public void eatMeat(Food meat) {
        if (meat == Food.MEAT || meat == Food.BOTH) {
            System.out.println("Aquatic is eating meat.");
        } else {
            System.out.println("Aquatic does not eat this type of food.");
        }
    }




    //Instruction 23
    @Override
    public String toString() {
        return super.toString() + ", habitat:" + habitat;
    }
    //Instruction 24
    public void swim() {
        System.out.println("This aquatic animal is swimming.");
    }
    //Instruction 31
    @Override
    public boolean equals(Object obj){
        if(this==obj)
            return true;
        if (obj==null||getClass()!=obj.getClass())
            return false;
        Aquatic aquatic=(Aquatic) obj;
        return getAge() == aquatic.getAge() && getName().equals(aquatic.getName())&& habitat.equals(aquatic.habitat);
    }
}
