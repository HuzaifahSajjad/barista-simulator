public class CoffeeOrder {
    String size;
    String type;
    private String orderID;
    static int totalOrders = 0;

    CoffeeOrder(){
        this.size = "medium";
        this.type = "black";
        totalOrders++;
    }

    CoffeeOrder(String size){
        this.size = size;
        this.type = "black";
        totalOrders++;
    }

    CoffeeOrder(String size, String type){
        this.size = size;
        this.type = type;
        totalOrders++;
    }

    String describeOrder(){
        return "Order: " + this.size + " " + this.type;
    }

    static int getTotalOrders(){
        return totalOrders;
    }
}