public class Main {
    public static void main(String[] args) {
        final Shop shop = new Shop();
        for (int i = 1; i <= 10; i++) {
            new Thread(null, shop::sellCar, "Покупатель" + i).start();
        }
        new Thread(null, shop::acceptCar, " Производитель ").start();
    }
}
