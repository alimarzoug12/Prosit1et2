public class Zoo {
    Animal[] animals;
    String city;
    String name;

    //Instruction 14
    static final int NBRCAGES = 25;
    int animalCount;

    //Instruction 18
    public Zoo(String name, String city) {
        if (name ==""){
            System.out.println("The name of zoo should be not vide!");
        }
        else {
            Animal[] animals = new Animal[25];
            this.name = name;
            this.city = city;
        }
    }

    // Instriction 8 -----

    public void displayZoo() {
        System.out.println("Name: " + name + ", City: " + city + ", N° Cages: " + NBRCAGES + " N° animals: " + animalCount);

    }

    // Instruction 10 + 17

    public boolean addAnimal(Animal animal) {
        if (searchAnimal(animal) != -1)
            return false;
        if (isZooFull())
            return false;
        animals[animalCount] = animal;
        animalCount++;
        return true;
    }

    //Instruction 11

    public void afficheAnimal() {
        System.out.println("Les animaux dans le zoo sont :");
        for (int i = 0; i < animalCount; i++) {
            System.out.println(animals[i].name);
        }
    }

    public int searchAnimal(Animal animal) {
        int index = -1;
        for (int i = 0; i < animalCount; i++) {
            if (animal.name == animals[i].name)
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



}