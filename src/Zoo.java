public class Zoo {
    Animal[] animals;
    String city;
    String name;
    int nbrCages;
    int animalCount = 0;


    public Zoo(String name, String city, int nbrCages) {
        Animal[] animals = new Animal[25];
        this.name = name;
        this.city = city;
        this.nbrCages = nbrCages;
    }

    // Instriction 8 -----

    public void displayZoo() {
        System.out.println("Name : " + name);
        System.out.println("City : " + city);
        System.out.println("Nombre des Cages : " + nbrCages);

    }

    // Instruction 10

    public boolean addAnimal(Animal animal) {
        if (animalCount < 25) {
            animals[animalCount] = animal;
            animalCount++;
            return true;
        } else {
            return false;
        }
    }

    //Instruction 11

    public void afficheAnimal() {
        System.out.println("Les animaux dans le zoo sont :");
        for (int i = 0; i < animalCount; i++) {
            System.out.println(animals[i].name);
        }
    }

    public int searchAnimal(Animal animal) {
        for (int i = 0; i < animalCount; i++) {
            if (animals[i].name.equals(animal.name)) {
                return i;
            }
        }
        return -1;
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
        for (int i = 0; i < animalCount; i++) {
            if (animals[i].name.equals(animal.name)) {
                for (int j = i; j < animalCount ; j++) {
                    animals[j] = animals[j + 1];
                    animals[j + 1] = null;
                    animalCount--;
                    return true;
                }
            }

        }
        return false;
    }







}