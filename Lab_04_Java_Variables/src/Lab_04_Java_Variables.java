public class Lab_04_Java_Variables {
    public static void main(String[] args)
    {
        int intOperandA = 7;
        int intOperandB = 2;
        int intSum = 0;
        int intProduct = 0;
        int intDifference = 0;
        int intQuotient = 0;
        int intModulo = 0;

        double doubleOperandA = 7.50;
        double doubleOperandB = 1.25;
        double doubleSum = 0;
        double doubleProduct = 0;
        double doubleDifference = 0;
        double doubleQuotient = 0;
        double doubleModulo = 0;

        intSum = intOperandA + intOperandB;
        intProduct = intOperandA * intOperandB;
        intDifference = intOperandA - intOperandB;
        intQuotient = intOperandA / intOperandB;
        intModulo = intOperandA % intOperandB;

        doubleSum = doubleOperandA + doubleOperandB;
        doubleProduct = doubleOperandA * doubleOperandB;
        doubleDifference = doubleOperandA - doubleOperandB;
        doubleQuotient = doubleOperandA / doubleOperandB;
        doubleModulo = doubleOperandA % doubleOperandB;

        System.out.println("The sum of " + intOperandA + " and " + intOperandB + " equals: " + intSum);
        System.out.println("The product of " + intOperandA + " times " + intOperandB + " equals: " + intProduct);
        System.out.println("The difference of " + intOperandA + " minus " + intOperandB + " equals: " + intDifference);
        System.out.println("The quotient of " + intOperandA + " divided by " + intOperandB + " equals: " + intQuotient);
        System.out.println("The remainder of " + intOperandA + " divided by " + intOperandB + " equals: " + intModulo);
        System.out.println("The sum of " + doubleOperandA + " and " + doubleOperandB + " equals: " + doubleSum);
        System.out.println("The product of " + doubleOperandA + " times " + doubleOperandB + " equals: " + doubleProduct);
        System.out.println("The difference of " + doubleOperandA + " minus " + doubleOperandB + " equals: " + doubleDifference);
        System.out.println("The quotient of " + doubleOperandA + " divided by " + doubleOperandB + " equals: " + doubleQuotient);
        System.out.println("The remainder of " + doubleOperandA + " divided by " + doubleOperandB + " equals: " + doubleModulo);

        // Various Variables
        int familyKids = 2;
        boolean isRaining = false;
        double gasGallon = 3.05;
        int favNumber = 8;
        int shoeSize = 12;
        int birthMonth = 05;
        String fullName = "Hunter Blake Jackson";
        System.out.println("There are " + familyKids + " kids in the family.");
        System.out.println("Is it raining? " + isRaining);
        System.out.println("The price of a gallon of gas is " + gasGallon);
        System.out.println("My favorite number is " + favNumber);
        System.out.println("My shoe size is " + shoeSize);
        System.out.println("My full name is " + fullName);

    }
}