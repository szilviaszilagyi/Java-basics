package Task10_webshop;

import java.util.Random;

/**
 * Számolja ki a fizetendő összeget
 */
public class PaymentService {
    public int getPrice() {
        Random random = new Random();
        int price = random.nextInt(10000)+1;
        return price;
    }

}
