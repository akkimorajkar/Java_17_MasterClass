public class Decimal_Comparator {

    public static void main(String[] args) {

        System.out.println(areEqualByThreeDecimalPlaces(-3.123,3.123));

    }

    public static boolean areEqualByThreeDecimalPlaces (double number1 , double number2){

        boolean areEqual = false;

        long convertedNumber1  = (long) (number1 * 1000);
        long convertedNumber2  = (long) (number2 * 1000);

        if (convertedNumber1 == convertedNumber2){

            areEqual =  true;

        }

        return areEqual;


    }


}
