package tn.esprit.gestionzoo.entities;

public class Zoo {
    public static final int NBRCAGES = 25;
    private Animal[] animals;
    private String name, city;
    private int animalCount;
    //Instruction 25
    private Animal[] aquaticAnimals;
    private int aquaCount=0;

    public Zoo() {
    }

    public Zoo(String name, String city) {
        animals = new Animal[NBRCAGES];
        this.name = name;
        this.city = city;
        aquaticAnimals = new Animal[10];
    }


    public Animal[] getAnimals() {
        return animals;
    }

    public void setAnimals(Animal[] aquaticAnimals) {
        this.aquaticAnimals = aquaticAnimals;
    }

    public Animal[] getAquaticAnimals() {
        return aquaticAnimals;
    }

    public void setAquaticAnimals(Animal[] animals) {
        this.animals = animals;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.isBlank())
            System.out.println("The Zoo name cannot be empty");
        else
            this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getNbrAnimals() {
        return animalCount;
    }

    public void setNbrAnimals(int animalCount) {
        this.animalCount = animalCount;
    }

    //Instruction 26
    public void addAquaticAnimal(Aquatic aquatic){
        if(aquaCount<10){
            aquaticAnimals[aquaCount]=aquatic;
            animalCount++;
        }
        else{
            System.out.println("Le tablau est saturé");
        }
    }

    // Instriction 8 -----

    public void displayZoo() {
        System.out.println("Name: " + name + ", City: " + city + ", N° Cages: " + NBRCAGES + " N° animals: " + animalCount);

    }

    // Instruction 10 + 17 + 32

    public void addAnimal(Animal animal) {
        /*if (searchAnimal(animal) != -1)
            return false;
        if (isZooFull())
            return false;*/
        animals[animalCount] = animal;
        animalCount++;

    }

    //Instruction 11

    public void afficheAnimal() {
        System.out.println("Les animaux dans le zoo sont :");
        for (int i = 0; i < animalCount; i++) {
            System.out.println(animals[i].getName);
        }
    }

    public int searchAnimal(Animal animal) {
        int index = -1;
        for (int i = 0; i < animalCount; i++) {
            if (animal.getName == animals[i].getName)
                return i;
        }
        return index;
    }
    /*Instruction 12

    public boolean addAnimal(Animal animal){
        if(animalCount<25) {
            for (int i = 0; i < animalCount; i++) {
                if (animals[i].name.equal(animal.name)) {
                    return false;
                }
            }
            animals[animalCount] = animal;
            animalCount++;
            return true;
        }else
            return false;
    }*/

    //Instruction 13

    public boolean removeAnimal(Animal animal) {
        int indexAnimal = searchAnimal(animal);
        if (indexAnimal == -1)
            return false;
        for (int i = indexAnimal; i < animalCount; i++) {
            animals[i] = animals[i + 1];
        }
        animals[animalCount] = null;
        this.animalCount--;
        return true;
    }
    void displayAnimals() {
        System.out.println("List of animals of " + name + ":");
        for (int i = 0; i < animalCount; i++) {
            System.out.println(animals[i]);
        }
    }

    //Instruction 15

    public boolean isZooFull(){
        return animalCount == NBRCAGES;
    }


    //Instruction 16

    Zoo z1 = new Zoo("Belveder", "Tunis");
    Zoo z2 = new Zoo("Touta", "Sfax");

    public Zoo comparerZoo(Zoo z1, Zoo z2){
        if(z1.animalCount<z2.animalCount){
            return z2;
        }
        return z1;
    }
    @Override
    public String toString() {
        return "Name: " + name + ", City: " + city + ", N° Cages: " + NBRCAGES + " N° animals: " + animalCount;
    }

    //Instruction 29
    public float maxPenguinSwimmingDepth(){
        float maxdepth=0;
        for (Animal animal : aquaticAnimals){
            if(){

            }

        }
    }


}