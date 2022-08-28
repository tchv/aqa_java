package app.hw3.task1;

abstract class Bird {
    public String feathers;
    public String layEggs;

    public String toString() {
        return "\nBird feathers: [" + feathers + "] | Question: [Can bird lay eggs?] | Result: [" + layEggs + "]";
    }

    abstract void fly();
}
