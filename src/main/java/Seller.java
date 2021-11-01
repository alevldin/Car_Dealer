public class Seller {
    private Shop shop;

    public Seller(Shop shop) {
        this.shop = shop;
    }

    public void receiveCar() {
        for (int i = 0; i < 10; i++) {
            try {
                Thread.sleep(3000);

                System.out.println(Thread.currentThread().getName() + " выпустил 1 авто ");
                synchronized (this) {
                    shop.getCars().add(new Car());
                    notify();
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public synchronized Car sellCar() {
        try {
            System.out.println(Thread.currentThread().getName() + " зашел в автосалон ");
            while (shop.getCars().size() == 0) {
                System.out.println(" Машин нет ");
                wait();
            }
            Thread.sleep(1000);
            System.out.println(Thread.currentThread().getName() + " уехал на новеньком авто ");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return shop.getCars().remove(0);
    }
}





