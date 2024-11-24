// Class for Restaurant
class Restaurant {
    private String name;
    private String location;

    public Restaurant(String name, String location) {
        this.name = name;
        this.location = location;
    }

    public void displayInfo() {
        System.out.println("Restaurant: " + name + ", Location: " + location);
    }
}

// Main class
public class RestaurantManagementSystem {
    public static void main(String[] args) {
        Restaurant restaurant = new Restaurant("The Food Place", "Downtown");
        restaurant.displayInfo();
    }
}
