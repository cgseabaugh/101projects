public class Example{


    public static void main(String args[]){

        Person student1 = new Person("Gabe",30);
        Person student2 = new Person("Sandy",33);
        Person student3 = new Person("Roger",21);
        Person student4 = new Person("Percy",17);

        Animal animal1 = new Animal("Bindi", "Dog");
        Animal animal2 = new Animal("Leo", "Lion");
        Animal animal3 = new Animal("Phoebe", "Dog");
        Animal animal4 = new Animal ("Geoff", "Falcon");

        animal1.attacks(student1.getName());
        animal2.attacks(student2.getName());
        animal3.attacks(student3.getName());
        animal4.attacks(student4.getName());

        student1.printP();
        student2.printP();
        student3.printP();
        student4.printP();

    }

}