public class PriceVisitor implements ShopVisitor {

    @Override
    public String visit(TV tv) {
        double cost = 0;
        //If TV price is over $300, get a 10% discount
        if(tv.getPrice() > 300) {
            cost = tv.getPrice() - (tv.getPrice() * 0.1);
        } else {
            cost = tv.getPrice();
        }
        return String.valueOf(cost);
    }



    @Override
    public String visit(Vegetable veg) {
        double cost = 0;
        //If more than 3 pounds of vegetables are purchased, get a 15% discount
        if(veg.getPounds() > 3) {
            cost = veg.getPrice() - (veg.getPrice() * 0.15);
        } else {
            cost = veg.getPrice();
        }
        return String.valueOf(cost);
    }
}

