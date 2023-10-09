public class Dog extends Animal {
    private static int totalCount;
    private static final int MAX_RUN_DISTANCE = 500;
    private static final int MAX_SWIM_DISTANCE = 10;

    public Dog(String name) {
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

    public void swim(int distance) {
        if (distance <= MAX_SWIM_DISTANCE) {
            super.swim(distance);
        } else {
            System.out.println(getName() + " не може проплити " + distance + " м");
        }
    }
}

