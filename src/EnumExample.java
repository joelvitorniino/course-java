import entities.OrderExample;
import entities.enums.OrderStatus;

import java.util.Date;

public class EnumExample {
    public static void main(String[] args) {
        OrderExample order = new OrderExample(1080, new Date(), OrderStatus.PENDING_PAYMENT);

        System.out.println(order);

        OrderStatus os1 = OrderStatus.DELIVERED;

        OrderStatus os2 = OrderStatus.valueOf("DELIVERED");

        System.out.println(os1);
        System.out.println(os2);
    }
}
