public class TV implements StoreElement {
    private int price;

    public TV(int price) {
        this.price = price;
    }
    @Override
    public String accept(ShopVisitor visitor) {
        return visitor.visit(this);
    }

    @Override
    public double getPrice() {
        return price;
    }
}
