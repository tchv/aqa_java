package app.hw3.task1;

class NonFlyingBird extends Bird {

    NonFlyingBird() {
    }

    NonFlyingBird(String feathers, String layEggs) {
        setFeathers(feathers);
        setLayEggs(layEggs);
    }

    public void setFeathers(String feathers) {
        this.feathers = feathers;
    }

    public void setLayEggs(String layEggs) {
        this.layEggs = layEggs;
    }

    @Override
    void fly() {
        System.out.println(">>> Comment: [Can not fly]");
    }
}
