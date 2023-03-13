package study.ex01.singleton;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class StateFulService {

    private int price;
//    public void order(String name, int price) {
//        System.out.println("name = " + name + "price = "+ price);
//        this.price = price;
//    }

    public int order(String name, int price) {
        System.out.println("name = " + name + "price = "+ price);
        this.price = price;
        return price;
    }

    public int getPrice() {
        return price;
    }


}
