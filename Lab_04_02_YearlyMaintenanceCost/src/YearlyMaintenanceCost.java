public class YearlyMaintenanceCost {
    public static void main(String[] args) {
        int springCost = 250;
        int summerCost = 250;
        int fallCost = 400;
        int winterCost = 750;
        int yearlyCost = 0;
        yearlyCost = springCost + summerCost + fallCost + winterCost;
        System.out.println("Your seasonal maintenance costs (Spring: " + springCost + ", Summer: " + summerCost + ", Fall: " + fallCost + ", and Winter: " + winterCost + ") add up to a total yearly cost of " + yearlyCost + ".");
    }
}