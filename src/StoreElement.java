public interface StoreElement {
    String accept(ShopVisitor visitor);

     double getPrice();
}
