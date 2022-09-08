package app.hw6.task1;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class MyCollection {

    private List<Integer> array;

    public List<Integer> getArray() {
        return array;
    }

    public void setArray(List<Integer> array) {
        this.array = array;
    }

    public MyCollection() {
        array = new ArrayList<>();
    }

    static List<Integer> fillRandom(int size, int maxBound) {
        List<Integer> result = new ArrayList<Integer>();
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            Integer num = random.nextInt() % (maxBound + 1);
            result.add(num);
        }
        return result;
    }

    public List<Integer> getPositionsAboveValue(int value) {
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < array.size(); i++) {
            if (array.get(i) >= value) {
                result.add(i);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println("\n=========================[ MY COLLECTION ]=========================");

        MyCollection myCollection = new MyCollection();
        myCollection.setArray(fillRandom(10, 25));
        System.out.println(myCollection.getArray());

        System.out.println("\nFind and save in list all positions of element more than 5:");

        List<Integer> newCollection = myCollection.getPositionsAboveValue(5);
        System.out.println(newCollection);

        System.out.println("\nThere are no integers greater than 20 in the collection:");

        List<Integer> nextCollection = myCollection.getArray().stream()
                .filter(element -> element <= 20).sorted().collect(Collectors.toList());
        System.out.println(nextCollection);

        System.out.println("\n============================ * ʕ·ᴥ·ʔ * ============================");
    }
}
