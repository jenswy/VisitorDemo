import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ArrayList<StoreElement> items = new ArrayList<>(Arrays.asList(new TV(450),
               new Vegetable(2.5, 3.5), new TV(250),
               new Vegetable(3.1, 4.5)));

        System.out.println("Before: $" + calcCostBefore(items));
        System.out.println("After: $" + calcCostAfter(items));


    }

    private static double calcCostBefore(ArrayList<StoreElement> items) {
        double sum = 0;
        for(StoreElement item: items) {
            if(item instanceof TV) {
                //If TV price is over $300, get a 10% discount
                if(item.getPrice() > 300) {
                    sum += item.getPrice() - (item.getPrice() * 0.1);
                } else {
                    sum += item.getPrice();
                }
            }
            if(item instanceof Vegetable) {
                //If more than 3 pounds of vegetables are purchased, get a 15% discount
                if(((Vegetable) item).getPounds() > 3) {
                    sum += item.getPrice() - (item.getPrice() * 0.15);
                } else {
                    sum += item.getPrice();
                }
            }
        }
        //Would have to add even more conditions for more items...
        return sum;
    }

    private static double calcCostAfter(ArrayList<StoreElement> items) {
        ShopVisitor visitor = new PriceVisitor();
        double sum = 0;
        for(StoreElement item: items) {
            sum += Double.parseDouble(item.accept(visitor));
        }
        return sum;
    }
}


