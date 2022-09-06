package app.hw6.task1;

import static app.hw6.task1.MyCollection.myCollection;
import static app.hw6.task1.NewCollection.newCollection;
import static app.hw6.task1.RemoveCollectionInteger.removeCollectionInteger;

public class Main {
    public static void main(String[] args) {
        System.out.println("\n====================[ MY COLLECTION ]====================");
        myCollection();
        System.out.println("\nThe new collection contains integers greater than 5:");
        newCollection();
        System.out.println("\nThere are no integers greater than 20 in the collection:");
        removeCollectionInteger();
        System.out.println("\n======================= * ʕ·ᴥ·ʔ * =======================");
    }
}
