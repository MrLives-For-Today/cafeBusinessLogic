import java.util.ArrayList;
public class CafeUtil {

    // Get Streak Goal method
    public int getStreakGoal() {
        int sum = 0;
        for(int i = 1; i <=10; i++) {
            sum += i;
        }
        return sum;
    }

    // Print Price Chart method
    public String printPriceChart(String productName, double price, int maxNumber) {
        System.out.println(productName);

        String chart = "";

        for(int i = 1; i <= maxNumber; i++) {
            price *= i;
            System.out.println(i + " - " + "$" + price);
            price /= i;
        }
        return chart;
    }

    // Get Order Total method
    public double getOrderTotal(double[] orderPrices) {
        double sum = 0;
        for(double price: orderPrices) {
            sum += price;
        }
        return sum;
    }

    // Display Menu method
    public void displayMenu(ArrayList<String>menuItems, ArrayList<Double>prices) {
        for(int i = 0; i < menuItems.size(); i++) {
            System.out.println(menuItems.get(i) + " - $" + prices.get(i));
        }
    }

    // Add Customer method
    public void addCustomer(ArrayList<String>customers, int numOfCustomers) {
        for (int i = 0; i < numOfCustomers; i++) {
            System.out.println("Please Enter a Name: ");
            String userName = System.console().readLine(); 
            customers.add(userName); 
            System.out.println(customers);
        }
    }
}