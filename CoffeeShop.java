public class CoffeeShop {
    public static void main(String[] args) {

        CoffeeOrder order1 = new CoffeeOrder();
        CoffeeOrder order2 = new CoffeeOrder("large");
        CoffeeOrder order3 = new CoffeeOrder("small", "black");

        System.out.println(order1.describeOrder());
        System.out.println(order2.describeOrder());
        System.out.println(order3.describeOrder());

        System.out.println(CoffeeOrder.getTotalOrders());
    }
}