public class Main {

    public static void main(String[] args) {
	double summerCost = 100.25;
    double fallCost = 125.00;
    double winterCost = 150.75;
    double springCost = 130.50;
    double yearlyCost = 0;
    System.out.println("If your maintenance cost for the summer is " + summerCost);
    System.out.println("If your maintenance cost for the fall is " + fallCost);
    System.out.println("If your maintenance cost for the winter is " + winterCost);
    System.out.println("If your maintenance cost for the spring is " + springCost);
    yearlyCost = fallCost + summerCost + winterCost + springCost;
    System.out.println("Then your yearly maintenance cost is " + yearlyCost);
    }
}
