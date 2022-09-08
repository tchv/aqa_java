package app.other;

public class MyHappiness {
    public static void main(String[] args) {
        char[] s = {'С', 'р', 'а', 'к', 'а'};
        String str = new String(s);
        System.out.println("Було  : " + str);
        String rStr = str.replace("Срака", "Щастя");
        System.out.println("Стало : " + rStr);
        if (str.equals("Срака")) {
            System.out.println("Вітаю, у вас Щастя!");
        } else {
            System.out.println("Перевірте слово Срака");
        }
    }
}

