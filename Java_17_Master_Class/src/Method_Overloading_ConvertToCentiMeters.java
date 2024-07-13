public class Method_Overloading_ConvertToCentiMeters {

    public static void main(String[] args) {

        System.out.println(converToCentimeters(68));
        System.out.println(converToCentimeters(5 ,8));

    }

    public static double converToCentimeters(int heightInInches){

        return  heightInInches * 2.54;

    }

    public static double converToCentimeters(int heightInFeet, int heightInInches){

        return  converToCentimeters(heightInInches) + (heightInFeet * 30.48);

    }

}
