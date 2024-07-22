public class Main {
    public static void main(String[] args) {
        int intOperandA = 1;
        int intOperandB = 5;
        int intSum = 0;
        int intProduct = 0;
        int intDifference = 0;
        int intQuotient = 0;
        int intModulo = 0;
        intSum = intOperandA + intOperandB;
        System.out.println("The sum using ints of " + intOperandA + " and " + intOperandB + " is " + intSum);
        intProduct = intOperandA * intOperandB;
        System.out.println("The product using ints of " + intOperandA + " and " + intOperandB + " is " + intProduct);
        intDifference = intOperandA - intOperandB;
        System.out.println("The difference using ints of " + intOperandA + " and " + intOperandB + " is " + intDifference);
        intQuotient = intOperandA / intOperandB;
        System.out.println("The quotient using ints of " + intOperandA + " and " + intOperandB + " is " + intQuotient);
        intModulo = intOperandA % intOperandB;
        System.out.println("The modulo using ints of " + intOperandA + " and " + intOperandB + " is " + intModulo);
        double doubleOperandA = 3.50;
        double doubleOperandB = 2.75;
        double doubleSum = 0.0;
        double doubleProduct = 0.0;
        double doubleDifference = 0.0;
        double doubleQuotient = 0.0;
        doubleSum = doubleOperandA + doubleOperandB;
        System.out.println("The sum using doubles of " + doubleOperandA + " and " + doubleOperandB + " is " + doubleSum);
        doubleProduct = doubleOperandA * doubleOperandB;
        System.out.println("The product using doubles of " + doubleOperandA + " and " + doubleOperandB + " is " + doubleProduct);
        doubleDifference = doubleOperandA - doubleOperandB;
        System.out.println("The difference using doubles of " + doubleOperandA + " and " + doubleOperandB + " is " + doubleDifference);
        doubleQuotient = doubleOperandA / doubleOperandB;
        System.out.println("The quotient using doubles of " + doubleOperandA + " and " + doubleOperandB + " is " + doubleQuotient);

        int numberOfKids = 3;
        int favoriteNumber = 7;
        int shoeSize = 10;
        int birthMonth = 4;
        double myLunchCost = 12.50;
        double priceOfGas = 3.75;
        String isItRaining = "No";
        String fullName = "John Doe";
        System.out.println("The cost of my lunch is: " + myLunchCost);
        System.out.println("The number of kids in my family is: " + numberOfKids);
        System.out.println("Is it raining? " + isItRaining);
        System.out.println("The price of a gallon of gas is: " + priceOfGas);
        System.out.println("My favorite number is: " + favoriteNumber);
        System.out.println("My shoe size is: " + shoeSize);
        System.out.println("My birth month is: " + birthMonth);
        System.out.println("My full name is: " + fullName);
    }
}
