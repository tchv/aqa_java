package hw3;

class FlyingBird extends Bird {

    FlyingBird() {
    }

    FlyingBird(String feathers, String layEggs) {
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
        System.out.println(">>> Comment: [Can fly]");
    }
}