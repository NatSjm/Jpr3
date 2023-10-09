public abstract class Animal {
    private static int totalAnimals;
    private String name;


    public Animal(String name) {
        this.name = name;
        totalAnimals++;
    }

    public void run(int distance) {
        System.out.println(name + " пробіг " + distance + " м");
    }

    public void swim(int distance) {
        System.out.println(name + " проплив " + distance + " м");
    }

    public static int getTotalAnimals() {
        return totalAnimals;
    }

    public String getName() {
        return name;
    }

}
