package uni.due.Generic;

import java.util.ArrayList;
import java.util.List;

public class SellTest {
    public static void main(String[] args) {
        List<Books> book= new ArrayList<Books>();
        book.add(new Books());
        book.add(new Books());

        List<Car> cars= new ArrayList<Car>();
        cars.add(new Car());
        cars.add(new Car());

        List<Piano> pianos= new ArrayList<Piano>();
        pianos.add(new Piano());
        pianos.add(new Piano());

        GoodsSeller seller= new GoodsSeller();
        seller.sellGoods(book);
        seller.sellGoods(cars);
        seller.sellGoods(pianos);
    }
}
