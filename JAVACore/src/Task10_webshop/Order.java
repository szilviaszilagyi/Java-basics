package Task10_webshop;

import java.util.Scanner;

/**
 * Kötelezően kell legyen egy makeOrder metódusa, amely információt tárol le a megrendelt termék nevéről valamint annak mennyiségéről.
 */
public class Order implements OrderInterface {
    private String productName;
    private int productCount;

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getProductCount() {
        return productCount;
    }

    public void setProductCount(int productCount) {
        this.productCount = productCount;
    }

    @Override
    public void makeOrder() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Add the product name: ");
        productName = scanner.nextLine();
        System.out.println("Add the quantity: ");
        productCount = Integer.parseInt(scanner.nextLine());
        System.out.println("Cart saved.");

    }
}
