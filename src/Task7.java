public class Task7 {

    public static void main(String[] args) {
        Product iceCream = new Product("IceCream", 15.40);
        Product bread = new Product("Bread", 20.0);
        Product milk = new Product("Milk", 44.59);

        ProductCount iceCreakCount = new ProductCount(iceCream, 2);
        ProductCount breadCreakCount = new ProductCount(bread, 1);
        ProductCount milkCreakCount = new ProductCount(milk, 3);

        ProductCount[] productCounts = new ProductCount[]{iceCreakCount, breadCreakCount, milkCreakCount};

        System.out.println("Ціна товарів: " + countPrice(productCounts));
    }

    private static Double countPrice(final ProductCount[] products) {
        double price = 0.0;

        for (ProductCount productCount : products) {
            price += productCount.getProduct().getPrice() * productCount.getCount();
        }

        return price;
    }
}
