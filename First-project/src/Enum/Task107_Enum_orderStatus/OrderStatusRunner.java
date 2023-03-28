package Enum.Task107_Enum_orderStatus;

import java.util.Random;
/** OKTATÓIBAN MÁSIK KÉT MEGOLDÁS VAN4!!! */
public class OrderStatusRunner {
    public static void main(String[] args) {
        Random randomNum = new Random();
        int orderStatus = randomNum.nextInt(4) + 1;
        String prefix = "Your order is currently ";

        switch (orderStatus) {
            case 1:
                System.out.println(prefix + OrderStatus.ACCEPTED + " and waiting for the payment.");
                break;
            case 2:
                System.out.println(prefix + OrderStatus.PAYED + " and waiting for the transit.");
                break;
            case 3:
                System.out.println(prefix + OrderStatus.TRANSIT + " and waiting for the delivery partner.");
                break;
            case 4:
                System.out.println(prefix + OrderStatus.DELIVERED + " the courier service will look for it.");
                break;

        }


    }
}
