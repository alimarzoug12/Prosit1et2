import java.util.Scanner;

public class ZooManagement {
    public static void main(String[] args) {

        /*Instruction 1
        int nbrCages = 20;
        String zooName = "my zoo";
        System.out.println(zooName + " comporte " + nbrCages +" cages");*/

        //Instruction 2
        Scanner sc = new Scanner(System.in);
        int nbrCages = sc.nextInt();
        String zooName = sc.next();
        System.out.println(zooName + " comporte " + nbrCages + " cages");

        /*Instruction 3
        on ajoute un scanner :
        on va l'appeler d'après import java.util.Scanner;
        puis on le declare : Scanner sc = new Scanner(System.in);
        et en fin on écrire le variable nbrCages = sc.nextInt() et zooName = sc.next() pour que l'utilisateur peut entrer les données lui seul
         */

        //Instruction 5
        Animal lion = new Animal("lion", "Simba", 3, true);
        Zoo myZoo = new Zoo("Belvedere", "Tunis");

        /* Instruction 6
        le code devient plus cours et plus claire */

        // Instruction 7

        Animal dog = new Animal("dog", "Rex", 2, true);
        Animal cat = new Animal("cat", "gatous", 1, true);

        /* System.out.println(myZoo);
           System.out.println(myZoo.toString());

       on remarque qu'ils sont kifkif
       */

        //Instruction 9

        System.out.println(myZoo);
        System.out.println(myZoo.toString());

        System.out.println(lion);
        System.out.println(lion.toString());

        //Instruction 11

        myZoo.addAnimal(lion);
        int a = myZoo.searchAnimal(lion);

        if (a!=-1){
            System.out.println("l'animal a un indice "+a);
        }
        else{
            System.out.println("l'animal n'a pas été trouvé");
        }

        Animal lion1 = new Animal("lion", "Simba", 3, true);
        int b = myZoo.searchAnimal(lion1);
        if (b!=-1){
            System.out.println("l'animal a un indice "+a);
        }
        else{
            System.out.println("l'animal n'a pas été trouvé");
        }

        /* On remarque que cet animal va étre crée et donc il y a deux animaux des memes paramètres */
        //Instruction 12

        Animal mouse = new Animal("mouse", "jerry", 1, true);

        myZoo.addAnimal(mouse);




    }
}

