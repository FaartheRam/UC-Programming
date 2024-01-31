public class Main {
    public static void main(String[] args) {
        int springCost = 250;
        int summerCost = 250;
        int fallCost = 400;
        int winterCost = 750;
        int yearlyCost = springCost + summerCost + fallCost + winterCost;
        System.out.println("Your seasonal maintenance costs (spring: " + springCost + ", summer: " + summerCost + ", fall: " + fallCost + ", and winter: " + winterCost + ") add up to a total yearly cost of " + yearlyCost + ".");
    }
}