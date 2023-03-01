package study.ex01.order;

public interface OrderService {
    Order createOrder(Long memberID, String itemName, int itemPrice);
}
