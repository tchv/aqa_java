package app.hw7.task1;

public class FiveWords {
    public static void main( String[] args ) {
        String s = "I love coffee in the morning";
        String[] word = s.split(" ");
        String maxWord = "";
        for (String value : word) {
            if (value.length() >= maxWord.length()) {
                maxWord = value;
            }
        }
        System.out.println("The biggest word in the sentence: '" + maxWord + "' - " + maxWord.length() + " letters");
    }
}
