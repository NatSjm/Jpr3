public class Cat extends Animal {
    private static int totalCount;
    private static final int MAX_RUN_DISTANCE = 200;

    public Cat(String name) {
        super(name);
        totalCount++;
    }

    public static int getTotalCount() {
        return totalCount;
    }

    public void run(int distance) {
        if (distance <= MAX_RUN_DISTANCE) {
            super.run(distance);
        } else {
            System.out.println(getName() + " не може пробігти " + distance + " м");
        }
    }

    @Override
    public void swim(int distance) {
        System.out.println(getName() + " не вміє плавати");
    }
}
