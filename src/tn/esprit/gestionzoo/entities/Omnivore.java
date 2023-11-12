package tn.esprit.gestionzoo.entities;

//Instruction 35--s
public interface Omnivore <T> extends Carnivore<T>, Herbivore<T>{
    void eatPlantAndMeat(T food);
}
