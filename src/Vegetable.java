public class Vegetable implements StoreElement {
    private double pricePerPound;
    private double pounds;

    public Vegetable(double pounds, double pricePerPound) {
        this.pricePerPound = pricePerPound;
        this.pounds = pounds;
    }
    @Override
    public String accept(ShopVisitor visitor) {
        return visitor.visit(this);
    }

    @Override
    public double getPrice(){
        return pricePerPound * pounds;
    }

    public double getPounds(){
        return pounds;
    }

}
