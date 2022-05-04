public class LunchOrder {
    
    private double hamburgerValue;
    private double saladValue;
    private double friesValue;
    private double sodaValue;

    public LunchOrder(double hamburgers, double salads, double frenchFries, double sodas){
        hamburgerValue =1.85 * hamburgers;
        saladValue = 2.00 * salads;
        friesValue = 1.30 * frenchFries;
        sodaValue = 0.95 * sodas;
    }

    public double value(){
        return hamburgerValue+saladValue+friesValue+sodaValue;
    }
}
