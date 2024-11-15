package avm.products;

/**
 * AIT-TR, Cohort 42.1, Java Basic, Project AVM/Hypermarket
 * @author Mukhlis/Andrey
 * @version Apr-2024
 */

// In this class we show the methods associated with the market products class
public class MarketProduct extends BaseProduct {

    public MarketProduct(MarketProduct product) {
        super(product.getName(), product.getQuantity(), product.getPrice());
    }

    public MarketProduct(Integer id, String name, int quantity, float price) {
        super(name, quantity, price);
        this.id = id;
    }

    public MarketProduct(String name, int quantity, float price) {
        super(name, quantity, price);
    }

    @Override
    public String toString() {
        return "[id: " + id +
                ", Product: " + name +
                ", Quan-ty: " + quantity +
                ", Price " + price + " EUR" + "]";
    }
}
