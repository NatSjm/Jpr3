public class Main {
    public static void main(String[] args) {

        Dog dogBobik = new Dog("Бобік");
        Cat catBarsik = new Cat("Барсік");
        Dog dogRex = new Dog("Рекс");
        Dog dogOskar = new Dog("Оскар");

        dogBobik.run(150);
        dogBobik.swim(5);
        dogRex.run(600);
        catBarsik.run(199);
        catBarsik.swim(3);

        System.out.println("Кількість собак: " + Dog.getTotalCount());
        System.out.println("Кількість котів: " + Cat.getTotalCount());
        System.out.println("Кількість всіх тварин: " + Animal.getTotalAnimals());
    }
}