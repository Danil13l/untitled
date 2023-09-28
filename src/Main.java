public class Main {
    public static void main(String[] args) {

        String helloWort;
        final int NUM = 20;
        String wort = "30";
        helloWort = NUM + wort;
        System.out.println(helloWort + " " + NUM + " " + wort);

        if (NUM < 0) {
            System.out.println("Вы сохранили отричательное число");
        } else if (NUM > 0) {
            System.out.println("Вы сохранили полажительное число");
        } else {
            System.out.println("Вы сохранили нуль");
        }
    }
}