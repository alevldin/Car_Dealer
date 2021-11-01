import java.util.ArrayList;
import java.util.List;

public class Shop {
    Seller seller = new Seller(this);
    private final List<Car> cars = new ArrayList<>(10);

    public Car sellCar() {
        return seller.sellCar();
    }

    public void acceptCar() {
        seller.receiveCar();
    }

    public List<Car> getCars() {
        return cars;
    }
}


