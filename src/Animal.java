public class Animal {
    String family;
    String name;
    int age;
    boolean isMammal;


    // Instriction 7 + 18 -----

    public Animal(String family, String name, int age, boolean isMammal) {
        if (age<0) {
            System.out.println("The age should be positive!");
        }
        else {
            this.family = family;
            this.name = name;
            this.age = age;
            this.isMammal = isMammal;
        }
    }

    @Override
    public String toString() {
        return "Animal{" +
                "family='" + family + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", isMammal=" + isMammal +
                '}';
    }


}